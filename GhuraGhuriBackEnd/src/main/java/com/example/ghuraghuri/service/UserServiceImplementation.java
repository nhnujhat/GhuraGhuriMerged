package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    UserRepository repo;
    @Override
    public User newUser(User user) {
        return repo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> findByEmail(String email) {
        List<User> users = repo.findByEmail(email);
        if(users.size()==0)
        {
            User user = new User();
            users.add(user);
        }
        return users;
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public List<User> getUserById(int id) {
        List<User> users = repo.findById(id);
        if(users.size()==0)
        {
            User user = new User();
            users.add(user);
        }
        return users;
    }


}
