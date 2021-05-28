package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Page<Student> findAllStudent(Pageable pageable);
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    Page<Student> findStudentByName(String name, Pageable pageable);
}
