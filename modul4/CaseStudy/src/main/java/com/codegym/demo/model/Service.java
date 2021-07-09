package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;

    @ManyToOne
    @JoinColumn(name = "serviceTypeId")
    private Service_type service_type;

    @ManyToOne
    @JoinColumn(name = "RentTypeId")
    private Rent_type RentType;

    private String StandardRoom;
    private String DescriptionOtherConvenciec;
    private double PoolArea;
    private int numberOfFloors;

    @OneToMany(targetEntity = Contract.class)
    private List<Contract> contracts;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public Service_type getService_type() {
        return service_type;
    }

    public void setService_type(Service_type service_type) {
        this.service_type = service_type;
    }

    public Rent_type getRentType() {
        return RentType;
    }

    public void setRentType(Rent_type rentType) {
        RentType = rentType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getStandardRoom() {
        return StandardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        StandardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenciec() {
        return DescriptionOtherConvenciec;
    }

    public void setDescriptionOtherConvenciec(String descriptionOtherConvenciec) {
        DescriptionOtherConvenciec = descriptionOtherConvenciec;
    }

    public double getPoolArea() {
        return PoolArea;
    }

    public void setPoolArea(double poolArea) {
        PoolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Service() {
    }

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople,Service_type service_type ,int rentTypeId, String standardRoom, String descriptionOtherConvenciec, double poolArea, int numberOfFloors, List<Contract> contracts) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.service_type = service_type;
        this.contracts = contracts;
        this.StandardRoom = standardRoom;
        this.DescriptionOtherConvenciec = descriptionOtherConvenciec;
        this.PoolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }
}
