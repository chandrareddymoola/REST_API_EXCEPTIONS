package com.chandra.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class AppExceptionalHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExceptionInfo> handlerEx(Exception e){
        ExceptionInfo exceptionInfo=new ExceptionInfo("Ex001",e.getMessage(), LocalDate.now());
        return new ResponseEntity<>(exceptionInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<ExceptionInfo> handleProductNFEx(ProductNotFoundException e) {

        ExceptionInfo info = new ExceptionInfo("EX002", e.getMessage(), LocalDate.now());

        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
    }
}
