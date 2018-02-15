/**
 */
package org.thingml.xthingml.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.Connector#getCli <em>Cli</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.Connector#getRequired <em>Required</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.Connector#getSrv <em>Srv</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.Connector#getProvided <em>Provided</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends AbstractConnector {
	/**
	 * Returns the value of the '<em><b>Cli</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cli</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cli</em>' reference.
	 * @see #setCli(Instance)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConnector_Cli()
	 * @model
	 * @generated
	 */
	Instance getCli();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.Connector#getCli <em>Cli</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cli</em>' reference.
	 * @see #getCli()
	 * @generated
	 */
	void setCli(Instance value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(RequiredPort)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConnector_Required()
	 * @model
	 * @generated
	 */
	RequiredPort getRequired();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.Connector#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(RequiredPort value);

	/**
	 * Returns the value of the '<em><b>Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv</em>' reference.
	 * @see #setSrv(Instance)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConnector_Srv()
	 * @model
	 * @generated
	 */
	Instance getSrv();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.Connector#getSrv <em>Srv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv</em>' reference.
	 * @see #getSrv()
	 * @generated
	 */
	void setSrv(Instance value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference.
	 * @see #setProvided(ProvidedPort)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConnector_Provided()
	 * @model
	 * @generated
	 */
	ProvidedPort getProvided();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.Connector#getProvided <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' reference.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(ProvidedPort value);

} // Connector
