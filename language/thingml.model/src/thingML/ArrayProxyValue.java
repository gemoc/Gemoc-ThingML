/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Proxy Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.ArrayProxyValue#getArrayProxyEntries <em>Array Proxy Entries</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getArrayProxyValue()
 * @model
 * @generated
 */
public interface ArrayProxyValue extends ProxyValue {
	/**
	 * Returns the value of the '<em><b>Array Proxy Entries</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.ArrayProxyEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Proxy Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Proxy Entries</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getArrayProxyValue_ArrayProxyEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayProxyEntry> getArrayProxyEntries();

} // ArrayProxyValue
