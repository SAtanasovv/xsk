/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.hdbDD;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hdb DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.HdbDD#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 * @see com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage#getHdbDD()
 */
public interface HdbDD extends EObject {

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.sap.xsk.models.hdbdd.hdbDD.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @model containment="true"
   * @generated
   * @see com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage#getHdbDD_Elements()
   */
  EList<Type> getElements();

} // HdbDD
