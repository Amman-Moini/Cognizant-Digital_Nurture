import React from 'react';

const OfficeList = () => {
  const officeSpaces = [
    {
      name: "EcoHub Workspace",
      rent: 55000,
      address: "Bengaluru, India",
      image: "https://www.executivecentre.com/_next/image/?url=%2F_next%2Fstatic%2Fmedia%2FplanOverview-po-officeTypeSize.a1e2463e.jpg&w=640&q=75"
    },
    {
      name: "TechSquare Towers",
      rent: 72000,
      address: "Hyderabad, India",
      image: "https://www.executivecentre.com/_next/image/?url=%2F_next%2Fstatic%2Fmedia%2FplanOverview-po-moveIn.010a8557.jpg&w=640&q=75"
    },
    {
      name: "Startup Den",
      rent: 60000,
      address: "Pune, India",
      image: "https://www.executivecentre.com/_next/image/?url=%2F_next%2Fstatic%2Fmedia%2FplanOverview-po-exploreWorkspace.bbe105c8.jpg&w=640&q=75"
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1 style={{align:'center'}}>Office Space, at Affordable Range</h1>
      {officeSpaces.map((office, index) => (
        <div key={index} style={{
          border: '1px solid #ddd',
          padding: '10px',
          marginBottom: '15px',
          borderRadius: '8px'
        }}>
          
          <img src={office.image} alt={office.name} style={{ width: '300px', height: '200px' }} />
          <h2>{office.name}</h2>
          
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
};

export default OfficeList;