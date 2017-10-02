// React component for Player list

/*
this.props:
{
	dataUrl: the url that returns the current Game object
	player: { person : { } }
	taskViews: [ ]
}
this.state:
{
	player: { person : { } }
	taskViews: [ ]
}
*/

class GameView extends React.Component {

	constructor(props) {
		super(props);
		this.state = props;
	}

	displayName() {
		return "Game view component";
	}
	
	componentDidMount() {
		AppUtils.log("Did mount...");
		window.addEventListener('pageshow', function(event) {
			AppUtils.log("pageshow");
		});
		window.addEventListener('popstate', function(event) {
			AppUtils.log("popstate");
		});
	}

  	render() {
  		var dataUrl = this.props.dataUrl;
  		
  		var taskRows = this.state.taskViews.map(function(task, idx) {
      		return React.createElement(
          		"tr", { key: idx },
    	    			React.createElement(
    	      			"td", { className: "taskItem" },
    		    			React.createElement(TaskView, { dataUrl: dataUrl + '/taskViews/' + idx, task: task, taskNum: (idx + 1) })
    	 			)
          	);
  		});
    		var taskList = React.createElement(
      		"table", { className: "taskList" },
      		React.createElement("tbody", null, taskRows)
    		);
	    	return React.createElement("div", { className: "game" },
	    		React.createElement("h2", null, "Tasks"),
	    		taskList
    		);
  	}
}
