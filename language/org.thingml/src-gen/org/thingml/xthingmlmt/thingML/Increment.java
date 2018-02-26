/**
 */
package org.thingml.xthingmlmt.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Increment#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getIncrement()
 * @model
 * @generated
 */
public interface Increment extends Action {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(Variable)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getIncrement_Var()
	 * @model
	 * @generated
	 */
	Variable getVar();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.Increment#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(Variable value);

} // Increment