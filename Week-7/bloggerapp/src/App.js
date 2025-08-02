import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import "./App.css"

function App() {

  return (
    <div style={{ padding: '20px' }}>
      <div class="container">
        <div class="box">
           <CourseDetails/>
        </div>
        <div class="divider"></div>
        <div class="box"><BookDetails/>
        </div>
        <div class="divider"></div>
        <div class="box">
        <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;