package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Pin;
import com.example.ghuraghuri.model.User;

import java.util.List;

public interface PinService {
    public Pin newPin(Pin pin);
    public List<Pin> getAllPins();

}
