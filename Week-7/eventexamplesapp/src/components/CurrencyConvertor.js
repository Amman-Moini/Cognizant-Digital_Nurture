import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = () => {
    const result = (parseFloat(rupees) * 0.00985).toFixed(2); 
    alert(result);
  };

  return (
    <div style={{ marginTop: '40px' }}>
      <h2>💱 Currency Convertor</h2>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={e => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
    </div>
  );
};

export default CurrencyConvertor;