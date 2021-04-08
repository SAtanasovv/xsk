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


package com.sap.ndb.bimodelcalculation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnonymizeMethod.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnonymizeMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="kAnonymity"/&gt;
 *     &lt;enumeration value="differentialPrivacy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AnonymizeMethod")
@XmlEnum
public enum AnonymizeMethod {

  @XmlEnumValue("kAnonymity")
  K_ANONYMITY("kAnonymity"),
  @XmlEnumValue("differentialPrivacy")
  DIFFERENTIAL_PRIVACY("differentialPrivacy");
  private final String value;

  AnonymizeMethod(String v) {
    value = v;
  }

  public static AnonymizeMethod fromValue(String v) {
    for (AnonymizeMethod c : AnonymizeMethod.values()) {
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
