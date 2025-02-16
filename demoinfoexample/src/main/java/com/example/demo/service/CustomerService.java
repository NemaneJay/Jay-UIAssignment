package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService{
	@Autowired 
    private CustomerRepository customerRepository;

    public Customer registerCustomer(String userName) {
        Customer customer = new Customer();
        customer.setUserName(userName);
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

	
	}


