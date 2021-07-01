package com.challenge.indigital.model;

import com.challenge.indigital.utils.Constant;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastName;

    private int age;

    private LocalDate dateOfBirth;

    public LocalDate getDateOfDeath(){
        return dateOfBirth.plusYears(Constant.AVERAGE_LIFE);
    }
}
