
package com.library.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository bean created.");
    }

    public String findBookById(int id) {
        
        return "The Great Gatsby";
    }
}
