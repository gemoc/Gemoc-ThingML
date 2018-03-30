/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicPort#getPort <em>Port</em>}</li>
 *   <li>{@link thingML.DynamicPort#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link thingML.DynamicPort#getConnectedPorts <em>Connected Ports</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicPort()
 * @model
 * @generated
 */
public interface DynamicPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see thingML.ThingMLPackage#getDynamicPort_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link thingML.DynamicPort#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Received Messages</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.DynamicMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Messages</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getDynamicPort_ReceivedMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicMessage> getReceivedMessages();

	/**
	 * Returns the value of the '<em><b>Connected Ports</b></em>' reference list.
	 * The list contents are of type {@link thingML.DynamicPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Ports</em>' reference list.
	 * @see thingML.ThingMLPackage#getDynamicPort_ConnectedPorts()
	 * @model
	 * @generated
	 */
	EList<DynamicPort> getConnectedPorts();

} // DynamicPort
