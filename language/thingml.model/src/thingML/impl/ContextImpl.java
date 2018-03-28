/**
 */
package thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import thingML.Context;
import thingML.DynamicVariable;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.ContextImpl#getChildContext <em>Child Context</em>}</li>
 *   <li>{@link thingML.impl.ContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link thingML.impl.ContextImpl#getDynamicVariables <em>Dynamic Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getChildContext() <em>Child Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContext()
	 * @generated
	 * @ordered
	 */
	protected Context childContext;

	/**
	 * The cached value of the '{@link #getDynamicVariables() <em>Dynamic Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicVariable> dynamicVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getChildContext() {
		return childContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildContext(Context newChildContext, NotificationChain msgs) {
		Context oldChildContext = childContext;
		childContext = newChildContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.CONTEXT__CHILD_CONTEXT, oldChildContext, newChildContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildContext(Context newChildContext) {
		if (newChildContext != childContext) {
			NotificationChain msgs = null;
			if (childContext != null)
				msgs = ((InternalEObject)childContext).eInverseRemove(this, ThingMLPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			if (newChildContext != null)
				msgs = ((InternalEObject)newChildContext).eInverseAdd(this, ThingMLPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			msgs = basicSetChildContext(newChildContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.CONTEXT__CHILD_CONTEXT, newChildContext, newChildContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getParentContext() {
		if (eContainerFeatureID() != ThingMLPackage.CONTEXT__PARENT_CONTEXT) return null;
		return (Context)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(Context newParentContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContext, ThingMLPackage.CONTEXT__PARENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(Context newParentContext) {
		if (newParentContext != eInternalContainer() || (eContainerFeatureID() != ThingMLPackage.CONTEXT__PARENT_CONTEXT && newParentContext != null)) {
			if (EcoreUtil.isAncestor(this, newParentContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, ThingMLPackage.CONTEXT__CHILD_CONTEXT, Context.class, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicVariable> getDynamicVariables() {
		if (dynamicVariables == null) {
			dynamicVariables = new EObjectContainmentEList<DynamicVariable>(DynamicVariable.class, this, ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES);
		}
		return dynamicVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				if (childContext != null)
					msgs = ((InternalEObject)childContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.CONTEXT__CHILD_CONTEXT, null, msgs);
				return basicSetChildContext((Context)otherEnd, msgs);
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContext((Context)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				return basicSetChildContext(null, msgs);
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				return basicSetParentContext(null, msgs);
			case ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES:
				return ((InternalEList<?>)getDynamicVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, ThingMLPackage.CONTEXT__CHILD_CONTEXT, Context.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				return getChildContext();
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext();
			case ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES:
				return getDynamicVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				setChildContext((Context)newValue);
				return;
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)newValue);
				return;
			case ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES:
				getDynamicVariables().clear();
				getDynamicVariables().addAll((Collection<? extends DynamicVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				setChildContext((Context)null);
				return;
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)null);
				return;
			case ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES:
				getDynamicVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThingMLPackage.CONTEXT__CHILD_CONTEXT:
				return childContext != null;
			case ThingMLPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext() != null;
			case ThingMLPackage.CONTEXT__DYNAMIC_VARIABLES:
				return dynamicVariables != null && !dynamicVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
