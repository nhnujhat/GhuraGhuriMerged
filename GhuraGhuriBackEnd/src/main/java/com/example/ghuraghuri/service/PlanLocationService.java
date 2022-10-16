package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.PlanLocation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlanLocationService {
    public PlanLocation newPlanLocation(PlanLocation planLocation);
    public List<PlanLocation> getAllPlanLocations();
    public List<PlanLocation> findLocationByPlanId(Long planId);
}
