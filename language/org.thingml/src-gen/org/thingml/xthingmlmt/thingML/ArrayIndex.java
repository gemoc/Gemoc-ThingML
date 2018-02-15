/**
 */
package org.thingml.xthingmlmt.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getArray <em>Array</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getArrayIndex()
 * @model
 * @generated
 */
public interface ArrayIndex extends Expression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Expression)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getArrayIndex_Array()
	 * @model containment="true"
	 * @generated
	 */
	Expression getArray();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Expression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Expression)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getArrayIndex_Index()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.ArrayIndex#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

} // ArrayIndex
