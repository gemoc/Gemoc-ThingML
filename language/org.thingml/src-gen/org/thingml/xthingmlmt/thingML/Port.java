/**
 */
package org.thingml.xthingmlmt.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Port#getSends <em>Sends</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Port#getReceives <em>Receives</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.Port#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Sends</b></em>' reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends</em>' reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getPort_Sends()
	 * @model
	 * @generated
	 */
	EList<Message> getSends();

	/**
	 * Returns the value of the '<em><b>Receives</b></em>' reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives</em>' reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getPort_Receives()
	 * @model
	 * @generated
	 */
	EList<Message> getReceives();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getPort_Messages()
	 * @model
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasReceived(Message message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sends(Message message);

} // Port
