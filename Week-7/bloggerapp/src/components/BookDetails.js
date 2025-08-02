const BookDetails = () => {
    const books = [
      { id: 1, title: "Master React", price : 670},
      { id: 2, title: "Deep Dive into Angular 11", price : 800 },
      { id: 3, title: "Mongo Essentials" , price : 450}
    ];
  
    return (
      <div>
        <h1>Book Details</h1>
            {books.map(book => (

              <>
              <h4>{book.title}</h4>
                {book.price}
              </>

          ))}
      </div>
    );
  };
  
  export default BookDetails;