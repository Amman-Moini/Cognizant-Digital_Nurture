import logo from './logo.svg';
import './App.css';
import {CalculatorScore} from '../src/Components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculatorScore Name={"Steeve"}
      School={"DNV Public School"}
      total={284}
      goal={3}
      />
    </div>
  );
}

export default App;
