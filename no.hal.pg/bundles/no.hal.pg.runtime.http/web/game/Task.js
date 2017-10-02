// React component for Task

/*
this.props:
{
	datarUrl: service URL
	task: task
	taskNum: task number
}
this.state:
{
	canStart, isStarted, isFinished, getDescription:
}
 */

class Task extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
	}

	displayName() {
		return "Task component"
	}

  	render() {
  		var divClass = "task";
  		if (this.state.task.isFinished) {
  			divClass = "finishedTask";
  		} else if (this.state.task.isStarted) {
  			divClass = "startedTask";
  		} else if (this.state.task.canStart) {
  			divClass = "enabledTask";
		}
  		var taskLink = AppUtils.appUrl(this.props.dataUrl);
	    	return React.createElement(
      		"div", { className: divClass },
  			"Task " + this.props.taskNum + " - " + this.props.task.getDescription
    		);
  	}
}
