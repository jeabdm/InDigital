package com.challenge.indigital.service;

import com.challenge.indigital.exception.BadRequestException;
import com.challenge.indigital.model.Customer;
import com.challenge.indigital.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
