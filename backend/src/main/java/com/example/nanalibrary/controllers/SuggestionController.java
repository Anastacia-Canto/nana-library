package com.example.nanalibrary.controllers;

import com.example.nanalibrary.entities.Suggestion;
import com.example.nanalibrary.exceptions.EmptyLibraryException;
import com.example.nanalibrary.services.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SuggestionController {

    @Autowired
    SuggestionService service;

    @GetMapping({"/api/suggestions", "/api/suggestions/"})
    public ResponseEntity<List<Suggestion>> getAllSuggestions(){
        List<Suggestion> list = service.findAll();
        if (list.isEmpty()) throw new EmptyLibraryException();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping({"/api/suggestions", "/api/suggestions/"})
    public ResponseEntity<Suggestion> addSuggestion(@RequestBody Suggestion suggestion) {
        Suggestion newSuggestion = service.save(suggestion);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/api/suggestions").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(newSuggestion);
    }

    public ResponseEntity<Void> deleteSuggestion(@RequestBody Suggestion suggestion){
        service.deleteById(suggestion.getId());
        return ResponseEntity.noContent().build();
    }
}
