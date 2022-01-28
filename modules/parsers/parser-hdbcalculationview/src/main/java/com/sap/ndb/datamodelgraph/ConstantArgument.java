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


package com.sap.ndb.datamodelgraph;

import com.sap.ndb.datamodeltype.PrimitiveType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstantArgument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConstantArgument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="datatype" use="required" type="{http://www.sap.com/ndb/DataModelType.ecore}PrimitiveType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstantArgument")
public class ConstantArgument {

  @XmlAttribute(name = "value", required = true)
  protected String value;
  @XmlAttribute(name = "datatype", required = true)
  protected PrimitiveType datatype;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the datatype property.
   *
   * @return possible object is
   * {@link PrimitiveType }
   */
  public PrimitiveType getDatatype() {
    return datatype;
  }

  /**
   * Sets the value of the datatype property.
   *
   * @param value allowed object is
   *              {@link PrimitiveType }
   */
  public void setDatatype(PrimitiveType value) {
    this.datatype = value;
  }

}
