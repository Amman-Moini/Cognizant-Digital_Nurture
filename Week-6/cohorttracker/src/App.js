import React from 'react';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 
import styles from './CohortDetails.module.css';

function App() {
 
  return (
  <div className={styles.Container}>

    <h1>Cohorts Details</h1>
    <p>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
    </p>
  </div>
  );
}

export default App;
