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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.thingml.xtext.thingML.Port;

import thingML.DynamicMessage;
import thingML.DynamicPort;
import thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thingML.impl.DynamicPortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link thingML.impl.DynamicPortImpl#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link thingML.impl.DynamicPortImpl#getConnectedPorts <em>Connected Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicPortImpl extends MinimalEObjectImpl.Container implements DynamicPort {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getReceivedMessages() <em>Received Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicMessage> receivedMessages;

	/**
	 * The cached value of the '{@link #getConnectedPorts() <em>Connected Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicPort> connectedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.DYNAMIC_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.DYNAMIC_PORT__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DYNAMIC_PORT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicMessage> getReceivedMessages() {
		if (receivedMessages == null) {
			receivedMessages = new EObjectContainmentEList<DynamicMessage>(DynamicMessage.class, this, ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES);
		}
		return receivedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicPort> getConnectedPorts() {
		if (connectedPorts == null) {
			connectedPorts = new EObjectResolvingEList<DynamicPort>(DynamicPort.class, this, ThingMLPackage.DYNAMIC_PORT__CONNECTED_PORTS);
		}
		return connectedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES:
				return ((InternalEList<?>)getReceivedMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.DYNAMIC_PORT__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES:
				return getReceivedMessages();
			case ThingMLPackage.DYNAMIC_PORT__CONNECTED_PORTS:
				return getConnectedPorts();
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
			case ThingMLPackage.DYNAMIC_PORT__PORT:
				setPort((Port)newValue);
				return;
			case ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES:
				getReceivedMessages().clear();
				getReceivedMessages().addAll((Collection<? extends DynamicMessage>)newValue);
				return;
			case ThingMLPackage.DYNAMIC_PORT__CONNECTED_PORTS:
				getConnectedPorts().clear();
				getConnectedPorts().addAll((Collection<? extends DynamicPort>)newValue);
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
			case ThingMLPackage.DYNAMIC_PORT__PORT:
				setPort((Port)null);
				return;
			case ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES:
				getReceivedMessages().clear();
				return;
			case ThingMLPackage.DYNAMIC_PORT__CONNECTED_PORTS:
				getConnectedPorts().clear();
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
			case ThingMLPackage.DYNAMIC_PORT__PORT:
				return port != null;
			case ThingMLPackage.DYNAMIC_PORT__RECEIVED_MESSAGES:
				return receivedMessages != null && !receivedMessages.isEmpty();
			case ThingMLPackage.DYNAMIC_PORT__CONNECTED_PORTS:
				return connectedPorts != null && !connectedPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicPortImpl
