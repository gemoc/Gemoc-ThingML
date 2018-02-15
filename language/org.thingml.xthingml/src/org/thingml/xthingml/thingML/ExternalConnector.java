/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.ExternalConnector#getInst <em>Inst</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.ExternalConnector#getPort <em>Port</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.ExternalConnector#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getExternalConnector()
 * @model
 * @generated
 */
public interface ExternalConnector extends AbstractConnector {
	/**
	 * Returns the value of the '<em><b>Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst</em>' reference.
	 * @see #setInst(Instance)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getExternalConnector_Inst()
	 * @model
	 * @generated
	 */
	Instance getInst();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.ExternalConnector#getInst <em>Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst</em>' reference.
	 * @see #getInst()
	 * @generated
	 */
	void setInst(Instance value);

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
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getExternalConnector_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.ExternalConnector#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(Protocol)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getExternalConnector_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.ExternalConnector#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // ExternalConnector
