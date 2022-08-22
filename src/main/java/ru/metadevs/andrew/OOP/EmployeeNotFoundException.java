package ru.metadevs.andrew.OOP;

import java.util.NoSuchElementException;

public class EmployeeNotFoundException extends NoSuchElementException {

    public EmployeeNotFoundException(String message) {
        super(message);
    }

}
