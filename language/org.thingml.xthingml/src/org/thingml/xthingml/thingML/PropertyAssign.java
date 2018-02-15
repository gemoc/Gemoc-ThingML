/**
 */
package org.thingml.xthingml.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.PropertyAssign#getProperty <em>Property</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.PropertyAssign#getIndex <em>Index</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.PropertyAssign#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPropertyAssign()
 * @model
 * @generated
 */
public interface PropertyAssign extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPropertyAssign_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.PropertyAssign#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPropertyAssign_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndex();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Expression)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPropertyAssign_Init()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInit();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.PropertyAssign#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Expression value);

} // PropertyAssign
