package com.codegym.demo.repository;

import com.codegym.demo.model.Education_degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<Education_degree, Integer> {
}
