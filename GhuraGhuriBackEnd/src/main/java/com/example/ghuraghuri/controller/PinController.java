package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Pin;
import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.service.PinService;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pins")
@CrossOrigin
public class PinController {
    @Autowired
    PinService pinService;

    @PostMapping("/addPin")
    public String addPin(@RequestBody Pin pin){
        pinService.newPin(pin);
        return "New pin is added";
    }

    @GetMapping("/getAllPins")
    public List<Pin> getAllPins(){
        return pinService.getAllPins();
    }

}
