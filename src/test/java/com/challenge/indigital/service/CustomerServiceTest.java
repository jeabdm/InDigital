package com.challenge.indigital.service;

import com.challenge.indigital.exception.BadRequestException;
import com.challenge.indigital.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    private CustomerService customerService;

    @BeforeEach
    public void init() {
        customerService = new CustomerService(customerRepository);
    }

    @Test
    public void initBaseTest() {
        assertThrows(BadRequestException.class, () -> customerService.serviceTest());
    }
}