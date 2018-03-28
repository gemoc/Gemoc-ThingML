/**
 */
package thingML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.Frame#getChildFrame <em>Child Frame</em>}</li>
 *   <li>{@link thingML.Frame#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link thingML.Frame#getRootContext <em>Root Context</em>}</li>
 *   <li>{@link thingML.Frame#getTopContext <em>Top Context</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Frame</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link thingML.Frame#getParentFrame <em>Parent Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Frame</em>' containment reference.
	 * @see #setChildFrame(Frame)
	 * @see thingML.ThingMLPackage#getFrame_ChildFrame()
	 * @see thingML.Frame#getParentFrame
	 * @model opposite="parentFrame" containment="true"
	 * @generated
	 */
	Frame getChildFrame();

	/**
	 * Sets the value of the '{@link thingML.Frame#getChildFrame <em>Child Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Frame</em>' containment reference.
	 * @see #getChildFrame()
	 * @generated
	 */
	void setChildFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Parent Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link thingML.Frame#getChildFrame <em>Child Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Frame</em>' container reference.
	 * @see #setParentFrame(Frame)
	 * @see thingML.ThingMLPackage#getFrame_ParentFrame()
	 * @see thingML.Frame#getChildFrame
	 * @model opposite="childFrame" transient="false"
	 * @generated
	 */
	Frame getParentFrame();

	/**
	 * Sets the value of the '{@link thingML.Frame#getParentFrame <em>Parent Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Frame</em>' container reference.
	 * @see #getParentFrame()
	 * @generated
	 */
	void setParentFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Root Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Context</em>' containment reference.
	 * @see #setRootContext(Context)
	 * @see thingML.ThingMLPackage#getFrame_RootContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getRootContext();

	/**
	 * Sets the value of the '{@link thingML.Frame#getRootContext <em>Root Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Context</em>' containment reference.
	 * @see #getRootContext()
	 * @generated
	 */
	void setRootContext(Context value);

	/**
	 * Returns the value of the '<em><b>Top Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Context</em>' reference.
	 * @see #setTopContext(Context)
	 * @see thingML.ThingMLPackage#getFrame_TopContext()
	 * @model required="true"
	 * @generated
	 */
	Context getTopContext();

	/**
	 * Sets the value of the '{@link thingML.Frame#getTopContext <em>Top Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Context</em>' reference.
	 * @see #getTopContext()
	 * @generated
	 */
	void setTopContext(Context value);

} // Frame
