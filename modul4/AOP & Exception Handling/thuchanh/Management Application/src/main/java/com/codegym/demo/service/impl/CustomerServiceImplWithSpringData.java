package com.codegym.demo.service.impl;

import com.codegym.demo.model.Customer;
import com.codegym.demo.reponsitory.CustomerRepository;
import com.codegym.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CustomerServiceImplWithSpringData implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return streamAll().collect(Collectors.toList());
    }

    @Override
    public Page<Customer> findAll(Pageable pageInfo) {
        return customerRepository.findAll((org.springframework.data.domain.Pageable) pageInfo);
    }

    @Override
    public List<Customer> search(String keyword) {
        Iterable<Customer> searchResult = customerRepository
                .findAllByNameContainsOrEmailContainsOrAddressContains(keyword, keyword, keyword);
        return streamAll(searchResult).collect(Collectors.toList());
    }

    @Override
    public Page<Customer> search(String keyword, Pageable pageInfo) {
        return customerRepository
                .findAllByNameContainsOrEmailContainsOrAddressContains(keyword, keyword, keyword, pageInfo);
    }

    @Override
    public Customer findOne(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }


    @Override
    public boolean exists(Long id) {
        return customerRepository.exists(id);
    }

    @Override
    public List<Customer> findAll(List<Long> ids) {
        return null;
    }


    @Override
    public long count() {
        return customerRepository.count();
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(id);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void delete(List<Customer> customers) {
        customerRepository.delete((Customer) customers);
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }

    private Stream<Customer> streamAll() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false);
    }

    private Stream<Customer> streamAll(Iterable<Customer> customers) {
        return StreamSupport.stream(customers.spliterator(), false);
    }
}
