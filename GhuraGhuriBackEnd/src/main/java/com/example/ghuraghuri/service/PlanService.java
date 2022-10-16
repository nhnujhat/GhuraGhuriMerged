package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Plan;

import java.util.List;

public interface PlanService {
    public Plan newPlan(Plan plan);
    public List<Plan> getAllPlans();
    public List<Plan> findByEmail(String email);
    public List<Plan> findById(Long id);
    public Plan updatePlan(Plan plan);
    public void deletePlan(Plan plan);
}
