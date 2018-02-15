/**
 */
package org.thingml.xthingmlmt.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Session#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends StateContainer {
	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' containment reference.
	 * @see #setMaxInstances(Expression)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getSession_MaxInstances()
	 * @model containment="true"
	 * @generated
	 */
	Expression getMaxInstances();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.Session#getMaxInstances <em>Max Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' containment reference.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(Expression value);

} // Session
