/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getByteLiteral()
 * @model
 * @generated
 */
public interface ByteLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Byte Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Value</em>' attribute.
	 * @see #setByteValue(byte)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getByteLiteral_ByteValue()
	 * @model
	 * @generated
	 */
	byte getByteValue();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Value</em>' attribute.
	 * @see #getByteValue()
	 * @generated
	 */
	void setByteValue(byte value);

} // ByteLiteral
