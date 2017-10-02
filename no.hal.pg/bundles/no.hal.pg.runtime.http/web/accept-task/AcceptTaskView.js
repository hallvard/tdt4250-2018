// React component for Task

/*
this.props:
{
	started: false,
	finished: false
}
this.state:
{
	started: false,
	finished: false
}
 */

class AcceptTaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
		// make sure this in callbacks refer to this
		this.accept = this.accept.bind(this);
		this.navigateReturnUrl = this.navigateReturnUrl.bind(this);
	}

	displayName() {
		return "AcceptTask component";
	}

	accept() {
		var comp = this;
		AppUtils.loadData(this.state.dataUrl + "/accept", false, this.state, function(acceptTaskView) {
			comp.state = acceptTaskView;
		});
	}

	navigateReturnUrl() {
		if (typeof this.props.returnUrl !== 'undefined') {
			window.location.href = this.props.returnUrl;
		}
	}	

  	render() {
  		var divClass = "accept-task";
	    	return React.createElement("div", { className: divClass },
  			(this.state.finished ?
	      		React.createElement("h3", {}, "Already accepted") :
	      		React.createElement("button", { onClick: this.accept }, "Accept")
	      	),
			React.createElement("button", { className: "back", onClick: this.navigateReturnUrl }, "Back to task list")
	    	);
  	}
}
