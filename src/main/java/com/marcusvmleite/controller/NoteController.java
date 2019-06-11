package com.marcusvmleite.controller;

import com.marcusvmleite.model.Note;
import com.marcusvmleite.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/note")
public class NoteController {

    @Autowired
    private NoteRepository stationRepository;

    @GetMapping("/notes")
    public Note greeting() {
        Optional<Note> note = stationRepository.findById("1");
        return note.orElse(null);
    }

}
