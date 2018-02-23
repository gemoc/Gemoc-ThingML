/**
 */
package org.thingml.xthingmlmt.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ExternStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ExternStatement#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getExternStatement()
 * @model
 * @generated
 */
public interface ExternStatement extends Action {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getExternStatement_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ExternStatement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getExternStatement_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getSegments();

} // ExternStatement
