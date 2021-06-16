package com.codegym.demo.service;

import com.codegym.demo.model.Smartphone;
import com.codegym.demo.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

public class SmartphoneServiceImpl extends SmartphoneService {
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll(Pageable pageable) {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        Smartphone smartphone = smartphoneRepository.findById(id).orElse(null);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public void save(Smartphone phone) {
        smartphoneRepository.save(phone);
    }

    @Override
    public void remove(Integer id) {
        Smartphone smartphone = findById(id);
        smartphoneRepository.deleteById(id);

    }
}
