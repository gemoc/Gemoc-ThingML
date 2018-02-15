/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.IntegerLiteral#getIntValue <em>Int Value</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(long)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getIntegerLiteral_IntValue()
	 * @model
	 * @generated
	 */
	long getIntValue();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.IntegerLiteral#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(long value);

} // IntegerLiteral
