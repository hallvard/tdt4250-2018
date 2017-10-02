// React component for Player list

/*
this.props:
{
	dataUrl: the url that returns the current Game object
	players:
	[]
	tasks:
	[]
}
this.state:
{
	players:
	[]
	tasks:
	[]
}
*/

class Game extends React.Component {

	constructor(props) {
		super(props);
		this.state = props;
	}

	displayName() {
		return "Game component";
	}
	
  	render() {
  		var dataUrl = this.props.dataUrl;
  		var num = 0;
  		var playerComponents = this.state.players.map(function(player) {
      		var comp = React.createElement(PlayerComponent,
      						{ dataUrl: dataUrl + '/players/' + num + player, player: player, compact: true }
      					);
      		num = num + 1;
      		return comp;
  		});
  		
  		var taskRows = this.state.tasks.map(function(task, idx) {
      		return React.createElement(
          		"tr", { key: idx },
    	    			React.createElement(
    	      			"td", { className: "taskItem" },
    		    			React.createElement(Task, { dataUrl: dataUrl + '/tasks/' + idx, task: task, taskNum: (idx + 1) })
    	 			)
          	);
  		});
    		var taskList = React.createElement(
      		"table", { className: "taskList" },
      		React.createElement("tbody", null, taskRows)
    		);
	    	return React.createElement("div", { className: "game" },
      		React.createElement("div", { className: "playerList" },
	    			React.createElement("h2", null, "Players"),
	    			playerComponents
	    		),
	    		React.createElement("h2", null, "Tasks"),
	    		taskList
    		);
  	}
}
