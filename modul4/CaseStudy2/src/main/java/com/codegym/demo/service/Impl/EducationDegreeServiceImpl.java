package com.codegym.demo.service.Impl;

import com.codegym.demo.model.Education_degree;
import com.codegym.demo.repository.EducationDegreeRepository;
import com.codegym.demo.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<Education_degree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
