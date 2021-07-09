package com.codegym.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Size(min = 1, max = 50)
    private String employeeName;

    @NotNull
    private Date employeeDate;

    @Size(min = 6, max = 12)
    private String employeeIdCard;

    @NotNull
    private double employeeSalary;

    @Size(min = 8, max = 10)
    private String employeePhone;

    @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String employeeEmail;
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "positionId", updatable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "educationDegreeId", updatable = false)
    private Education_degree education_degree;

    @ManyToOne
    @JoinColumn(name = "divisionId",updatable = false)
    private Division division;

    @ManyToOne
    @JoinColumn(name = "username", updatable = false)
    private User username;

    @OneToMany(targetEntity = Contract.class)
     private List<Contract> contracts;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(Date employeeDate) {
        this.employeeDate = employeeDate;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }


    public Education_degree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(Education_degree education_degree) {
        this.education_degree = education_degree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Employee() {
    }

    public Employee(int employeeId, @NotEmpty @Size(min = 1, max = 45) String employeeName,@NotEmpty Date employeeDate,@NotEmpty @Size(min = 6, max = 12) String employeeIdCard,@NotEmpty double employeeSalary,@NotEmpty @Size(min = 8, max = 10) String employeePhone,@Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") String employeeEmail, String employeeAddress, Position position, Education_degree educationDegree, Division division, User username) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDate = employeeDate;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.education_degree = educationDegree;
        this.division = division;
        this.username = username;
    }
    public Employee(int employeeId, @NotEmpty @Size(min = 1, max = 45) String employeeName,@NotEmpty Date employeeDate,@NotEmpty @Size(min = 6, max = 12) String employeeIdCard,@NotEmpty double employeeSalary,@NotEmpty @Size(min = 8, max = 10) String employeePhone,@Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") String employeeEmail, String employeeAddress, Position position, Education_degree educationDegree, Division division, User username, List<Contract> contracts) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDate = employeeDate;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.education_degree = educationDegree;
        this.division = division;
        this.username = username;
        this.contracts = contracts;
    }
}
