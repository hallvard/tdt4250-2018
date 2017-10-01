// React component for Task

/*
this.props:
{
}
this.state:
{
	result: true
}
 */

var AcceptTaskComponent = React.createClass({
	displayName: "AcceptTask component",

	getInitialState: function() {
		var comp = this;
		AppUtils.loadData(this.props.serviceUrl, true, function(response) {
			comp.setState({
				result : response.result
			});
		});
		return { result: false };
	},

	accept: function accept() {
	},

  	render: function render() {
  		var divClass = "accept-task";
//  		var serviceUrl = this.props.serviceUrl; 
// 		var taskLink = AppUtils.appUrl(serviceUrl);
//  		var player = this.props.player;
//  		if (typeof player === 'object') {
//  			taskLink = taskLink + '?player=' + player.ids[0];
//  		}

    	return React.createElement(
      		"div", { className: divClass },
      		React.createElement(
      			"form", {},
	      		React.createElement(
      				"input", { type: "button", value: "Accept", onclick: "accept()" }
				)
      		)
    	);
  	}
});
