package com.challenge.indigital.controller;

import com.challenge.indigital.exception.BadRequestException;
import com.challenge.indigital.model.ResponseAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandlerController extends BaseController{

    @ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseAdvice employeeNotFoundHandler(BadRequestException ex) {
        log.error(ex.getMessage());
        return new ResponseAdvice(ex.getCode(), ex.getMessage());
    }
}
