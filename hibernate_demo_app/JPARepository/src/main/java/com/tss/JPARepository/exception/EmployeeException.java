package com.tss.JPARepository.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeException extends RuntimeException {

    private String message;

    public EmployeeException(String message) {
        super(message);
        this.message = message;
    }
}
