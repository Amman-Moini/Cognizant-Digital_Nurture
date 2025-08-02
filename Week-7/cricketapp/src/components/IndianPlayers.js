import React from 'react';

const IndianPlayers = () => {
  const oddTeam = {
    First : "Sachin1", 
    Third : "Virat3", 
    Fifth :"Yuvaraj5"
  };
  const evenTeam = {
    Second : "Dhoni2",
    Forth : "Rohit4",
    Sixth :  "Raina6"
  };

  const T20players = ["First", "Second", "Third"];
  const RanjiTrophy = ["Fourth", "Fifth", "Sixth"];

  const allIndianPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {Object.entries(oddTeam).map(([key, player]) => (
            <li key={key}>{key} : {player}</li>
        ))}
      </ul>



        <h2>Even Players</h2>
        <ul>
        {Object.entries(evenTeam).map(([key, player]) => (
            <li key={key}>{key} : {player}</li>
        ))}
        </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allIndianPlayers.map((player, index) => (
          <li key={index}>Mr. {player} Player</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;