package thingml.k3.test

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Before
import org.junit.Test
import org.thingml.xtext.thingML.Configuration
import org.thingml.xtext.thingML.ThingMLModel

import static extension thingml.k3.AConfiguration.*

abstract class ThingmlTestSuite {
	protected String modelName
	private Configuration config
	
	@Before
	def void setUp() {
		val rs = new ResourceSetImpl()
		val uri = "thingml.samples/models/" + modelName + ".thingml"
		val res = rs.getResource(URI::createPlatformPluginURI(uri, true), true)
		config = (res.contents.head as ThingMLModel).configs.head
	}

	@Test
	def void fullTest() {
		println(">>> EXECUTING FULL TEST FOR MODEL '" + modelName + "'")
		config.setLogLevel(0)
		config.init(new BasicEList<String>())
		config.main()
	}
}
