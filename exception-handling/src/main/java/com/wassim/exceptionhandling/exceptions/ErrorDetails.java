package com.wassim.exceptionhandling.exceptions;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorDetails {

    private int status;
    private String message;
    private LocalDateTime timeStamp;
}
