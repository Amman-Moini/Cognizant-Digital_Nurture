const LoginButton = ({ onClick }) => (
    <button onClick={onClick}>Login</button>
  );
  
  const LogoutButton = ({ onClick }) => (
    <button onClick={onClick}>Logout</button>
  );
  
  const LoginControl = ({ isLoggedIn, onLogin, onLogout }) => {
    let button;
 
    if (isLoggedIn) {
      button = <LogoutButton onClick={onLogout} />;
    } else {
      button = <LoginButton onClick={onLogin} />;
    }
  
    return <div>{button}</div>;
  };
  
  export default LoginControl;