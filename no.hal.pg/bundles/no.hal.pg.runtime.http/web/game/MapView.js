// React component for Map

/*
this.props
{
	centerLatitude: 63.41929, centerLongitude: 10.401694, zoom: 13,
	markers: [{
		latitude: 63.41929, longitude: 10.401694,
		text: "You're here",
		radius: 0
	}],
	setClientPositionHandler: #(),
	navigateHandler: #()
}
*/

var MapView = React.createClass({
	displayName: "Map view",

	createMarker: function(marker, num) {
		var popup = React.createElement(ReactLeaflet.Popup, null,
						React.createElement("span", {}, marker.text)
		);
		if (typeof marker.radius === "number" && marker.radius != 0) {
			var circleClass = (marker.radius > 0 ? ReactLeaflet.Circle : ReactLeaflet.CircleMarker);
			var circleProps = { key: num, center: [marker.latitude, marker.longitude], radius: marker.radius };
			if (typeof marker.color !== "undefined") {
				circleProps.color = marker.color;
			}
			return React.createElement(circleClass, circleProps, popup);
		} else {
			return React.createElement(ReactLeaflet.Marker, { key: num, position: [marker.latitude, marker.longitude] },
				popup
			);
		}
	},

	createMarkers: function() {
		var createMarker = this.createMarker;
		var num = 0;
		return this.props.markers.map(function(item) { num = num + 1; return createMarker(item, num); });
	},

	handleClientMove: function(position, center) {
		// { coords: { latitude: ..., longitude: ... }};
	    var leafletMap = this.refs.mapComp.leafletElement;
	    if (center) {
	    		var zoom = this.refs.mapComp.leafletElement.getZoom();
	    		leafletMap.setView([position.coords.latitude, position.coords.longitude], zoom);
	    	}
		this.props.clientPositionHandler(position);
	},

	onMapClick: function(event) {
		AppUtils.log("You clicked the map at " + event.latlng);
		var position = { coords: { latitude: event.latlng.lat, longitude: event.latlng.lng }};
		this.handleClientMove(position, false);
	},
	
	navigate: function(event) {
		var leafletMap = event.target;
		this.props.navigateHandler(leafletMap.getCenter(), leafletMap.getZoom());
	},

	tileServers: [
		"http://{s}.tile.osm.org/{z}/{x}/{y}.png",
		"http://opencache.statkart.no/gatekeeper/gk/gk.open_gmaps?layers=topo2&zoom={z}&x={x}&y={y}"
	],

	onGeoLocationChanged: function(position) {
		this.handleClientMove(position, true);
	},

	componentWillMount: function() {
		if (typeof this.props.clientPositionHandler !== "undefined") {
			navigator.geolocation.watchPosition(this.onGeoLocationChanged);
		}
	},

	componentDidUpdate: function() {
	    var leafletMap = this.refs.mapComp.leafletElement;
	    leafletMap.on('moveend', this.navigate);
	    leafletMap.on('zoomend', this.navigate);
	},

  	render: function() {
		AppUtils.log("Showing map at: " + this.props.centerLatitude + "," + this.props.centerLongitude);
		this.mapComp = React.createElement(ReactLeaflet.Map, { ref: 'mapComp', center: [this.props.centerLatitude, this.props.centerLongitude], zoom: this.props.zoom, onClick: this.onMapClick },
    			React.createElement(ReactLeaflet.TileLayer, { url: this.tileServers[1], attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors' }),
			this.createMarkers()
		);
		return this.mapComp;
  	}
});