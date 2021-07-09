package com.codegym.demo.model;

import javax.persistence.*;

@Entity
public class Contract_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;

    @ManyToOne
    @JoinColumn(name = "contractId")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "AttachServiceId")
    private Attach_service attach_service;
    private int quantity;

    public Contract_detail() {
    }
    public Contract_detail(int contractDetailId, Contract contract , Attach_service attach_service, int quantity) {
        this.attach_service = attach_service;
        this.contract = contract;
        this.contractDetailId = contractDetailId;
        this.quantity = quantity;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Attach_service getAttach_service() {
        return attach_service;
    }

    public void setAttach_service(Attach_service attach_service) {
        this.attach_service = attach_service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
