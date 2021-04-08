/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_REGULAR"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_ALL"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_CALCULATED"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_YEARS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_HALF_YEAR"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_QUARTERS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_MONTHS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_WEEKS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_DAYS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_HOURS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_MINUTES"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_SECONDS"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_TIME_UNDEFINED"/&gt;
 *     &lt;enumeration value="MDLEVEL_TYPE_UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "LevelType")
@XmlEnum
public enum LevelType {

  MDLEVEL_TYPE_REGULAR,
  MDLEVEL_TYPE_ALL,
  MDLEVEL_TYPE_CALCULATED,
  MDLEVEL_TYPE_TIME,
  MDLEVEL_TYPE_TIME_YEARS,
  MDLEVEL_TYPE_TIME_HALF_YEAR,
  MDLEVEL_TYPE_TIME_QUARTERS,
  MDLEVEL_TYPE_TIME_MONTHS,
  MDLEVEL_TYPE_TIME_WEEKS,
  MDLEVEL_TYPE_TIME_DAYS,
  MDLEVEL_TYPE_TIME_HOURS,
  MDLEVEL_TYPE_TIME_MINUTES,
  MDLEVEL_TYPE_TIME_SECONDS,
  MDLEVEL_TYPE_TIME_UNDEFINED,
  MDLEVEL_TYPE_UNKNOWN;

  public static LevelType fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
