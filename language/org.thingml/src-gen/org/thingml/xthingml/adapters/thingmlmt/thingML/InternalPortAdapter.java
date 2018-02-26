package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.InternalPort;

@SuppressWarnings("all")
public class InternalPortAdapter extends EObjectAdapter<InternalPort> implements org.thingml.xtext.thingML.InternalPort {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public InternalPortAdapter() {
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
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  private EList<Message> sends_;
  
  @Override
  public EList<Message> getSends() {
    if (sends_ == null)
    	sends_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSends(), adaptersFactory, eResource);
    return sends_;
  }
  
  private EList<Message> receives_;
  
  @Override
  public EList<Message> getReceives() {
    if (receives_ == null)
    	receives_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReceives(), adaptersFactory, eResource);
    return receives_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getInternalPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__SENDS:
    		return getSends();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__RECEIVES:
    		return getReceives();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__SENDS:
    		return getSends() != null && !getSends().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__RECEIVES:
    		return getReceives() != null && !getReceives().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__SENDS:
    		getSends().clear();
    		getSends().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.INTERNAL_PORT__RECEIVES:
    		getReceives().clear();
    		getReceives().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}