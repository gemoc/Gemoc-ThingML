/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.CharLiteral#getCharValue <em>Char Value</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getCharLiteral()
 * @model
 * @generated
 */
public interface CharLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Char Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Value</em>' attribute.
	 * @see #setCharValue(byte)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getCharLiteral_CharValue()
	 * @model
	 * @generated
	 */
	byte getCharValue();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.CharLiteral#getCharValue <em>Char Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Value</em>' attribute.
	 * @see #getCharValue()
	 * @generated
	 */
	void setCharValue(byte value);

} // CharLiteral
