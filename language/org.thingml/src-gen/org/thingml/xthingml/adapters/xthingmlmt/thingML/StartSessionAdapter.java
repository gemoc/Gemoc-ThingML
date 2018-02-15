package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.StartSession;
import org.thingml.xthingmlmt.thingML.Session;

@SuppressWarnings("all")
public class StartSessionAdapter extends EObjectAdapter<StartSession> implements org.thingml.xthingmlmt.thingML.StartSession {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public StartSessionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Session getSession() {
    return (Session) adaptersFactory.createAdapter(adaptee.getSession(), eResource);
  }
  
  @Override
  public void setSession(final Session o) {
    if (o != null)
    	adaptee.setSession(((org.thingml.xthingml.adapters.xthingmlmt.thingML.SessionAdapter) o).getAdaptee());
    else adaptee.setSession(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getStartSession();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.START_SESSION__SESSION:
    		return getSession();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.START_SESSION__SESSION:
    		return getSession() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.START_SESSION__SESSION:
    		setSession(
    		(org.thingml.xthingmlmt.thingML.Session)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
