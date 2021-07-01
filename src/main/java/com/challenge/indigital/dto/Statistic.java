package com.challenge.indigital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Statistic {
    private Double average;
    private Double standardDeviation;
}