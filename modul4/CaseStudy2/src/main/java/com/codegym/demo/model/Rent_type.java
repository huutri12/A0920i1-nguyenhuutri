package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rent_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId;
    private String rentTypeName;
    private double rentTypeCost;

    @OneToMany(targetEntity = Service.class)
    private List<Service> services;
    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public Rent_type() {
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public Rent_type(int rentTypeId, String rentTypeName, double rentTypeCost, List<Service>services) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
        this.services = services;
    }
}
