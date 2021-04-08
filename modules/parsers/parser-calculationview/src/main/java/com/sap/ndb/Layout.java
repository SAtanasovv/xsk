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
// Generated on: 2020.11.27 at 08:01:21 PM EET 
//


package com.sap.ndb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="shape" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="upperLeftCorner"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                                     &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rectangleSize"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                     &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="expanded" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="modelObjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="modelObjectNameSpace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shapes"
})
@XmlRootElement(name = "layout")
public class Layout {

  @XmlElement(required = true)
  protected Layout.Shapes shapes;

  /**
   * Gets the value of the shapes property.
   *
   * @return possible object is
   * {@link Layout.Shapes }
   */
  public Layout.Shapes getShapes() {
    return shapes;
  }

  /**
   * Sets the value of the shapes property.
   *
   * @param value allowed object is
   *              {@link Layout.Shapes }
   */
  public void setShapes(Layout.Shapes value) {
    this.shapes = value;
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="shape" maxOccurs="unbounded" minOccurs="0"&gt;
   *           &lt;complexType&gt;
   *             &lt;complexContent&gt;
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *                 &lt;sequence&gt;
   *                   &lt;element name="upperLeftCorner"&gt;
   *                     &lt;complexType&gt;
   *                       &lt;simpleContent&gt;
   *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
   *                           &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
   *                           &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
   *                         &lt;/extension&gt;
   *                       &lt;/simpleContent&gt;
   *                     &lt;/complexType&gt;
   *                   &lt;/element&gt;
   *                   &lt;element name="rectangleSize"&gt;
   *                     &lt;complexType&gt;
   *                       &lt;simpleContent&gt;
   *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
   *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
   *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
   *                         &lt;/extension&gt;
   *                       &lt;/simpleContent&gt;
   *                     &lt;/complexType&gt;
   *                   &lt;/element&gt;
   *                 &lt;/sequence&gt;
   *                 &lt;attribute name="expanded" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
   *                 &lt;attribute name="modelObjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
   *                 &lt;attribute name="modelObjectNameSpace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
   *               &lt;/restriction&gt;
   *             &lt;/complexContent&gt;
   *           &lt;/complexType&gt;
   *         &lt;/element&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "shape"
  })
  public static class Shapes {

    protected List<Layout.Shapes.Shape> shape;

    /**
     * Gets the value of the shape property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Layout.Shapes.Shape }
     */
    public List<Layout.Shapes.Shape> getShape() {
      if (shape == null) {
        shape = new ArrayList<Layout.Shapes.Shape>();
      }
      return this.shape;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="upperLeftCorner"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="rectangleSize"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="expanded" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="modelObjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="modelObjectNameSpace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "upperLeftCorner",
        "rectangleSize"
    })
    public static class Shape {

      @XmlElement(required = true)
      protected Layout.Shapes.Shape.UpperLeftCorner upperLeftCorner;
      @XmlElement(required = true)
      protected Layout.Shapes.Shape.RectangleSize rectangleSize;
      @XmlAttribute(name = "expanded")
      protected String expanded;
      @XmlAttribute(name = "modelObjectName")
      protected String modelObjectName;
      @XmlAttribute(name = "modelObjectNameSpace")
      protected String modelObjectNameSpace;

      /**
       * Gets the value of the upperLeftCorner property.
       *
       * @return possible object is
       * {@link Layout.Shapes.Shape.UpperLeftCorner }
       */
      public Layout.Shapes.Shape.UpperLeftCorner getUpperLeftCorner() {
        return upperLeftCorner;
      }

      /**
       * Sets the value of the upperLeftCorner property.
       *
       * @param value allowed object is
       *              {@link Layout.Shapes.Shape.UpperLeftCorner }
       */
      public void setUpperLeftCorner(Layout.Shapes.Shape.UpperLeftCorner value) {
        this.upperLeftCorner = value;
      }

      /**
       * Gets the value of the rectangleSize property.
       *
       * @return possible object is
       * {@link Layout.Shapes.Shape.RectangleSize }
       */
      public Layout.Shapes.Shape.RectangleSize getRectangleSize() {
        return rectangleSize;
      }

      /**
       * Sets the value of the rectangleSize property.
       *
       * @param value allowed object is
       *              {@link Layout.Shapes.Shape.RectangleSize }
       */
      public void setRectangleSize(Layout.Shapes.Shape.RectangleSize value) {
        this.rectangleSize = value;
      }

      /**
       * Gets the value of the expanded property.
       *
       * @return possible object is
       * {@link String }
       */
      public String getExpanded() {
        return expanded;
      }

      /**
       * Sets the value of the expanded property.
       *
       * @param value allowed object is
       *              {@link String }
       */
      public void setExpanded(String value) {
        this.expanded = value;
      }

      /**
       * Gets the value of the modelObjectName property.
       *
       * @return possible object is
       * {@link String }
       */
      public String getModelObjectName() {
        return modelObjectName;
      }

      /**
       * Sets the value of the modelObjectName property.
       *
       * @param value allowed object is
       *              {@link String }
       */
      public void setModelObjectName(String value) {
        this.modelObjectName = value;
      }

      /**
       * Gets the value of the modelObjectNameSpace property.
       *
       * @return possible object is
       * {@link String }
       */
      public String getModelObjectNameSpace() {
        return modelObjectNameSpace;
      }

      /**
       * Sets the value of the modelObjectNameSpace property.
       *
       * @param value allowed object is
       *              {@link String }
       */
      public void setModelObjectNameSpace(String value) {
        this.modelObjectNameSpace = value;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType&gt;
       *   &lt;simpleContent&gt;
       *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
       *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
       *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
       *     &lt;/extension&gt;
       *   &lt;/simpleContent&gt;
       * &lt;/complexType&gt;
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "value"
      })
      public static class RectangleSize {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "height")
        protected Byte height;
        @XmlAttribute(name = "width")
        protected Byte width;

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
         * Gets the value of the height property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getHeight() {
          return height;
        }

        /**
         * Sets the value of the height property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setHeight(Byte value) {
          this.height = value;
        }

        /**
         * Gets the value of the width property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getWidth() {
          return width;
        }

        /**
         * Sets the value of the width property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setWidth(Byte value) {
          this.width = value;
        }

      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this class.
       *
       * <pre>
       * &lt;complexType&gt;
       *   &lt;simpleContent&gt;
       *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
       *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
       *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
       *     &lt;/extension&gt;
       *   &lt;/simpleContent&gt;
       * &lt;/complexType&gt;
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "value"
      })
      public static class UpperLeftCorner {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "x")
        protected Short x;
        @XmlAttribute(name = "y")
        protected Short y;

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
         * Gets the value of the x property.
         *
         * @return possible object is
         * {@link Short }
         */
        public Short getX() {
          return x;
        }

        /**
         * Sets the value of the x property.
         *
         * @param value allowed object is
         *              {@link Short }
         */
        public void setX(Short value) {
          this.x = value;
        }

        /**
         * Gets the value of the y property.
         *
         * @return possible object is
         * {@link Short }
         */
        public Short getY() {
          return y;
        }

        /**
         * Sets the value of the y property.
         *
         * @param value allowed object is
         *              {@link Short }
         */
        public void setY(Short value) {
          this.y = value;
        }

      }

    }

  }

}
