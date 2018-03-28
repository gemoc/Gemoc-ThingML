/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.Context#getChildContext <em>Child Context</em>}</li>
 *   <li>{@link thingML.Context#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link thingML.Context#getDynamicVariables <em>Dynamic Variables</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Context</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link thingML.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Context</em>' containment reference.
	 * @see #setChildContext(Context)
	 * @see thingML.ThingMLPackage#getContext_ChildContext()
	 * @see thingML.Context#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	Context getChildContext();

	/**
	 * Sets the value of the '{@link thingML.Context#getChildContext <em>Child Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Context</em>' containment reference.
	 * @see #getChildContext()
	 * @generated
	 */
	void setChildContext(Context value);

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link thingML.Context#getChildContext <em>Child Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(Context)
	 * @see thingML.ThingMLPackage#getContext_ParentContext()
	 * @see thingML.Context#getChildContext
	 * @model opposite="childContext" transient="false"
	 * @generated
	 */
	Context getParentContext();

	/**
	 * Sets the value of the '{@link thingML.Context#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(Context value);

	/**
	 * Returns the value of the '<em><b>Dynamic Variables</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.DynamicVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Variables</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getContext_DynamicVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicVariable> getDynamicVariables();

} // Context
