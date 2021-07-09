package com.codegym.demo.service;

import com.codegym.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    void remove(String username);
}
