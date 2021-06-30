package com.challenge.indigital.dto;

import com.challenge.indigital.model.Customer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;

@Data
public class CustomerDTO {

    @ApiParam(
            name =  "name",
            type = "String",
            value = "Full Name of the user",
            example = "Jorge Esteban",
            required = true)
    private String name;

    private String lastName;

    private int age;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;

    public Customer toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(this, Customer.class);
        return customer;
    }
}
