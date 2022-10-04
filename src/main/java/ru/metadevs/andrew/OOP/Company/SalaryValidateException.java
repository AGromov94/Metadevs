package ru.metadevs.andrew.OOP.Company;

public class SalaryValidateException extends IllegalArgumentException {

    public SalaryValidateException(String message) {
        super(message);
    }
}
