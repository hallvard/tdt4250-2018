// React component for Player list

/*
this.props:
{
	dataUrl: the url that returns the current Player object
	player : {
    		latitude : 0.0,
    		longitude : 0.0,
    		person : {
      		capabilities" : [ ],
      		name : "Hallvard Tr�tteberg",
      		ids : [ "hal@ntnu.no" ]
    		},
	    items : [ ]
	}
}
this.state:
{
	player : {
    		latitude : 0.0,
    		longitude : 0.0,
    		person : {
      		capabilities" : [ ],
      		name : "Hallvard Tr�tteberg",
      		ids : [ "hal@ntnu.no" ]
    		},
	    items : [ ]
	}
}
*/

var emailPattern = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var urlPattern = /(http|ftp|https):\/\/[\w-]+(\.[\w-]+)+([\w.,@?^=%&amp;:\/~+#-]*[\w@?^=%&amp;\/~+#-])?/;

class PlayerComponent extends React.Component {
	
	constructor(props) {
		super(props);
		this.state = props;
	}

	displayName() {
		return "Player component";
	}

  	render() {
  		var ids = (this.state.ids ? this.state.ids : []);
  		var idRows = (this.props.compact ? [] : ids.map(function(id) {
  			var url = null;
  			if (emailPattern.test(id)) {
  				url = "mailto:" + id;
  			} else if (urlPattern.test(id)) {
  				url = id;
  			}
      		return React.createElement("tr", { key: id },
    	    			React.createElement("td", { className: "playerId" },
    		    			(url != null ? React.createElement( "a", { href: url }, id ) : id)
    	 			)
          	);
  		}));
  		var playerLink = AppUtils.appUrl(this.props.dataUrl);
   	 	return React.createElement("table", { className: "player" },
      		React.createElement("tbody", null,
	    			React.createElement("tr", null,
		    	    	React.createElement("td", { className: "playerName" },
		        		    "Name: ",
	    	    			React.createElement( "a", { href: playerLink }, this.state.player.person.name )
		        	 	)
	    		),
	    		idRows
      		)
    	);
  	}
}
