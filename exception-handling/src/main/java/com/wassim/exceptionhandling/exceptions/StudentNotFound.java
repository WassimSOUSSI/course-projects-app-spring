package com.wassim.exceptionhandling.exceptions;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(String message) {
        super(message);
    }
}
