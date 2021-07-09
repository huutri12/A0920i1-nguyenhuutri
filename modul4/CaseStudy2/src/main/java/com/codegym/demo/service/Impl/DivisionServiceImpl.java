package com.codegym.demo.service.Impl;

import com.codegym.demo.model.Division;
import com.codegym.demo.repository.DivisionRepository;
import com.codegym.demo.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
