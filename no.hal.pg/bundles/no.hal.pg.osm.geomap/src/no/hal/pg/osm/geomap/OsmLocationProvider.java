package no.hal.pg.osm.geomap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.nebula.widgets.geomap.jface.LocationProvider;

import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.geoutil.LatLong;

public class OsmLocationProvider implements LocationProvider {

	protected PointD getLonLat(Object element, int distance) {
		if (element instanceof GeoLocated) {
			LatLong latLong = ((GeoLocated) element).getLatLong();
			if (latLong != null) {
				return new PointD(latLong.longitude, latLong.latitude);
			}
		} else if (element instanceof EObject && distance > 0) {
			EObject eObject = (EObject) element;
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (! (ref.isContainer() || ref.isContainment())) {
					Object value = eObject.eGet(ref);
					PointD point = getLonLat(value, distance - 1);
					if (point != null) {
						return point;
					}
				}
			}
		}
		return null;
	}
	
	@Override
	public PointD getLonLat(Object element) {
		return getLonLat(element, 1);
	}

	@Override
	public boolean setLonLat(Object element, double lon, double lat) {
		if (element instanceof GeoLocation) {
			((GeoLocation) element).setLatitude((float) lat);
			((GeoLocation) element).setLongitude((float) lon);
			return true;
		} else  if (element instanceof GeoLatLong) {
			((GeoLatLong) element).setLocation(new LatLong(lat, lon));
			return true;
		}
		return false;
	}
}
