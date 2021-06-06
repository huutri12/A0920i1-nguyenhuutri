package com.codegym.demo.repository;

import com.codegym.demo.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
    Province findOne(Long id);
}
