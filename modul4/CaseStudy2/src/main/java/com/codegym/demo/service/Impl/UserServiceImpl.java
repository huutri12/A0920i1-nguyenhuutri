package com.codegym.demo.service.Impl;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.UserRepository;
import com.codegym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void remove(String username) {
        userRepository.deleteById(username);
    }
}
