package com.codegym.demo.reponsitory;

import com.codegym.demo.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
    void delete(Long id);
}
