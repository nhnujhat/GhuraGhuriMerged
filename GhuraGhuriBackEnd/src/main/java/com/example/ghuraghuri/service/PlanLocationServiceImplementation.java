package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.PlanLocation;
import com.example.ghuraghuri.repository.PlanLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanLocationServiceImplementation implements PlanLocationService{
    @Autowired
    PlanLocationRepository repo;

    @Override
    public PlanLocation newPlanLocation(PlanLocation planLocation) {
        return repo.save(planLocation);
    }

    @Override
    public List<PlanLocation> getAllPlanLocations() {
        return repo.findAll();
    }

    @Override
    public List<PlanLocation> findLocationByPlanId(Long planId) {
        List<PlanLocation> locations = repo.findByPlanId(planId);

        return locations;
    }
}
