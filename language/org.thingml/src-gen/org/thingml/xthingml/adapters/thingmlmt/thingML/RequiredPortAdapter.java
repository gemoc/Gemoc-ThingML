package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.RequiredPort;

@SuppressWarnings("all")
public class RequiredPortAdapter extends EObjectAdapter<RequiredPort> implements org.thingml.xtext.thingML.RequiredPort {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public RequiredPortAdapter() {
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
  public boolean isOptional() {
    return adaptee.isOptional();
  }
  
  @Override
  public void setOptional(final boolean o) {
    adaptee.setOptional(o);
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
  
  protected final static boolean OPTIONAL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getRequiredPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__NAME:
    		return getName();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__SENDS:
    		return getSends();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__RECEIVES:
    		return getReceives();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__OPTIONAL:
    		return isOptional() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__SENDS:
    		return getSends() != null && !getSends().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__RECEIVES:
    		return getReceives() != null && !getReceives().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__OPTIONAL:
    		return isOptional() != OPTIONAL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__SENDS:
    		getSends().clear();
    		getSends().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__RECEIVES:
    		getReceives().clear();
    		getReceives().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.REQUIRED_PORT__OPTIONAL:
    		setOptional(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
