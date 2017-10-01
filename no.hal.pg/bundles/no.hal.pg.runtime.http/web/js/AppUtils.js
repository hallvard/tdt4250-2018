// App Utilities object

var AppUtils = {
	
	LOGGING_ERROR: 1,
	LOGGING_WARNING: 2,
	LOGGING_INFO: 3,

	loggingLevel: 3,

	log: function(message) {
		var level = this.loggingLevel;
		if (arguments.length > 1) {
			level = arguments[1];
		}
		if (level >= this.loggingLevel) {
			console.log(message);
		}
	},
	
	dataUrl: function(dataUrl) {
		if (dataUrl.indexOf("?") === 0) {
			dataUrl = dataUrl.substring(1);
		}
		if (dataUrl.indexOf(":") > 5) {
			dataUrl = window.location.origin + dataUrl;
		}
		return dataUrl;
	},

	appUrl: function(dataUrl) {
		return dataUrl.replace("/data/", "/app/");
	},
	
	resolveUrl(relativeUrl) {
		if (relativeUrl.charAt(0) != '/') {
			relativeUrl = "/" + relativeUrl;
		}
		var baseUrl = document.URL;
		return baseUrl.substring(0, baseUrl.lastIndexOf("/")) + relativeUrl;
	},

	submitData : function(theUrl) {
		this.loadData(theUrl, false, null, function() {});
	},

	loadData : function(theUrl, asArray, def, callback) {
		var isAsync = typeof callback === 'function';
		var xmlHttp = new XMLHttpRequest();
		if (isAsync) {
			var responseObject = this.responseObject;
			var self = this;
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4) {
					var result = def;
					if (xmlHttp.status == 200) {
						result = self.responseObject(xmlHttp.responseText, asArray);
					}
					callback(result);
				}
			}
		}
		xmlHttp.open("GET", theUrl, isAsync);
		this.log("Sent request: " + theUrl);
		xmlHttp.send(null);
		return (isAsync ? null : this.responseObject(xmlHttp.responseText, asArray));
	},

	isArray: function(object) {
		return (Array.isArray && Array.isArray(object));
	},

	asArray: function(object, asArray) {
		if (! (typeof asArray === 'boolean')) {
			asArray = true;
		}
		if (asArray != this.isArray(object)) {
			if (asArray) {
				object = [object];
			} else {
				object = object[0];
			}
		}
		return object;
	},
	
	responseObject: function(responseText, asArray) {
		var response = responseText;
		if (typeof response === 'string') {
			response = JSON.parse(response);
		}
		response = this.asArray(response, asArray);
		this.log("Response: " + responseText + " -> " + response, this.LOGGING_INFO);
		return response;
	}
};
module.exports = AppUtils;
