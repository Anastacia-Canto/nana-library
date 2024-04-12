package com.example.nanalibrary.repositories;

import com.example.nanalibrary.entities.Book;

import java.util.List;

public interface LibraryRepository {
    List<Book> findBookByTitle(String title);

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByPublisher(String publisher);
}
