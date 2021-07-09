package com.codegym.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Attach_service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AttachServiceId;
    private String AttachServiceName;
    private double AttachServiceCost;
    private int AttachServiceUnit;
    private String AttachServiceStatus;

    @OneToMany(targetEntity = Contract_detail.class)
    private List<Contract_detail> contract_details;

    public Attach_service(int attachServiceId, String attachServiceName, double attachServiceCost, int attachServiceUnit, String attachServiceStatus) {
        AttachServiceId = attachServiceId;
        AttachServiceName = attachServiceName;
        AttachServiceCost = attachServiceCost;
        AttachServiceUnit = attachServiceUnit;
        AttachServiceStatus = attachServiceStatus;
    }

    public List<Contract_detail> getContract_details() {
        return contract_details;
    }

    public void setContract_details(List<Contract_detail> contract_details) {
        this.contract_details = contract_details;
    }

    public Attach_service() {
    }

    public int getAttachServiceId() {
        return AttachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        AttachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return AttachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        AttachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return AttachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        AttachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return AttachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        AttachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return AttachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        AttachServiceStatus = attachServiceStatus;
    }
}
