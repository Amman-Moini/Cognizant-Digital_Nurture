package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Executing setter injection for BookRepository.");
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String title = bookRepository.getBookTitle();
        System.out.println("The book title is: " + title);
    }
}