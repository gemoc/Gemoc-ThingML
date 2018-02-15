/**
 */
package org.thingml.xthingml.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.Configuration#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.Configuration#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.Configuration#getPropassigns <em>Propassigns</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConfiguration_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.AbstractConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConfiguration_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConnector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Propassigns</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.ConfigPropertyAssign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propassigns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propassigns</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getConfiguration_Propassigns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigPropertyAssign> getPropassigns();

} // Configuration
