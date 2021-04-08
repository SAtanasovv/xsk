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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Descriptions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Descriptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.sap.com/ndb/BaseModelBase.ecore}CommentProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="defaultDescription" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Description" default=" " /&gt;
 *       &lt;attribute name="textType" type="{http://www.sap.com/ndb/BaseModelBase.ecore}TextType" /&gt;
 *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Descriptions", propOrder = {
    "comment"
})
public class Descriptions {

  protected CommentProperties comment;
  @XmlAttribute(name = "defaultDescription")
  protected String defaultDescription;
  @XmlAttribute(name = "textType")
  protected TextType textType;
  @XmlAttribute(name = "maxLength")
  protected Integer maxLength;

  /**
   * Gets the value of the comment property.
   *
   * @return possible object is
   * {@link CommentProperties }
   */
  public CommentProperties getComment() {
    return comment;
  }

  /**
   * Sets the value of the comment property.
   *
   * @param value allowed object is
   *              {@link CommentProperties }
   */
  public void setComment(CommentProperties value) {
    this.comment = value;
  }

  /**
   * Gets the value of the defaultDescription property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultDescription() {
    if (defaultDescription == null) {
      return " ";
    } else {
      return defaultDescription;
    }
  }

  /**
   * Sets the value of the defaultDescription property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultDescription(String value) {
    this.defaultDescription = value;
  }

  /**
   * Gets the value of the textType property.
   *
   * @return possible object is
   * {@link TextType }
   */
  public TextType getTextType() {
    return textType;
  }

  /**
   * Sets the value of the textType property.
   *
   * @param value allowed object is
   *              {@link TextType }
   */
  public void setTextType(TextType value) {
    this.textType = value;
  }

  /**
   * Gets the value of the maxLength property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getMaxLength() {
    return maxLength;
  }

  /**
   * Sets the value of the maxLength property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setMaxLength(Integer value) {
    this.maxLength = value;
  }

}
