// File: LibraryManagement/src/main/java/com/library/MainApplication.java
package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main(String[] args) {
        // 1. Load the Spring application context from the XML file
        System.out.println("Loading Spring context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring context loaded successfully.");

        // 2. Retrieve the BookService bean from the context
        BookService bookService = context.getBean("bookService", BookService.class);

        // 3. Use the bean to call a method
        System.out.println("\nCalling service method...");
        bookService.displayBookDetails(101);

        // 4. Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}