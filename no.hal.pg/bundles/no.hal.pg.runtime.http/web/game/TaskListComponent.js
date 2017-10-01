// React component for Task list

/*
this.props:
{
	dataUrl: service URL
	tasks: task list 
	[]
}
this.state:
{
	tasks: task list 
	[]
}
 */
var TaskListComponent = React.createClass({
	displayName: "Task list component",
	
	getInitialState : function() {
		var comp = this;
		AppUtils.loadData(this.props.dataUrl, true, function(response) {
			comp.setState({
				tasks : response
			});
		});
		return {
			tasks : this.props.tasks
		};
	},
	
//	setPlayer: function(player) {
//		this.setState({
//			player : player
//		});
//	},

  	render: function render() {
  		AppUtils.log("Task count: " + this.state.tasks.length, AppUtils.INFO);
  		var props = this.props;
  		var state = this.state;
  		var rows = this.state.tasks.map(function(task, idx) {
      		return React.createElement(
          		"tr", { key: idx },
    	    	React.createElement(
    	      		"td", { className: "taskItem" },
    		    	React.createElement(
    	 	    		TaskComponent, { dataUrl: props.dataUrl + '/' + idx, // player: state.player,
    	 	    							task: task, taskNum: (idx + 1)}
    	 	    	)
    	 		)
          	);
  		});
    	return React.createElement(
      		"table", { className: "taskList" },
      		React.createElement(
      			"tbody", null,
      			rows
      		)
    	);
  	}
});
