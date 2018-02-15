package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.EventReference;
import org.thingml.xthingmlmt.thingML.Event;
import org.thingml.xthingmlmt.thingML.Parameter;

@SuppressWarnings("all")
public class EventReferenceAdapter extends EObjectAdapter<EventReference> implements org.thingml.xthingmlmt.thingML.EventReference {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public EventReferenceAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Event getReceiveMsg() {
    return (Event) adaptersFactory.createAdapter(adaptee.getReceiveMsg(), eResource);
  }
  
  @Override
  public void setReceiveMsg(final Event o) {
    if (o != null)
    	adaptee.setReceiveMsg(((org.thingml.xthingml.adapters.xthingmlmt.thingML.EventAdapter) o).getAdaptee());
    else adaptee.setReceiveMsg(null);
  }
  
  @Override
  public Parameter getParameter() {
    return (Parameter) adaptersFactory.createAdapter(adaptee.getParameter(), eResource);
  }
  
  @Override
  public void setParameter(final Parameter o) {
    if (o != null)
    	adaptee.setParameter(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ParameterAdapter) o).getAdaptee());
    else adaptee.setParameter(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getEventReference();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
    		return getReceiveMsg();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__PARAMETER:
    		return getParameter();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
    		return getReceiveMsg() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__PARAMETER:
    		return getParameter() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
    		setReceiveMsg(
    		(org.thingml.xthingmlmt.thingML.Event)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.EVENT_REFERENCE__PARAMETER:
    		setParameter(
    		(org.thingml.xthingmlmt.thingML.Parameter)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
