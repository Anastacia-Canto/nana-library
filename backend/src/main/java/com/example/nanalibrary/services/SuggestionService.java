package com.example.nanalibrary.services;

import com.example.nanalibrary.entities.Suggestion;
import com.example.nanalibrary.repositories.SuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SuggestionService {

    @Autowired
    SuggestionRepository repository;

    public Suggestion save(Suggestion suggestion) { return repository.save(suggestion); }

    public List<Suggestion> saveAll(List<Suggestion> list) { return (List<Suggestion>) repository.saveAll(list); }

    public List<Suggestion> findAll() { return (List<Suggestion>) repository.findAll(); }

    public Optional<Suggestion> findById(Long id) { return repository.findById(id); }

    public List<Suggestion> findByName(String name) {
        if (name.isEmpty()) return null;
        return findAll().stream().filter(suggestion -> suggestion.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public Optional<Suggestion> findByTitle(String title) {
        return findAll().stream().filter(suggestion -> suggestion.getTitle().equalsIgnoreCase(title)).findFirst();
    }

    public Optional<Suggestion> findByAuthor(String author) {
        return findAll().stream().filter(suggestion -> suggestion.getAuthors().contains(author)).findFirst();
    }

    public void deleteById(Long id) { repository.deleteById(id); }

    public void deleteAll() { repository.deleteAll(); }

    public void deleteAllByName(String name) {
        repository.deleteAll(findByName(name));
    }
}
