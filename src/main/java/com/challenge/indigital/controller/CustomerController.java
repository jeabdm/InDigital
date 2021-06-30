package com.challenge.indigital.controller;

import com.challenge.indigital.dto.CustomerDTO;
import com.challenge.indigital.model.Customer;
import com.challenge.indigital.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomerController extends BaseController{

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/test")
    public ResponseEntity<Void> testFeature(){
        this.customerService.serviceTest();
        return ResponseEntity.ok()
                .build();
    }

    @PostMapping("/creacliente")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerDTO request){
        log.info("Request: /creacliente, body: {}", request.toString());
        return ResponseEntity.ok(this.customerService.createCustomer(request.toEntity()));
    }
}
