package ru.metadevs.andrew.OOP;

public interface IdealCompany {
    void hire(Employee worker, int salary);

    void fire(Employee worker);

    void printEmployees();

    Employee employeeByName(String name);
}
