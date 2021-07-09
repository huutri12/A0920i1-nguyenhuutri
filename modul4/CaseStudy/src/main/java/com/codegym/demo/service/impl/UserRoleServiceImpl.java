package com.codegym.demo.service.impl;

import com.codegym.demo.model.User_role;
import com.codegym.demo.repository.UserRoleRepository;
import com.codegym.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private  UserRoleRepository userRoleRepository;
    @Override
    public List<User_role> findAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public void save(User_role userRole) {
        userRoleRepository.save(userRole);
    }

    @Override
    public void remove(String username) {
        userRoleRepository.deleteById(username);
    }
}
