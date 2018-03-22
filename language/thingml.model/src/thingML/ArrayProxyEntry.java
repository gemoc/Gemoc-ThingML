/**
 */
package thingML;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Proxy Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.ArrayProxyEntry#getIndex <em>Index</em>}</li>
 *   <li>{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getArrayProxyEntry()
 * @model
 * @generated
 */
public interface ArrayProxyEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference.
	 * @see #setIndex(Expression)
	 * @see thingML.ThingMLPackage#getArrayProxyEntry_Index()
	 * @model required="true"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link thingML.ArrayProxyEntry#getIndex <em>Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see thingML.ThingMLPackage#getArrayProxyEntry_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // ArrayProxyEntry
