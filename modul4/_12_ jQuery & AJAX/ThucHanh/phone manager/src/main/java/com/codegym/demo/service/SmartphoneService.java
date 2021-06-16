package com.codegym.demo.service;

import com.codegym.demo.model.Smartphone;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Pageable;
public class SmartphoneService {

    Iterable<Smartphone> findAll(Pageable pageable);
    Smartphone findById(Integer id);
    void save(Smartphone phone);
    void remove(Integer id);
}
