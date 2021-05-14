package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.reponsitory.CustomerReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerReponsitory customerReponsitory;

    @Override
    public List<Customer> findAll() {
        return customerReponsitory.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerReponsitory.findById(id);
    }

    @Override
    public void deleteById(int id) {
        customerReponsitory.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        customerReponsitory.save(customer);
    }
}
