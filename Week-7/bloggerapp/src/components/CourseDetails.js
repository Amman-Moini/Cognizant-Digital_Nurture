const CourseDetails = () => {
    const courses = [
      { id: "c1", name: "Angular", date: "4/5/2021" },
      { id: "c2", name: "React", date: "6/3/2021" },
    ];
  
    return (
      <div>
        <h1> Course Details</h1>
          {courses.map(course => (
            <>
            <h1>{course.name}</h1>
            <p>{course.date}</p>
            </>
          ))}
      </div>
    );
  };
  
  export default CourseDetails;