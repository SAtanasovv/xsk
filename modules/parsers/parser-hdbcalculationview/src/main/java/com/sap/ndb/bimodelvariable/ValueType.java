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


package com.sap.ndb.bimodelvariable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="UnitOfMeasure"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="AttributeValue"/&gt;
 *     &lt;enumeration value="StaticList"/&gt;
 *     &lt;enumeration value="FuzzyTextSearch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ValueType")
@XmlEnum
public enum ValueType {

  @XmlEnumValue("empty")
  EMPTY("empty"),
  @XmlEnumValue("Currency")
  CURRENCY("Currency"),
  @XmlEnumValue("UnitOfMeasure")
  UNIT_OF_MEASURE("UnitOfMeasure"),
  @XmlEnumValue("Date")
  DATE("Date"),
  @XmlEnumValue("AttributeValue")
  ATTRIBUTE_VALUE("AttributeValue"),
  @XmlEnumValue("StaticList")
  STATIC_LIST("StaticList"),
  @XmlEnumValue("FuzzyTextSearch")
  FUZZY_TEXT_SEARCH("FuzzyTextSearch");
  private final String value;

  ValueType(String v) {
    value = v;
  }

  public static ValueType fromValue(String v) {
    for (ValueType c : ValueType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }

}
