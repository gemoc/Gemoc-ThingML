package org.thingml.xthingml.adapters.thingmlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.thingml.ThingMLMT;
import org.thingml.xtext.thingML.ThingMLFactory;

@SuppressWarnings("all")
public class XThingMLAdapter extends ResourceAdapter implements ThingMLMT {
  public XThingMLAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ThingMLFactory getThingMLFactory() {
    return new org.thingml.xthingml.adapters.thingmlmt.thingml.ThingMLFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getThingMLFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
