package com.example.bootdemo.exception;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException() {
    }

    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
