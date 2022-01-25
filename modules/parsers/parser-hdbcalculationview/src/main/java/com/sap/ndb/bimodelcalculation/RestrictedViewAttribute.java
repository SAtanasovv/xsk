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

import com.sap.ndb.bimodelprivilege.Restriction;
import com.sap.ndb.datamodeltype.ExpressionLanguage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RestrictedViewAttribute complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RestrictedViewAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelCalculation.ecore}ViewAttribute"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="restriction" type="{http://www.sap.com/ndb/BiModelPrivilege.ecore}Restriction" maxOccurs="unbounded"/&gt;
 *         &lt;element name="restrictionExpression" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Expression"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="restrictionExpressionLanguage" type="{http://www.sap.com/ndb/DataModelType.ecore}ExpressionLanguage" /&gt;
 *       &lt;attribute name="baseViewAttribute" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedViewAttribute", propOrder = {
    "restriction",
    "restrictionExpression"
})
public class RestrictedViewAttribute
    extends ViewAttribute {

  protected List<Restriction> restriction;
  protected String restrictionExpression;
  @XmlAttribute(name = "restrictionExpressionLanguage")
  protected ExpressionLanguage restrictionExpressionLanguage;
  @XmlAttribute(name = "baseViewAttribute", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String baseViewAttribute;

  /**
   * Gets the value of the restriction property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the restriction property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRestriction().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Restriction }
   */
  public List<Restriction> getRestriction() {
    if (restriction == null) {
      restriction = new ArrayList<Restriction>();
    }
    return this.restriction;
  }

  /**
   * Gets the value of the restrictionExpression property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getRestrictionExpression() {
    return restrictionExpression;
  }

  /**
   * Sets the value of the restrictionExpression property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setRestrictionExpression(String value) {
    this.restrictionExpression = value;
  }

  /**
   * Gets the value of the restrictionExpressionLanguage property.
   *
   * @return possible object is
   * {@link ExpressionLanguage }
   */
  public ExpressionLanguage getRestrictionExpressionLanguage() {
    return restrictionExpressionLanguage;
  }

  /**
   * Sets the value of the restrictionExpressionLanguage property.
   *
   * @param value allowed object is
   *              {@link ExpressionLanguage }
   */
  public void setRestrictionExpressionLanguage(ExpressionLanguage value) {
    this.restrictionExpressionLanguage = value;
  }

  /**
   * Gets the value of the baseViewAttribute property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBaseViewAttribute() {
    return baseViewAttribute;
  }

  /**
   * Sets the value of the baseViewAttribute property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBaseViewAttribute(String value) {
    this.baseViewAttribute = value;
  }

}
