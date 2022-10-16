package com.example.ghuraghuri.repository;
import com.example.ghuraghuri.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Integer> {
    List<Plan> findByEmail(String email);
    List<Plan> findById(Long id);
}
