package com.codegym.demo.reponsitory;

import com.codegym.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address);

    Page<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address, Pageable pageInfo);

    Customer findOne(Long id);

    boolean exists(Long id);

    void delete(Long id);
}
