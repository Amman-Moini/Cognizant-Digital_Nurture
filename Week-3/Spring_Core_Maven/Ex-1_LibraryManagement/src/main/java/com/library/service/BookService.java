
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService bean created.");
    }

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setting BookRepository dependency in BookService.");
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails(int id) {
        String bookTitle = bookRepository.findBookById(id);
        System.out.println("Book with ID " + id + " is: " + bookTitle);
    }
}