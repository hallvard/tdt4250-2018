// React component for ExampleTask

/*
this.props:
{
	dataUrl: the url that returns the current ExampleTask object
}
this.state:
{
	question: the question
	accepted: true, false or undefined depending on the submitted answer
}
*/

class QuestionAnswerComponent extends React.Component {

	constructor(props) {
		super(props);
		this.state = props;
		this.testSubmitValue = this.testSubmitValue.bind(this);
		this.navigateReturnUrl = this.navigateReturnUrl.bind(this);
	}

	displayName() {
		return "Question component";
	}

	testSubmitValue(value) {
		var comp = this;
		AppUtils.loadData(this.props.dataUrl + '/proposeAnswer?proposal=' + value, false, false, function(response) {
			AppUtils.log("Accepted: " + response, AppUtils.LOGGING_INFO);
			comp.setState({
				accepted: response
			})
		});
	}

	navigateReturnUrl() {
		if (typeof this.props.returnUrl !== 'undefined') {
			window.location.href = this.props.returnUrl;
		}
	}	

	render() {
		var submit = this.testSubmitValue, accepted = this.state.accepted;
		return React.createElement("div", null,
				React.createElement("h2", null, this.state.question),
				(typeof accepted === 'boolean' ? 
					React.createElement("h2", null, (accepted ? "Correct" : "Incorrect")) :
					React.createElement("div", null,
						React.createElement("button", { onClick : function() { submit(true); }}, "Yes"),
						React.createElement("button", { onClick : function() { submit(false); }}, "No")
					)
				),
				React.createElement("button", { className: "back", onClick: this.navigateReturnUrl }, "Back to task list"),
				
		);
	}
}
