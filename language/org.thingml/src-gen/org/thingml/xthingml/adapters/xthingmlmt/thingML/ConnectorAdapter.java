package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Connector;
import org.thingml.xthingmlmt.thingML.Instance;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.ProvidedPort;
import org.thingml.xthingmlmt.thingML.RequiredPort;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements org.thingml.xthingmlmt.thingML.Connector {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
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
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public Instance getCli() {
    return (Instance) adaptersFactory.createAdapter(adaptee.getCli(), eResource);
  }
  
  @Override
  public void setCli(final Instance o) {
    if (o != null)
    	adaptee.setCli(((org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter) o).getAdaptee());
    else adaptee.setCli(null);
  }
  
  @Override
  public RequiredPort getRequired() {
    return (RequiredPort) adaptersFactory.createAdapter(adaptee.getRequired(), eResource);
  }
  
  @Override
  public void setRequired(final RequiredPort o) {
    if (o != null)
    	adaptee.setRequired(((org.thingml.xthingml.adapters.xthingmlmt.thingML.RequiredPortAdapter) o).getAdaptee());
    else adaptee.setRequired(null);
  }
  
  @Override
  public Instance getSrv() {
    return (Instance) adaptersFactory.createAdapter(adaptee.getSrv(), eResource);
  }
  
  @Override
  public void setSrv(final Instance o) {
    if (o != null)
    	adaptee.setSrv(((org.thingml.xthingml.adapters.xthingmlmt.thingML.InstanceAdapter) o).getAdaptee());
    else adaptee.setSrv(null);
  }
  
  @Override
  public ProvidedPort getProvided() {
    return (ProvidedPort) adaptersFactory.createAdapter(adaptee.getProvided(), eResource);
  }
  
  @Override
  public void setProvided(final ProvidedPort o) {
    if (o != null)
    	adaptee.setProvided(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ProvidedPortAdapter) o).getAdaptee());
    else adaptee.setProvided(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__CLI:
    		return getCli();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__REQUIRED:
    		return getRequired();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__SRV:
    		return getSrv();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__PROVIDED:
    		return getProvided();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__CLI:
    		return getCli() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__REQUIRED:
    		return getRequired() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__SRV:
    		return getSrv() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__PROVIDED:
    		return getProvided() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__CLI:
    		setCli(
    		(org.thingml.xthingmlmt.thingML.Instance)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__REQUIRED:
    		setRequired(
    		(org.thingml.xthingmlmt.thingML.RequiredPort)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__SRV:
    		setSrv(
    		(org.thingml.xthingmlmt.thingML.Instance)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONNECTOR__PROVIDED:
    		setProvided(
    		(org.thingml.xthingmlmt.thingML.ProvidedPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
