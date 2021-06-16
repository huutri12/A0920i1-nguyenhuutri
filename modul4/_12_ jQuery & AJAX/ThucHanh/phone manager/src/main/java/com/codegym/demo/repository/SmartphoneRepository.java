package com.codegym.demo.repository;

import com.codegym.demo.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}
