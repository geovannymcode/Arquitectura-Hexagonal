package com.geovannycode.arquitectura.hexagonal.adapters.in.apis.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<String> handleServiceException(ServiceException ex) {
        return new ResponseEntity<>("Error al realizar la búsqueda: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
