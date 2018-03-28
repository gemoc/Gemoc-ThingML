/**
 */
package thingML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import thingML.Context;
import thingML.Frame;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.FrameImpl#getChildFrame <em>Child Frame</em>}</li>
 *   <li>{@link thingML.impl.FrameImpl#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link thingML.impl.FrameImpl#getRootContext <em>Root Context</em>}</li>
 *   <li>{@link thingML.impl.FrameImpl#getTopContext <em>Top Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends MinimalEObjectImpl.Container implements Frame {
	/**
	 * The cached value of the '{@link #getChildFrame() <em>Child Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame childFrame;

	/**
	 * The cached value of the '{@link #getRootContext() <em>Root Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootContext()
	 * @generated
	 * @ordered
	 */
	protected Context rootContext;

	/**
	 * The cached value of the '{@link #getTopContext() <em>Top Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopContext()
	 * @generated
	 * @ordered
	 */
	protected Context topContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getChildFrame() {
		return childFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFrame(Frame newChildFrame, NotificationChain msgs) {
		Frame oldChildFrame = childFrame;
		childFrame = newChildFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__CHILD_FRAME, oldChildFrame, newChildFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFrame(Frame newChildFrame) {
		if (newChildFrame != childFrame) {
			NotificationChain msgs = null;
			if (childFrame != null)
				msgs = ((InternalEObject)childFrame).eInverseRemove(this, ThingMLPackage.FRAME__PARENT_FRAME, Frame.class, msgs);
			if (newChildFrame != null)
				msgs = ((InternalEObject)newChildFrame).eInverseAdd(this, ThingMLPackage.FRAME__PARENT_FRAME, Frame.class, msgs);
			msgs = basicSetChildFrame(newChildFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__CHILD_FRAME, newChildFrame, newChildFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getParentFrame() {
		if (eContainerFeatureID() != ThingMLPackage.FRAME__PARENT_FRAME) return null;
		return (Frame)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFrame(Frame newParentFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFrame, ThingMLPackage.FRAME__PARENT_FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFrame(Frame newParentFrame) {
		if (newParentFrame != eInternalContainer() || (eContainerFeatureID() != ThingMLPackage.FRAME__PARENT_FRAME && newParentFrame != null)) {
			if (EcoreUtil.isAncestor(this, newParentFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFrame != null)
				msgs = ((InternalEObject)newParentFrame).eInverseAdd(this, ThingMLPackage.FRAME__CHILD_FRAME, Frame.class, msgs);
			msgs = basicSetParentFrame(newParentFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__PARENT_FRAME, newParentFrame, newParentFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getRootContext() {
		return rootContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootContext(Context newRootContext, NotificationChain msgs) {
		Context oldRootContext = rootContext;
		rootContext = newRootContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__ROOT_CONTEXT, oldRootContext, newRootContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootContext(Context newRootContext) {
		if (newRootContext != rootContext) {
			NotificationChain msgs = null;
			if (rootContext != null)
				msgs = ((InternalEObject)rootContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.FRAME__ROOT_CONTEXT, null, msgs);
			if (newRootContext != null)
				msgs = ((InternalEObject)newRootContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.FRAME__ROOT_CONTEXT, null, msgs);
			msgs = basicSetRootContext(newRootContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__ROOT_CONTEXT, newRootContext, newRootContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getTopContext() {
		if (topContext != null && topContext.eIsProxy()) {
			InternalEObject oldTopContext = (InternalEObject)topContext;
			topContext = (Context)eResolveProxy(oldTopContext);
			if (topContext != oldTopContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.FRAME__TOP_CONTEXT, oldTopContext, topContext));
			}
		}
		return topContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetTopContext() {
		return topContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopContext(Context newTopContext) {
		Context oldTopContext = topContext;
		topContext = newTopContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.FRAME__TOP_CONTEXT, oldTopContext, topContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.FRAME__CHILD_FRAME:
				if (childFrame != null)
					msgs = ((InternalEObject)childFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.FRAME__CHILD_FRAME, null, msgs);
				return basicSetChildFrame((Frame)otherEnd, msgs);
			case ThingMLPackage.FRAME__PARENT_FRAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFrame((Frame)otherEnd, msgs);
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
			case ThingMLPackage.FRAME__CHILD_FRAME:
				return basicSetChildFrame(null, msgs);
			case ThingMLPackage.FRAME__PARENT_FRAME:
				return basicSetParentFrame(null, msgs);
			case ThingMLPackage.FRAME__ROOT_CONTEXT:
				return basicSetRootContext(null, msgs);
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
			case ThingMLPackage.FRAME__PARENT_FRAME:
				return eInternalContainer().eInverseRemove(this, ThingMLPackage.FRAME__CHILD_FRAME, Frame.class, msgs);
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
			case ThingMLPackage.FRAME__CHILD_FRAME:
				return getChildFrame();
			case ThingMLPackage.FRAME__PARENT_FRAME:
				return getParentFrame();
			case ThingMLPackage.FRAME__ROOT_CONTEXT:
				return getRootContext();
			case ThingMLPackage.FRAME__TOP_CONTEXT:
				if (resolve) return getTopContext();
				return basicGetTopContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingMLPackage.FRAME__CHILD_FRAME:
				setChildFrame((Frame)newValue);
				return;
			case ThingMLPackage.FRAME__PARENT_FRAME:
				setParentFrame((Frame)newValue);
				return;
			case ThingMLPackage.FRAME__ROOT_CONTEXT:
				setRootContext((Context)newValue);
				return;
			case ThingMLPackage.FRAME__TOP_CONTEXT:
				setTopContext((Context)newValue);
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
			case ThingMLPackage.FRAME__CHILD_FRAME:
				setChildFrame((Frame)null);
				return;
			case ThingMLPackage.FRAME__PARENT_FRAME:
				setParentFrame((Frame)null);
				return;
			case ThingMLPackage.FRAME__ROOT_CONTEXT:
				setRootContext((Context)null);
				return;
			case ThingMLPackage.FRAME__TOP_CONTEXT:
				setTopContext((Context)null);
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
			case ThingMLPackage.FRAME__CHILD_FRAME:
				return childFrame != null;
			case ThingMLPackage.FRAME__PARENT_FRAME:
				return getParentFrame() != null;
			case ThingMLPackage.FRAME__ROOT_CONTEXT:
				return rootContext != null;
			case ThingMLPackage.FRAME__TOP_CONTEXT:
				return topContext != null;
		}
		return super.eIsSet(featureID);
	}

} //FrameImpl
