package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Region;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.State;

@SuppressWarnings("all")
public class RegionAdapter extends EObjectAdapter<Region> implements org.thingml.xthingmlmt.thingML.Region {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public RegionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
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
  public boolean isHistory() {
    return adaptee.isHistory();
  }
  
  @Override
  public void setHistory(final boolean o) {
    adaptee.setHistory(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public State getInitial() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitial(), eResource);
  }
  
  @Override
  public void setInitial(final State o) {
    if (o != null)
    	adaptee.setInitial(((org.thingml.xthingml.adapters.xthingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  private EList<State> substate_;
  
  @Override
  public EList<State> getSubstate() {
    if (substate_ == null)
    	substate_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubstate(), adaptersFactory, eResource);
    return substate_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean HISTORY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getRegion();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__INITIAL:
    		return getInitial();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__HISTORY:
    		return isHistory() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__SUBSTATE:
    		return getSubstate();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__INITIAL:
    		return getInitial() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__HISTORY:
    		return isHistory() != HISTORY_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__SUBSTATE:
    		return getSubstate() != null && !getSubstate().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__INITIAL:
    		setInitial(
    		(org.thingml.xthingmlmt.thingML.State)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__HISTORY:
    		setHistory(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.REGION__SUBSTATE:
    		getSubstate().clear();
    		getSubstate().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
