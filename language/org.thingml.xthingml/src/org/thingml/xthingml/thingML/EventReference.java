/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.EventReference#getReceiveMsg <em>Receive Msg</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.EventReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getEventReference()
 * @model
 * @generated
 */
public interface EventReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Receive Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Msg</em>' reference.
	 * @see #setReceiveMsg(Event)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getEventReference_ReceiveMsg()
	 * @model
	 * @generated
	 */
	Event getReceiveMsg();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.EventReference#getReceiveMsg <em>Receive Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Msg</em>' reference.
	 * @see #getReceiveMsg()
	 * @generated
	 */
	void setReceiveMsg(Event value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getEventReference_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.EventReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // EventReference
