package com.example.nanalibrary.exceptions;

public class EmptyLibraryException extends RuntimeException {
    public EmptyLibraryException() {
        super("No books registered.");
    }
}
