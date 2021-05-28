package dao;

import model.customer;
import model.customer_type;

import java.util.List;

public interface ICustomerDao {
    void insertCustomer(customer customer);
    customer getCustomer(String id);
    List<customer> getAllCustomer();
    boolean updateCustomer(customer customer);
    boolean deleteCustomer(String id);
    //    List<Customer_Type> getAllCustomerType();
    customer_type getCustomerType(int id);
}
