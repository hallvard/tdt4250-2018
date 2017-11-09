// React component for ExampleTask

/*
this.props:
{
	serviceUrl: the url that returns the current ExampleTask object
}
this.state:
{
	question: the question
	accepted: true, false or undefined depending on the submitted answer
}
*/

var QComponent = React.createClass({
	displayName : "Question component",

	getInitialState : function() {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl, false, function(response) {
			AppHelper.log("Question: " + response.question, AppHelper.LOGGING_INFO);
			comp.setState({
				question : response.question
			});
		});
		return {
			question : this.props.question
		};
	},

	testSubmitValue : function(value) {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl + '/proposeAnswer?proposal=' + value, false, function(response) {
			AppHelper.log("Accepted: " + response, AppHelper.LOGGING_INFO);
			comp.setState({
				accepted: response
			})
		});
	},

	render : function render() {
		var submit = this.testSubmitValue, accepted = this.state.accepted;
		return React.createElement("div", null,
				React.createElement("h2", null, this.state.question),
				React.createElement("div", null,
					React.createElement("button",
							{ onClick : function() { submit(true); } },
							"Yes"),
					React.createElement("button",
							{ onClick : function() { submit(false); } },
							"No")
					),
				React.createElement("h2", null, (typeof accepted === 'boolean' ? (accepted ? "Correct" : "Incorrect") : ""))
		);
	}
});
