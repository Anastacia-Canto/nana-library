package com.example.nanalibrary.controllers;

import com.example.nanalibrary.entities.Book;
import com.example.nanalibrary.exceptions.BookNotFoundException;
import com.example.nanalibrary.exceptions.EmptyLibraryException;
import com.example.nanalibrary.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServiceImpl service;

    @GetMapping({"/api/books", "/api/books/"})
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = service.findAllBooks();
        if (books.isEmpty()) throw new EmptyLibraryException();
        return ResponseEntity.ok().body(books);
    }

    // extract values from URI path:
    // using PathVariable you should use a URI like /books/{id}

    // extract values from the query string:
    // using RequestParam you should use a URI like /books?id=3
//    @GetMapping("/books")
//    public List<Book> getBook(@RequestParam(value = "id", required = false, defaultValue = "0") Long id) {
//
//        return id == 0 ? (List<Book>) service.findAllBooks() : Arrays.asList(service.findBookById(id));
//    }

    // For simplicity, I will use PathVariable

    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long id) {
        return service.findBookById(id).map(ResponseEntity::ok).orElseThrow(() -> new BookNotFoundException(id));
    }
    // to handling exceptions: https://dev.to/noelopez/spring-rest-exception-handling-part-1-1jj2



}
