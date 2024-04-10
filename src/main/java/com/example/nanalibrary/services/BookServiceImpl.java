package com.example.nanalibrary.services;

import com.example.nanalibrary.entities.Book;
import com.example.nanalibrary.repositories.BookRepository;
import com.example.nanalibrary.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements LibraryRepository {

    @Autowired
    BookRepository bookRepository;


    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveAllBooks(List<Book> books) {
        return (List<Book>) bookRepository.saveAll(books);
    }

    public List<Book> findAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public Optional<Book> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        if (!title.isEmpty() && title != null) {
            return findAllBooks().stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        if (!author.isEmpty() && author != null) {
            return findAllBooks().stream().filter(book -> book.getAuthors().contains(author)).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public List<Book> findBookByPublisher(String publisher) {
        if (!publisher.isEmpty() && publisher != null) {
            return findAllBooks().stream().filter(book -> book.getPublisher().equalsIgnoreCase(publisher)).collect(Collectors.toList());
        }
        return null;
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    public void deleteAllBooks(List<Book> books) {
        bookRepository.deleteAll(books);
    }

}
