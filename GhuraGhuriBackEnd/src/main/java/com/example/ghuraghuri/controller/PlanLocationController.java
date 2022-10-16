package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.PlanLocation;
import com.example.ghuraghuri.service.PlanLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planLocation")
@CrossOrigin
public class PlanLocationController {
    @Autowired
    PlanLocationService planLocationService;

    @PostMapping("/add")
    public String addPlanLocation(@RequestBody PlanLocation planLocation){
        planLocationService.newPlanLocation(planLocation);
        return "New Plan Location added";
    }

    @GetMapping("/getAll")
    public List<PlanLocation> getAllPlanLocations(){
        return planLocationService.getAllPlanLocations();
    }

    @GetMapping("getByPlanId/planId")
    public ResponseEntity<List<PlanLocation>> getByPlanId(@RequestParam Long planId){
        return new ResponseEntity<List<PlanLocation>>(planLocationService.findLocationByPlanId(planId), HttpStatus.OK);
    }
}
