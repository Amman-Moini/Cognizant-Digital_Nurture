
package com.example.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {


    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    private static final Logger instance = new Logger();


    private Logger() {
        System.out.println("Logger instance created at: " + dtf.format(LocalDateTime.now()));
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        // 'dtf' will also be non-null here
        System.out.println("[" + dtf.format(LocalDateTime.now()) + "] LOG: " + message);
    }
}