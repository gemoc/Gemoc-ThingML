/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.InstanceContext#getPropertyEntries <em>Property Entries</em>}</li>
 *   <li>{@link thingML.InstanceContext#getStateContainerEntries <em>State Container Entries</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getInstanceContext()
 * @model
 * @generated
 */
public interface InstanceContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Entries</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.PropertyEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Entries</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getInstanceContext_PropertyEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyEntry> getPropertyEntries();

	/**
	 * Returns the value of the '<em><b>State Container Entries</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.CompositeStateEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Container Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Container Entries</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getInstanceContext_StateContainerEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeStateEntry> getStateContainerEntries();

} // InstanceContext
