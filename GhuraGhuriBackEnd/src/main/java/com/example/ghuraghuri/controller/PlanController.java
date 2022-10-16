package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Plan;
import com.example.ghuraghuri.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;

import java.util.List;

@RestController
@RequestMapping("/plan")
@CrossOrigin
public class PlanController {

    @Autowired
    PlanService planService;

    @PostMapping("/add")
    public String addPlan(@RequestBody Plan plan){
        planService.newPlan(plan);
        return "New Plan added";
    }

    @GetMapping("/getAll")
    public List<Plan> getAllPlans(){
        return planService.getAllPlans();
    }

    @GetMapping("getByMail/mail")
    public ResponseEntity<List<Plan>> getPlanByMail(@RequestParam String mail){
        return new ResponseEntity<List<Plan>>(planService.findByEmail(mail), HttpStatus.OK);
    }

    @GetMapping("getById/id")
    public ResponseEntity<List<Plan>> getPlanById(@RequestParam Long id){
        return new ResponseEntity<List<Plan>>(planService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Plan> updatePlan(@RequestBody Plan plan){
        List<Plan> plans = planService.findById(plan.getId());
        plans.get(0).setName(plan.getName());
        plans.get(0).setDescription(plan.getDescription());
        final Plan updatedPlan = planService.updatePlan(plans.get(0));
        return ResponseEntity.ok(updatedPlan);
    }

    @PostMapping("/delete")
    public String deletePlan(@RequestBody Plan plan){
        planService.deletePlan(plan);
        return "Plan deleted";
    }
}
