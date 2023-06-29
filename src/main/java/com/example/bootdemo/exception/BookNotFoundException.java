package com.example.bootdemo.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
