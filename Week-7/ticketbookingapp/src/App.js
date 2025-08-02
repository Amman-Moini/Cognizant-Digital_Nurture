import React, { useState } from 'react';
import Greeting from './components/Greeting';
import LoginControl from './components/LoginControl';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: '20px', align:'center'}}>
      <Greeting isLoggedIn={isLoggedIn} />

      <LoginControl
        isLoggedIn={isLoggedIn}
        onLogin={handleLogin}
        onLogout={handleLogout}
      />



    </div>
  );
}

export default App;