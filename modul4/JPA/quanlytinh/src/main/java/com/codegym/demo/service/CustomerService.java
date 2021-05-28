package com.codegym.demo.service;

import com.codegym.demo.model.Customer;
import com.codegym.demo.model.Province;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
