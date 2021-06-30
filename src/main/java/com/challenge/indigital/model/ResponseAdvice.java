package com.challenge.indigital.model;

import lombok.Data;

@Data
public class ResponseAdvice {

    public ResponseAdvice(String code, String message){
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;
}
