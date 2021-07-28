package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employeeTyph")
public class EmployeeTyph {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "employeeTyph")
    private List<Employee> employee;

    public EmployeeTyph() {
    }

    public EmployeeTyph(int id, String name, List<Employee> employee) {
        this.id = id;
        this.name =name;
        this.employee= employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
