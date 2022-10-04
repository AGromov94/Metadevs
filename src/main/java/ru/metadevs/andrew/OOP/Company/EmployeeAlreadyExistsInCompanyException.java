package ru.metadevs.andrew.OOP.Company;

public class EmployeeAlreadyExistsInCompanyException extends IllegalArgumentException {

    public EmployeeAlreadyExistsInCompanyException (String message) {
        super(message);
    }
}
