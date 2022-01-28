/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.bimodelcalculation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.sap.ndb.bimodelcalculation package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _Scenario_QNAME = new QName("http://www.sap.com/ndb/BiModelCalculation.ecore", "scenario");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.ndb.bimodelcalculation
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link CalculationScenario }
   */
  public CalculationScenario createCalculationScenario() {
    return new CalculationScenario();
  }

  /**
   * Create an instance of {@link DataSources }
   */
  public DataSources createDataSources() {
    return new DataSources();
  }

  /**
   * Create an instance of {@link CalculationViews }
   */
  public CalculationViews createCalculationViews() {
    return new CalculationViews();
  }

  /**
   * Create an instance of {@link ViewAttributes }
   */
  public ViewAttributes createViewAttributes() {
    return new ViewAttributes();
  }

  /**
   * Create an instance of {@link CalculatedViewAttributes }
   */
  public CalculatedViewAttributes createCalculatedViewAttributes() {
    return new CalculatedViewAttributes();
  }

  /**
   * Create an instance of {@link ViewAttribute }
   */
  public ViewAttribute createViewAttribute() {
    return new ViewAttribute();
  }

  /**
   * Create an instance of {@link CalculatedViewAttribute }
   */
  public CalculatedViewAttribute createCalculatedViewAttribute() {
    return new CalculatedViewAttribute();
  }

  /**
   * Create an instance of {@link DataSource }
   */
  public DataSource createDataSource() {
    return new DataSource();
  }

  /**
   * Create an instance of {@link CalculationView }
   */
  public CalculationView createCalculationView() {
    return new CalculationView();
  }

  /**
   * Create an instance of {@link Input }
   */
  public Input createInput() {
    return new Input();
  }

  /**
   * Create an instance of {@link ProjectionView }
   */
  public ProjectionView createProjectionView() {
    return new ProjectionView();
  }

  /**
   * Create an instance of {@link RankView }
   */
  public RankView createRankView() {
    return new RankView();
  }

  /**
   * Create an instance of {@link WindowFunction }
   */
  public WindowFunction createWindowFunction() {
    return new WindowFunction();
  }

  /**
   * Create an instance of {@link RankingFilter }
   */
  public RankingFilter createRankingFilter() {
    return new RankingFilter();
  }

  /**
   * Create an instance of {@link Order }
   */
  public Order createOrder() {
    return new Order();
  }

  /**
   * Create an instance of {@link JoinView }
   */
  public JoinView createJoinView() {
    return new JoinView();
  }

  /**
   * Create an instance of {@link JoinAttribute }
   */
  public JoinAttribute createJoinAttribute() {
    return new JoinAttribute();
  }

  /**
   * Create an instance of {@link UnionView }
   */
  public UnionView createUnionView() {
    return new UnionView();
  }

  /**
   * Create an instance of {@link MinusView }
   */
  public MinusView createMinusView() {
    return new MinusView();
  }

  /**
   * Create an instance of {@link IntersectView }
   */
  public IntersectView createIntersectView() {
    return new IntersectView();
  }

  /**
   * Create an instance of {@link AggregationView }
   */
  public AggregationView createAggregationView() {
    return new AggregationView();
  }

  /**
   * Create an instance of {@link TableFunctionView }
   */
  public TableFunctionView createTableFunctionView() {
    return new TableFunctionView();
  }

  /**
   * Create an instance of {@link RestrictedViewAttributes }
   */
  public RestrictedViewAttributes createRestrictedViewAttributes() {
    return new RestrictedViewAttributes();
  }

  /**
   * Create an instance of {@link RestrictedViewAttribute }
   */
  public RestrictedViewAttribute createRestrictedViewAttribute() {
    return new RestrictedViewAttribute();
  }

  /**
   * Create an instance of {@link MultiViewAttributes }
   */
  public MultiViewAttributes createMultiViewAttributes() {
    return new MultiViewAttributes();
  }

  /**
   * Create an instance of {@link GraphView }
   */
  public GraphView createGraphView() {
    return new GraphView();
  }

  /**
   * Create an instance of {@link Output }
   */
  public Output createOutput() {
    return new Output();
  }

  /**
   * Create an instance of {@link AttributeMapping }
   */
  public AttributeMapping createAttributeMapping() {
    return new AttributeMapping();
  }

  /**
   * Create an instance of {@link ConstantAttributeMapping }
   */
  public ConstantAttributeMapping createConstantAttributeMapping() {
    return new ConstantAttributeMapping();
  }

  /**
   * Create an instance of {@link NonEquiJoinView }
   */
  public NonEquiJoinView createNonEquiJoinView() {
    return new NonEquiJoinView();
  }

  /**
   * Create an instance of {@link NonEquiJoinAttribute }
   */
  public NonEquiJoinAttribute createNonEquiJoinAttribute() {
    return new NonEquiJoinAttribute();
  }

  /**
   * Create an instance of {@link HierarchyView }
   */
  public HierarchyView createHierarchyView() {
    return new HierarchyView();
  }

  /**
   * Create an instance of {@link AnonymizeView }
   */
  public AnonymizeView createAnonymizeView() {
    return new AnonymizeView();
  }

  /**
   * Create an instance of {@link AnonymizeParameterization }
   */
  public AnonymizeParameterization createAnonymizeParameterization() {
    return new AnonymizeParameterization();
  }

  /**
   * Create an instance of {@link QidColumn }
   */
  public QidColumn createQidColumn() {
    return new QidColumn();
  }

  /**
   * Create an instance of {@link QidColumnHierarchy }
   */
  public QidColumnHierarchy createQidColumnHierarchy() {
    return new QidColumnHierarchy();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CalculationScenario }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link CalculationScenario }{@code >}
   */
  @XmlElementDecl(namespace = "http://www.sap.com/ndb/BiModelCalculation.ecore", name = "scenario")
  public JAXBElement<CalculationScenario> createScenario(CalculationScenario value) {
    return new JAXBElement<CalculationScenario>(_Scenario_QNAME, CalculationScenario.class, null, value);
  }

}
