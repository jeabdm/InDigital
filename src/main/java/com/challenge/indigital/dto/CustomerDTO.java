package com.challenge.indigital.dto;

import com.challenge.indigital.model.Customer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class CustomerDTO {

    @NotNull(message = "Name is required")
    @NotBlank
    @ApiModelProperty(notes = "Name of customer",name="name",required=true)
    private String name;

    @NotNull(message = "Last name is required")
    @NotBlank
    @ApiModelProperty(notes = "Last name of customer",name="lastName",required=true)
    private String lastName;

    @NotNull(message = "Age is required")
    @ApiModelProperty(notes = "Ageof customer",name="age",required=true)
    @Min(value = 1, message = "Age should not be less than 1")
    private int age;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @NotNull(message = "Date of birth is required")
    @ApiModelProperty(notes = "Date of birth of customer",name="dateOfBirth",required=true, value = "standard Iso: yyyy-mm-dd")
    private LocalDate dateOfBirth;

    public Customer toEntity(){
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(this, Customer.class);
        return customer;
    }
}
