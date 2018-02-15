package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.State;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Session;

@SuppressWarnings("all")
public class SessionAdapter extends EObjectAdapter<Session> implements org.thingml.xtext.thingML.Session {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public SessionAdapter() {
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
    	adaptee.setInitial(((org.thingml.xthingml.adapters.thingmlmt.thingML.StateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  private EList<State> substate_;
  
  @Override
  public EList<State> getSubstate() {
    if (substate_ == null)
    	substate_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubstate(), adaptersFactory, eResource);
    return substate_;
  }
  
  @Override
  public Expression getMaxInstances() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getMaxInstances(), eResource);
  }
  
  @Override
  public void setMaxInstances(final Expression o) {
    if (o != null)
    	adaptee.setMaxInstances(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setMaxInstances(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean HISTORY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getSession();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__INITIAL:
    		return getInitial();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__HISTORY:
    		return isHistory() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__SUBSTATE:
    		return getSubstate();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__MAX_INSTANCES:
    		return getMaxInstances();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__INITIAL:
    		return getInitial() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__HISTORY:
    		return isHistory() != HISTORY_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__SUBSTATE:
    		return getSubstate() != null && !getSubstate().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__MAX_INSTANCES:
    		return getMaxInstances() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__INITIAL:
    		setInitial(
    		(org.thingml.xtext.thingML.State)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__HISTORY:
    		setHistory(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__SUBSTATE:
    		getSubstate().clear();
    		getSubstate().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.SESSION__MAX_INSTANCES:
    		setMaxInstances(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
