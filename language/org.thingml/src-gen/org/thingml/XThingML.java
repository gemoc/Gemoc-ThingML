package org.thingml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.thingml.ThingMLMT;
import org.thingml.XThingMLMT;

@SuppressWarnings("all")
public class XThingML implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XThingML load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XThingML mm = new XThingML();
    mm.setResource(res);
    return mm ;
  }
  
  public ThingMLMT toThingMLMT() {
    org.thingml.xthingml.adapters.thingmlmt.XThingMLAdapter adaptee = new org.thingml.xthingml.adapters.thingmlmt.XThingMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XThingMLMT toXThingMLMT() {
    org.thingml.xthingml.adapters.xthingmlmt.XThingMLAdapter adaptee = new org.thingml.xthingml.adapters.xthingmlmt.XThingMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
