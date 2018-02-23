package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Session;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.StartSession;

@SuppressWarnings("all")
public class StartSessionAdapter extends EObjectAdapter<StartSession> implements org.thingml.xtext.thingML.StartSession {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public StartSessionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Session getSession() {
    return (Session) adaptersFactory.createAdapter(adaptee.getSession(), eResource);
  }
  
  @Override
  public void setSession(final Session o) {
    if (o != null)
    	adaptee.setSession(((org.thingml.xthingml.adapters.thingmlmt.thingML.SessionAdapter) o).getAdaptee());
    else adaptee.setSession(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getStartSession();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.START_SESSION__SESSION:
    		return getSession();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.START_SESSION__SESSION:
    		return getSession() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.START_SESSION__SESSION:
    		setSession(
    		(org.thingml.xtext.thingML.Session)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
