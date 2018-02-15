package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Port;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ReceiveMessage;

@SuppressWarnings("all")
public class ReceiveMessageAdapter extends EObjectAdapter<ReceiveMessage> implements org.thingml.xtext.thingML.ReceiveMessage {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ReceiveMessageAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Port getPort() {
    return (Port) adaptersFactory.createAdapter(adaptee.getPort(), eResource);
  }
  
  @Override
  public void setPort(final Port o) {
    if (o != null)
    	adaptee.setPort(((org.thingml.xthingml.adapters.thingmlmt.thingML.PortAdapter) o).getAdaptee());
    else adaptee.setPort(null);
  }
  
  @Override
  public Message getMessage() {
    return (Message) adaptersFactory.createAdapter(adaptee.getMessage(), eResource);
  }
  
  @Override
  public void setMessage(final Message o) {
    if (o != null)
    	adaptee.setMessage(((org.thingml.xthingml.adapters.thingmlmt.thingML.MessageAdapter) o).getAdaptee());
    else adaptee.setMessage(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getReceiveMessage();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__PORT:
    		return getPort();
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__MESSAGE:
    		return getMessage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__PORT:
    		return getPort() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__MESSAGE:
    		return getMessage() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__PORT:
    		setPort(
    		(org.thingml.xtext.thingML.Port)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.RECEIVE_MESSAGE__MESSAGE:
    		setMessage(
    		(org.thingml.xtext.thingML.Message)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
