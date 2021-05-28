package com.codegym.reponsitory;

import com.codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerReponsitoryImpl implements CustomerReponsitory {

    private static Map<Integer, Customer> listCustomer;

    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1, new Customer(1, "Huu Tuan","tuan@gmail.com","NgheAn"));
        listCustomer.put(1, new Customer(2, "Thanh","thanh@gmail.com","DaNang"));
        listCustomer.put(1, new Customer(3, "Quang","quang@gmail.com","HaNoi"));
        listCustomer.put(1, new Customer(4, "Kien","kien@gmail.com","NhaTrang"));
        listCustomer.put(1, new Customer(5, "Tri","tri@gmail.com","QuangBinh"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public Customer findById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void deleteById(int id) {
        listCustomer.remove(id);
    }

    @Override
    public void save(Customer customer) {
        listCustomer.put(customer.getId(),customer);
    }
}
