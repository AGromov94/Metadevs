package ru.metadevs.andrew.OOP;

public interface IdealCompany {
    void hire(AbstractEmployee worker, int salary);

    void fire(AbstractEmployee worker);

    void printEmployees();

    AbstractEmployee employeeByName(String name);
}
