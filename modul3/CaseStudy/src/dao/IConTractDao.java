package dao;

import model.attach_service;
import model.contract;
import model.contract_detail;

import java.util.List;

public interface IConTractDao {
    void insertContract(contract contract);
    contract getContract(int id);
    List<contract> getAllContract();
    boolean updateContract(contract contract);
    boolean deleteContract(int id);
    boolean deleteContractByCustomerID(String customer_id);
    contract getContractByCustomerId(String customer_id);

    //contract details

    void insertContractDetails(contract_detail contract_details);
    contract_detail getContracDetails(int contractID);
    boolean deleteContratDetailsByContractID(int contract_id);

    //attach_service
    attach_service getAttachService(int attach_service_id);
}
