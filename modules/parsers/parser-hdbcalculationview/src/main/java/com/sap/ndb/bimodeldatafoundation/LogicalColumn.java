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


package com.sap.ndb.bimodeldatafoundation;

import com.sap.ndb.bimodelcube.Measure;
import com.sap.ndb.bimodelvariable.AbstractVariableMapping;
import com.sap.ndb.datamodeltype.InternalExternalConversion;
import com.sap.ndb.datamodeltype.SemanticType;
import com.sap.ndb.repositorymodelresource.IDObjectWithDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Generic father object for the representations of column in the logical model e.g. Attributes and Measures
 *
 *
 * <p>Java class for LogicalColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LogicalColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/RepositoryModelResource.ecore}IDObjectWithDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="unitCurrencyAttribute" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}QualifiedAttributeReference"/&gt;
 *           &lt;element name="fixedCurrency" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Currency"/&gt;
 *           &lt;element name="fixedUnit" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Unit"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="externalLikeStructureName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}FQName"/&gt;
 *         &lt;element name="externalLikeElementName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName"/&gt;
 *         &lt;element name="variableMapping" type="{http://www.sap.com/ndb/BiModelVariable.ecore}AbstractVariableMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalExternalConversion" type="{http://www.sap.com/ndb/DataModelType.ecore}InternalExternalConversion" minOccurs="0"/&gt;
 *         &lt;element name="maskingExpression" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Expression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="infoObject" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="order" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Order" /&gt;
 *       &lt;attribute name="semanticType" type="{http://www.sap.com/ndb/DataModelType.ecore}SemanticType" /&gt;
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="replaceNull" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="replaceNullBy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayFolder" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalColumn", propOrder = {
    "unitCurrencyAttribute",
    "fixedCurrency",
    "fixedUnit",
    "externalLikeStructureName",
    "externalLikeElementName",
    "variableMapping",
    "internalExternalConversion",
    "maskingExpression"
})
@XmlSeeAlso({
    AbstractAttribute.class,
    Measure.class
})
public abstract class LogicalColumn
    extends IDObjectWithDescription {

  protected QualifiedAttributeReference unitCurrencyAttribute;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected String fixedCurrency;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected String fixedUnit;
  @XmlElement(required = true)
  protected String externalLikeStructureName;
  @XmlElement(required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String externalLikeElementName;
  protected List<AbstractVariableMapping> variableMapping;
  protected InternalExternalConversion internalExternalConversion;
  protected String maskingExpression;
  @XmlAttribute(name = "key")
  protected Boolean key;
  @XmlAttribute(name = "hidden")
  protected Boolean hidden;
  @XmlAttribute(name = "infoObject")
  protected String infoObject;
  @XmlAttribute(name = "order")
  protected Integer order;
  @XmlAttribute(name = "semanticType")
  protected SemanticType semanticType;
  @XmlAttribute(name = "deprecated")
  protected Boolean deprecated;
  @XmlAttribute(name = "replaceNull")
  protected Boolean replaceNull;
  @XmlAttribute(name = "replaceNullBy")
  protected String replaceNullBy;
  @XmlAttribute(name = "displayFolder")
  protected String displayFolder;

  /**
   * Gets the value of the unitCurrencyAttribute property.
   *
   * @return possible object is
   * {@link QualifiedAttributeReference }
   */
  public QualifiedAttributeReference getUnitCurrencyAttribute() {
    return unitCurrencyAttribute;
  }

  /**
   * Sets the value of the unitCurrencyAttribute property.
   *
   * @param value allowed object is
   *              {@link QualifiedAttributeReference }
   */
  public void setUnitCurrencyAttribute(QualifiedAttributeReference value) {
    this.unitCurrencyAttribute = value;
  }

  /**
   * Gets the value of the fixedCurrency property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFixedCurrency() {
    return fixedCurrency;
  }

  /**
   * Sets the value of the fixedCurrency property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFixedCurrency(String value) {
    this.fixedCurrency = value;
  }

  /**
   * Gets the value of the fixedUnit property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFixedUnit() {
    return fixedUnit;
  }

  /**
   * Sets the value of the fixedUnit property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFixedUnit(String value) {
    this.fixedUnit = value;
  }

  /**
   * Gets the value of the externalLikeStructureName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getExternalLikeStructureName() {
    return externalLikeStructureName;
  }

  /**
   * Sets the value of the externalLikeStructureName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setExternalLikeStructureName(String value) {
    this.externalLikeStructureName = value;
  }

  /**
   * Gets the value of the externalLikeElementName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getExternalLikeElementName() {
    return externalLikeElementName;
  }

  /**
   * Sets the value of the externalLikeElementName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setExternalLikeElementName(String value) {
    this.externalLikeElementName = value;
  }

  /**
   * Gets the value of the variableMapping property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the variableMapping property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVariableMapping().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link AbstractVariableMapping }
   */
  public List<AbstractVariableMapping> getVariableMapping() {
    if (variableMapping == null) {
      variableMapping = new ArrayList<AbstractVariableMapping>();
    }
    return this.variableMapping;
  }

  /**
   * Gets the value of the internalExternalConversion property.
   *
   * @return possible object is
   * {@link InternalExternalConversion }
   */
  public InternalExternalConversion getInternalExternalConversion() {
    return internalExternalConversion;
  }

  /**
   * Sets the value of the internalExternalConversion property.
   *
   * @param value allowed object is
   *              {@link InternalExternalConversion }
   */
  public void setInternalExternalConversion(InternalExternalConversion value) {
    this.internalExternalConversion = value;
  }

  /**
   * Gets the value of the maskingExpression property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getMaskingExpression() {
    return maskingExpression;
  }

  /**
   * Sets the value of the maskingExpression property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setMaskingExpression(String value) {
    this.maskingExpression = value;
  }

  /**
   * Gets the value of the key property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isKey() {
    return key;
  }

  /**
   * Sets the value of the key property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setKey(Boolean value) {
    this.key = value;
  }

  /**
   * Gets the value of the hidden property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isHidden() {
    return hidden;
  }

  /**
   * Sets the value of the hidden property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setHidden(Boolean value) {
    this.hidden = value;
  }

  /**
   * Gets the value of the infoObject property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getInfoObject() {
    return infoObject;
  }

  /**
   * Sets the value of the infoObject property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setInfoObject(String value) {
    this.infoObject = value;
  }

  /**
   * Gets the value of the order property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the value of the order property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setOrder(Integer value) {
    this.order = value;
  }

  /**
   * Gets the value of the semanticType property.
   *
   * @return possible object is
   * {@link SemanticType }
   */
  public SemanticType getSemanticType() {
    return semanticType;
  }

  /**
   * Sets the value of the semanticType property.
   *
   * @param value allowed object is
   *              {@link SemanticType }
   */
  public void setSemanticType(SemanticType value) {
    this.semanticType = value;
  }

  /**
   * Gets the value of the deprecated property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isDeprecated() {
    return deprecated;
  }

  /**
   * Sets the value of the deprecated property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setDeprecated(Boolean value) {
    this.deprecated = value;
  }

  /**
   * Gets the value of the replaceNull property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isReplaceNull() {
    return replaceNull;
  }

  /**
   * Sets the value of the replaceNull property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setReplaceNull(Boolean value) {
    this.replaceNull = value;
  }

  /**
   * Gets the value of the replaceNullBy property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getReplaceNullBy() {
    return replaceNullBy;
  }

  /**
   * Sets the value of the replaceNullBy property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setReplaceNullBy(String value) {
    this.replaceNullBy = value;
  }

  /**
   * Gets the value of the displayFolder property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDisplayFolder() {
    return displayFolder;
  }

  /**
   * Sets the value of the displayFolder property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDisplayFolder(String value) {
    this.displayFolder = value;
  }

}
