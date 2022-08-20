package ru.metadevs.andrew.OOP;

import java.util.Arrays;

public class Company implements IdealCompany {
    private String name;
    private Employee[] employees;

    public Company(String name, int amountOfWorkers) {
        this.name = name;
        this.employees = new Employee[amountOfWorkers];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public void hire(Employee employee, int salary) {
        if (isEmployeeBelongsToCompany(employee)) {
            throw new EmployeeAlreadyExistsInCompanyException("This employee already exist in company");
        }
        Employee[] hireArray = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }//Добавить проверку на SalaryValidate. Метод hire должен принимать salary на вход (интовый)
    // После добавления сотрудника в компанию нужно установить ему зарплату и название компании.

    @Override
    public void fire(Employee employee) {
        if (!existsByName(employee.getName())) {
            throw new EmployeeNotFoundException("There is no such employee in the company");
        }
        int deleteIndex = Arrays.asList(employees).indexOf(employee);
        Employee[] fireArray = new Employee[employees.length - 1];
        System.arraycopy(employees, 0, fireArray, 0, deleteIndex);
        System.arraycopy(employees, deleteIndex + 1, fireArray, deleteIndex, employees.length - 1 - deleteIndex);

        employees = fireArray;
    }

    @Override
    public void printEmployees() {
        for (Employee employee : employees) {
            employee.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public Employee employeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("This employee is not exist in company");
    }

    private boolean existsByName(String name) {
        try {
            employeeByName(name);
            return true;
        } catch (EmployeeNotFoundException e) {
            return false;
        }
    }

    private boolean isEmployeeBelongsToCompany(Employee employee) {
        return Arrays.asList(employees).contains(employee);
    }
}
