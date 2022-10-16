package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.User;

import java.util.List;

public interface UserService {
    public User newUser(User user);

    public User updateUser(User user);

    public List<User> findByEmail(String email);

    public List<User> getAllUsers();

    public List<User> getUserById(int id);
}
