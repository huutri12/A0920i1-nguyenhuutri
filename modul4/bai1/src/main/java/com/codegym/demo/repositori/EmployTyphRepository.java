package com.codegym.demo.repositori;

import com.codegym.demo.model.Employee;
import com.codegym.demo.model.EmployeeTyph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployTyphRepository extends JpaRepository<EmployeeTyph, Integer> {
}
