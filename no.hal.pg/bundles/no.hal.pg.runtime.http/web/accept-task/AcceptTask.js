// React component for Task

/*
this.props:
{
	isStarted, isFinished,
	locationLatitude, locationLongitude
}
this.state:
{
	isStarted, isFinished,
	locationLatitude, locationLongitude
}
 */

class AcceptTaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
		// make sure this in callbacks refer to this
		this.accept = this.accept.bind(this);
	}

	displayName() {
		return "AcceptTask component";
	}

	accept() {
		var comp = this;
		AppUtils.loadData(this.state.dataUrl + "/accept()", false, this.state, function(acceptTaskView) {
			comp.setState(acceptTaskView);
		});
	}

  	render() {
  		var divClass = "accept-task";
	    	return React.createElement(
      		"div", { className: divClass },
  			(this.state.isFinished ?
	      		React.createElement("h3", {}, "Already accepted") :
	      		React.createElement("form", {},
		      		React.createElement("input", { type: "button", value: "Accept", onClick: this.accept })
		      	)
      		)
    		);
  	}
}
