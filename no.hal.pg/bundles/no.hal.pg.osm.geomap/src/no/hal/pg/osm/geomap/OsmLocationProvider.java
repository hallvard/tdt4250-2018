package no.hal.pg.osm.geomap;

import org.eclipse.nebula.widgets.geomap.PointD;
import org.eclipse.nebula.widgets.geomap.jface.LocationProvider;

import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.geoutil.LatLong;

public class OsmLocationProvider implements LocationProvider {

	@Override
	public PointD getLonLat(Object element) {
		if (element instanceof GeoLocated) {
			LatLong latLong = ((GeoLocated) element).getLatLong();
			if (latLong != null) {
				return new PointD(latLong.longitude, latLong.latitude);
			}
		}
		return null;
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
