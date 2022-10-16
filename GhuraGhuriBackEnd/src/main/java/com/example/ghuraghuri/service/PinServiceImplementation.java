package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Pin;
import com.example.ghuraghuri.repository.PinRepository;
import com.example.ghuraghuri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinServiceImplementation implements PinService {
    @Autowired
    PinRepository repo;

    @Override
    public Pin newPin(Pin pin) {
        return repo.save(pin);
    }

    @Override
    public List<Pin> getAllPins() {
        return repo.findAll();
    }
}
