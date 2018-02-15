package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Import;

@SuppressWarnings("all")
public class ImportAdapter extends EObjectAdapter<Import> implements org.thingml.xthingmlmt.thingML.Import {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ImportAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getImportURI() {
    return adaptee.getImportURI();
  }
  
  @Override
  public void setImportURI(final String o) {
    adaptee.setImportURI(o);
  }
  
  @Override
  public String getFrom() {
    return adaptee.getFrom();
  }
  
  @Override
  public void setFrom(final String o) {
    adaptee.setFrom(o);
  }
  
  protected final static String IMPORT_URI_EDEFAULT = null;
  
  protected final static String FROM_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getImport();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__IMPORT_URI:
    		return getImportURI();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__FROM:
    		return getFrom();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__IMPORT_URI:
    		return getImportURI() != IMPORT_URI_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__FROM:
    		return getFrom() != FROM_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__IMPORT_URI:
    		setImportURI(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.IMPORT__FROM:
    		setFrom(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
