package com.example.calculator.service.exception;

public class NotParameterNumberException extends IllegalArgumentException{

    public NotParameterNumberException() {
    }

    public NotParameterNumberException(String message) {
        super(message);
    }
}
