package com.eoi.spring.SpringBoot2RestServiceApplication.modelo;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
