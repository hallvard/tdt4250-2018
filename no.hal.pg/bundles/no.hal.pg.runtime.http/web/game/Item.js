// React component for Item

/*
this.props:
{
	datarUrl: service URL
	item: item
	itemNum: item number
}
 */

var md = new Remarkable();
md.renderer = new Renderer()

class Item extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
	}

	displayName() {
		return "Item component"
	}

  	render() {
	    	return React.createElement(
      		"div", { className: "item" },
      			"Item " + this.props.itemNum + " - ",
      			md.render(this.props.item.description)
    		);
  	}
}
