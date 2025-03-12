package com.example.nanalibrary.repositories;

import com.example.nanalibrary.entities.Suggestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionRepository extends CrudRepository<Suggestion, Long> {
}
