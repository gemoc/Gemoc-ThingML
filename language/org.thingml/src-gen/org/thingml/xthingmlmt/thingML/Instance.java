/**
 */
package org.thingml.xthingmlmt.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Instance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Thing)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getInstance_Type()
	 * @model
	 * @generated
	 */
	Thing getType();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.Instance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Thing value);

} // Instance
