package no.hal.pg.runtime.http;

import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.core.JsonGenerator;

import no.hal.pg.http.impl.JsonEAttributeSerializer;
import no.hal.pg.http.impl.JsonEObjectSerializer;
import no.hal.pg.osm.geoutil.LatLong;

@Component
public class OsmJsonSerializer implements JsonEObjectSerializer, JsonEAttributeSerializer {

	@Override
	public boolean accept(EObject eObject) {
		return false;
	}

	@Override
	public void serialize(EObject eObject, JsonGenerator generator) throws IOException {
	}

	@Override
	public boolean accept(EObject eObject, EAttribute attr, Object value) {
		return value instanceof LatLong;
	}

	private boolean useFieldNameAsPrefix = true;
	
	@Override
	public void serialize(EObject eObject, EAttribute attr, Object value, String altFieldName, JsonGenerator generator) throws IOException {
		if (value instanceof LatLong) {
			LatLong latLong = (LatLong) value;
			String fieldName = altFieldName != null ? altFieldName : attr.getName();
			writeFieldName(fieldName, "latitude", generator);
			generator.writeNumber(latLong.latitude);
			writeFieldName(fieldName, "longitude", generator);
			generator.writeNumber(latLong.longitude);
		}
	}

	protected void writeFieldName(String prefix, String fieldName, JsonGenerator generator) throws IOException {
		if (useFieldNameAsPrefix) {
			fieldName = prefix + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
		}
		generator.writeFieldName(fieldName);
	}
}
