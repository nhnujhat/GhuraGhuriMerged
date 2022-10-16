package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinRepository extends JpaRepository<Pin, Integer> {
}
