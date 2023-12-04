package com.wassim.exceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ErrorDetails> handleStudentNotFoundException(StudentNotFound studentNotFound){
        ErrorDetails errorDetails=new ErrorDetails();
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetails.setMessage(studentNotFound.getMessage());
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
    }
}
