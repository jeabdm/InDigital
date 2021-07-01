package com.challenge.indigital.controller;

import com.challenge.indigital.exception.BadRequestException;
import com.challenge.indigital.model.ResponseAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandlerController extends BaseController {

    @ResponseBody
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseAdvice badRequestHandler(BadRequestException ex) {
        log.error(ex.getMessage());
        return new ResponseAdvice(ex.getCode(), ex.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseAdvice invalidArgumentHandler(MethodArgumentNotValidException ex) {
        log.error(ex.getMessage());
        return new ResponseAdvice("ERR_ARG", ex.getLocalizedMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseAdvice internalServerErrorHandler(Exception ex) {
        log.error(ex.getMessage());
        return new ResponseAdvice("ERR_500", ex.getLocalizedMessage());
    }
}
