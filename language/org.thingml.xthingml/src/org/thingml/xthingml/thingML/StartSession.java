/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.StartSession#getSession <em>Session</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStartSession()
 * @model
 * @generated
 */
public interface StartSession extends Action {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' reference.
	 * @see #setSession(Session)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStartSession_Session()
	 * @model
	 * @generated
	 */
	Session getSession();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.StartSession#getSession <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(Session value);

} // StartSession