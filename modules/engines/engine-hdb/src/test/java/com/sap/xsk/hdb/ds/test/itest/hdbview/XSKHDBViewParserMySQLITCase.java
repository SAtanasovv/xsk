/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.test.itest.hdbview;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.sap.xsk.hdb.ds.api.XSKDataStructuresException;
import com.sap.xsk.hdb.ds.facade.IXSKHDBCoreFacade;
import com.sap.xsk.hdb.ds.test.itest.module.XSKHDBTestContainersModule;
import org.eclipse.dirigible.core.scheduler.api.SynchronizationException;
import org.eclipse.dirigible.repository.local.LocalResource;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.sap.xsk.hdb.ds.test.itest.utils.TestContainerConstants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class XSKHDBViewParserMySQLITCase {

  private static MySQLContainer jdbcContainer;
  private static Connection connection;
  private static IXSKHDBCoreFacade facade;


  @BeforeClass
  public static void setUp() throws SQLException {
    jdbcContainer =
        new MySQLContainer<>(HDBVIEW_MYSQL_DOCKER_IMAGE);
    jdbcContainer.start();
    Injector injector = Guice.createInjector(new XSKHDBTestContainersModule(jdbcContainer));
    connection = injector.getInstance(DataSource.class).getConnection();
    facade = injector.getInstance(Key.get(IXSKHDBCoreFacade.class, Names.named("xskHDBCoreFacade")));
  }

  @AfterClass
  public static void cleanUp() throws SQLException {
    Statement stmt = connection.createStatement();
    stmt.executeUpdate(HDBVIEW_MYSQL_DROP_TABLE1_SQL);
    stmt.executeUpdate(HDBVIEW_MYSQL_DROP_MY_VIEW1_SQL);
  }

  @Test
  public void testHDBViewCreate() throws XSKDataStructuresException, SynchronizationException, IOException, SQLException {
    LocalResource resource = XSKHDBTestContainersModule.getResources(HDBVIEW_MYSQL_ROOT_FOLDER,
        HDBVIEW_MYSQL_REPO_PATH,
        HDBVIEW_MYSQL_RELATIVE_RESOURCES_PATH);
    Statement stmt = connection.createStatement();
    stmt.executeUpdate(HDBVIEW_MYSQL_CREATE_TABLE1_SQL);
    stmt.executeUpdate(HDBVIEW_MYSQL_CREATE_MY_VIEW1_SQL);

    this.facade.handleResourceSynchronization(resource);
    this.facade.updateEntities();

    ResultSet rs = stmt.executeQuery(String.format("SELECT COUNT(*) as rawsCount FROM %s",HDBVIEW_MYSQL_EXPECTED_VIEW_NAME));
    assertTrue(rs.next());
    assertEquals(HDBVIEW_MYSQL_EXPECTED_CREATED_RAWS_COUNT, rs.getInt("rawsCount"));
    stmt.executeUpdate(String.format("DROP VIEW %s", HDBVIEW_MYSQL_EXPECTED_VIEW_NAME));
  }
}
