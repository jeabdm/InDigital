package com.challenge.indigital.exception;

import lombok.Data;

@Data
public class BadRequestException extends RuntimeException {

    private String message;
    private String code;

    public BadRequestException(String code, String message){
        this.code = code;
        this.message = message;
    }
}
