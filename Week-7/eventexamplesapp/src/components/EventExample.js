import React, { Component } from 'react';

class EventExample extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };

    this.handleWelcome = this.handleWelcome.bind(this);
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
    alert("Hello Member!")
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  handleWelcome() {
    alert(`Welcome`);
  }

  handleSyntheticEvent = (e) => {
    e.preventDefault(); 
    alert("I was clicked!");
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <hr />
        <button onClick={() => this.handleWelcome()}>
          Say Welcome
        </button>

        <hr />
        <button onClick={this.handleSyntheticEvent}>
          OnPress Synthetic Event
        </button>
      </div>
    );
  }
}

export default EventExample;