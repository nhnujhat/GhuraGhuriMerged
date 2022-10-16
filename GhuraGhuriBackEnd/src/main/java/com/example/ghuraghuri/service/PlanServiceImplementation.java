package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Plan;
import com.example.ghuraghuri.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlanServiceImplementation implements PlanService{

    @Autowired
    PlanRepository planRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public Plan newPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public List<Plan> findByEmail(String email) {
        List<Plan> plans = planRepository.findByEmail(email);

        return plans;
    }

    @Override
    public List<Plan> findById(Long id) {
        List<Plan> plans = planRepository.findById(id);

        return plans;
    }

    @Override
    public Plan updatePlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public void deletePlan(Plan plan) {
        planRepository.delete(plan);
        return;
    }
}
