package com.example.nanalibrary.config;

import com.example.nanalibrary.entities.Book;
import com.example.nanalibrary.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    BookServiceImpl repository;

    @Override
    public void run(String... args) throws Exception {

        Book b1 = new Book("Conversas Corajosas", Arrays.asList("Elisama Santos"), "Paz e Terra");
        Book b2 = new Book("Finding me", Arrays.asList("Viola Davis"), "Harper Collins");
        Book b3 = new Book("O Cérebro da Criança", Arrays.asList("Daniel J. Siegel", "Tina Payne Bryson"), "Casa das Letras");
        Book b4 = new Book("Diário de uma paixão", Arrays.asList("Nicholas Sparks"), "Arqueiro");

        repository.saveBook(b1);
        repository.saveAllBooks(Arrays.asList(b2, b3, b4));

    }
}
