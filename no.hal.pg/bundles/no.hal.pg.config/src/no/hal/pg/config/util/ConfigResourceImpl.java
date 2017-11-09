/**
 */
package no.hal.pg.config.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.util.ConfigResourceFactoryImpl
 * @generated
 */
public class ConfigResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public ConfigResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		// avoid problem with serializing OSM objects as XML, not XMI
		if (options != null) {
			options.remove(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE);
		}
		super.doLoad(inputStream, options);
	}

} //ModelResourceImpl
