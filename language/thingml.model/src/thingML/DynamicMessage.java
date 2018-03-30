/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link thingML.DynamicMessage#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicMessage()
 * @model
 * @generated
 */
public interface DynamicMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see thingML.ThingMLPackage#getDynamicMessage_Message()
	 * @model required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link thingML.DynamicMessage#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getDynamicMessage_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getParameters();

} // DynamicMessage
