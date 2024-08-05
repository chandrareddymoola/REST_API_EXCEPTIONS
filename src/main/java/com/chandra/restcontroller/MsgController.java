package com.chandra.restcontroller;

import com.chandra.Exception.ExceptionInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MsgController {
    @GetMapping("Welcome")
    public String greetMsg(){
        int i=10/0;
        return "Welcome Rest API Exceptions";
    }
@ExceptionHandler(value = Exception.class)
    public ResponseEntity<ExceptionInfo> handlerEx(Exception e){
    ExceptionInfo exceptionInfo=new ExceptionInfo("Ex001",e.getMessage(), LocalDate.now());
        return new ResponseEntity<>(exceptionInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
