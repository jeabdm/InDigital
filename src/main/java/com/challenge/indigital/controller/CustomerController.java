package com.challenge.indigital.controller;

import com.challenge.indigital.dto.CustomerDTO;
import com.challenge.indigital.dto.Statistic;
import com.challenge.indigital.model.Customer;
import com.challenge.indigital.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController extends BaseController{

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    @ApiOperation(value = "Endpoint for test only")
    public ResponseEntity<String> testFeature(){
        return ResponseEntity.ok("it works");
    }

    @PostMapping("/creacliente")
    @ApiOperation(value = "Create a customer", notes = "Create an return de customer created")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerDTO request){
        log.info("POST: /creacliente, body: {}", request.toString());
        return ResponseEntity.ok(this.customerService.createCustomer(request.toEntity()));
    }

    @GetMapping("/kpideclientes")
    @ApiOperation(value = "Get the average and standard deviation", notes = "If exist 1 or less customer, the api will return 0 as average and standard deviation")
    public ResponseEntity<Statistic> getStatistic() {
        log.info("GET: /kpideclientes");
        return ResponseEntity.ok(customerService.calculateStatisticCustomer());
    }

    @GetMapping("/listclientes")
    @ApiOperation(value = "Get a all customers")
    public ResponseEntity<List<Customer>> getCustomers() {
        log.info("GET: /listclientes");
        return ResponseEntity.ok(customerService.getCustomers());
    }
}
