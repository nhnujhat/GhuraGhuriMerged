package com.example.ghuraghuri.repository;
import com.example.ghuraghuri.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note,Integer> {
    List<Note> findByPlanId(Long planId);
}
