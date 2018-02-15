/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Size</em>' attribute.
	 * @see #setByteSize(long)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getPrimitiveType_ByteSize()
	 * @model
	 * @generated
	 */
	long getByteSize();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Size</em>' attribute.
	 * @see #getByteSize()
	 * @generated
	 */
	void setByteSize(long value);

} // PrimitiveType
