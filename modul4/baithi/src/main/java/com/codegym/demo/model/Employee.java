package com.codegym.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
public class Employee implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name must not be Blank")
    private String name;

    //@NotBlank(message = "Name must not be Blank")
    private int price;

    @NotBlank(message = "Name must not be Blank")
    private String productType;

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private EmployeeType employeeType;

    public Employee() {
    }
    public Employee(int id, @NotBlank(message = "Name must not be Blank")String name, int price,@NotBlank(message = "Name must not be Blank") String productType, EmployeeType employeeType ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.employeeType = employeeType;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Employee.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
    }
}
