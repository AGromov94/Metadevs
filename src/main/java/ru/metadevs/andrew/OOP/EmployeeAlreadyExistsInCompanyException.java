package ru.metadevs.andrew.OOP;

public class EmployeeAlreadyExistsInCompanyException extends IllegalArgumentException {

    public EmployeeAlreadyExistsInCompanyException (String message) {
        super(message);
    }
}
