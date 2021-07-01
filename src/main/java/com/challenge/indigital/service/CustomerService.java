package com.challenge.indigital.service;

import com.challenge.indigital.dto.CustomerDTO;
import com.challenge.indigital.dto.Statistic;
import com.challenge.indigital.exception.BadRequestException;
import com.challenge.indigital.model.Customer;
import com.challenge.indigital.repository.CustomerRepository;
import com.challenge.indigital.utils.MathCustomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService extends BaseService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void serviceTest(){
        Customer customer = new Customer();
        customer.setName("Juana");
        this.customerRepository.save(customer);
        log.info("hola mundo");
        throw new BadRequestException("SERV","hola");
    }

    public Customer createCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }

    public Statistic calculateStatisticCustomer(){
        List<Integer> customers = this.customerRepository.findAll().stream().map(Customer::getAge).collect(Collectors.toList());
        return MathCustomUtil.getStandardDeviation(customers, 5);
    }

    public List<Customer> getCustomers(){
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }
}
