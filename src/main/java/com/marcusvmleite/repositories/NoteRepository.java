package com.marcusvmleite.repositories;

import com.marcusvmleite.model.Note;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface NoteRepository extends CrudRepository<Note, String> {

    Optional<Note> findById(String id);

}
