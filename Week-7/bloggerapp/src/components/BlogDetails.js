const BlogDetails = () => {
    const blogs = [
      { id: "b1", title: "React Learning", author:"Stephen Biz", mssg: "Welcome to learning React" },
      { id: "b2", title: "Installation",author:"Schewzdenier", mssg: "You can install React from npm" },
    ];
  
    return (
      <div>
        <h1> Blog Details</h1>
        
          {blogs.map(blog => (
            <>
            <h1>{blog.title}</h1>
            <p>{blog.author}</p>
            <p>{blog.mssg}</p>
            </>
          ))}

      </div>
    );
  };
  
  export default BlogDetails;