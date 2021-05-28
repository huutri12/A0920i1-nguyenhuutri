package dao.imp;

import dao.IConTractDao;
import model.attach_service;
import model.contract;
import model.contract_detail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ContractDaoLimpl implements IConTractDao {

    private static final String INSERT_CONTRACT_SQL = "Insert into CONTRACT(contract_start_day, contract_end_day," +
            " contract_deposit, contract_total_money,employee_id, customer_id, service_id) " +
            "values (?, ?, ?, ?,?, ?, ?)";   //7 value
    private static final String SELECT_CONTRACT_BY_ID = "Select * from CONTRACT where contract_id = ?";
    private static final String SELECT_ALL_CONTRACT = "Select * from CONTRACT";
    private static final String DELETE_CONTRACT_BY_ID = "Delete from CONTRACT where contract_id = ?";
    private static final String UPDATE_CONTRACT = "Update CONTRACT set contract_start_day=? , contract_end_day = ?, contract_deposit = ?, " +
            "contract_total_money = ?, employee_id = ?, customer_id = ?,service_id = ? where contract_id = ?"; //8 value
    private static final String DELETE_CONTRACT_BY_CUSTOMER_ID ="Delete from CONTRACT where customer_id =?";
    private static final String SELECT_CONTRACT_BY_CUSTOMER_ID = "Select * from CONTRACT where customer_id=?";
    //contract details
    private static final String INSERT_CONTRACT_DETAILS_SQL = "Insert into CONTRACT_DETAILS (contract_id," +
            "attach_service_id, quality) values (?,?,?)";
    private static final String SELECT_CONTRACT_DETAILS_SQL = "Select * from CONTRACT_DETAILS where contract_id=?";
    private static final String DELETE_CONTRACT_DETAILS_BY_CONTRACT_ID_SQL = "Delete from CONTRACT_DETAILS where contract_id=?";
    //attach service
    private static final String SELECT_ATTACH_SERVICE ="Select * from ATTACH_SERVICE where attach_service_id=?";
    @Override
    public void insertContract(contract contract) {
        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = connectionDB
        }
    }

    @Override
    public contract getContract(int id) {
        return null;
    }

    @Override
    public List<contract> getAllContract() {
        return null;
    }

    @Override
    public boolean updateContract(contract contract) {
        return false;
    }

    @Override
    public boolean deleteContract(int id) {
        return false;
    }

    @Override
    public boolean deleteContractByCustomerID(String customer_id) {
        return false;
    }

    @Override
    public contract getContractByCustomerId(String customer_id) {
        return null;
    }

    @Override
    public void insertContractDetails(contract_detail contract_details) {

    }

    @Override
    public contract_detail getContracDetails(int contractID) {
        return null;
    }

    @Override
    public boolean deleteContratDetailsByContractID(int contract_id) {
        return false;
    }

    @Override
    public attach_service getAttachService(int attach_service_id) {
        return null;
    }
}
