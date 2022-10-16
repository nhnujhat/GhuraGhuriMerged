package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Note;
import com.example.ghuraghuri.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImplementation implements NoteService{

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public Note newNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> findNoteByPlanId(Long planId) {
        List<Note> notes = noteRepository.findByPlanId(planId);

        return notes;
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Note note) {
        noteRepository.delete(note);
        return;
    }
}
