package com.codegym.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date contractStartDate;
    private  Date contractEndDate;
    private double contractDeposit;
    private  double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service;

    @OneToMany(targetEntity = Contract_detail.class)
    private List<Contract_detail> contract_details;

    public Contract() {
    }
    public Contract(int id, Date contractStartDate, Date contractEndDate, double contractDeposit, double contractTotalMoney, Employee employee, Customer customer, Service service, List<Contract_detail> contract_details) {
        this.id = id;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.contract_details = contract_details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Contract_detail> getContract_details() {
        return contract_details;
    }

    public void setContract_details(List<Contract_detail> contract_details) {
        this.contract_details = contract_details;
    }
}
