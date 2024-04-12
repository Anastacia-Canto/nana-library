package com.example.nanalibrary.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmptyLibraryException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    RestErrorResponse handleEmptyLibraryException(EmptyLibraryException e) {
        return new RestErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
    }


    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    RestErrorResponse handleBookNotFoundException(BookNotFoundException e) {
        return new RestErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
    }
}
