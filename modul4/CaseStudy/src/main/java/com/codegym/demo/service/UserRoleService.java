package com.codegym.demo.service;

import com.codegym.demo.model.User_role;

import java.util.List;

public interface UserRoleService {
    List<User_role> findAll();
    void save(User_role userRole);
    void remove(String username);
}
