const GuestGreeting = () => <h2>Please sign up</h2>;
const UserGreeting = () => <h2>Welcome, back.</h2>;

const Greeting = ({ isLoggedIn }) => {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
};

export default Greeting;