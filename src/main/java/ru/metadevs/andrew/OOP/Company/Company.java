package ru.metadevs.andrew.OOP.Company;

import java.util.Arrays;

public class Company implements IdealCompany {
    private String companyName;
    private AbstractEmployee[] employees;

    public Company(String name, int amountOfWorkers) {
        this.companyName = name;
        this.employees = new AbstractEmployee[amountOfWorkers];
    }

    public AbstractEmployee[] getEmployees() {
        return employees;
    }

    @Override
    public void hire(AbstractEmployee employee, int salary) {
        if (isEmployeeBelongsToCompany(employee)) {
            throw new EmployeeAlreadyExistsInCompanyException("This employee already exist in company");
        }

        employee.salaryValidate(salary);
        employee.setSalary(salary);
        employee.setCompanyName(this.companyName);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }

    @Override
    public void fire(AbstractEmployee employee) {
        if (!existsByName(employee.getName())) {
            throw new EmployeeNotFoundException("There is no such employee in the company");
        }
        int deleteIndex = Arrays.asList(employees).indexOf(employee);
        AbstractEmployee[] fireArray = new AbstractEmployee[employees.length - 1];
        System.arraycopy(employees, 0, fireArray, 0, deleteIndex);
        System.arraycopy(employees, deleteIndex + 1, fireArray, deleteIndex, employees.length - 1 - deleteIndex);

        employees = fireArray;
    }

    @Override
    public void printEmployees() {
        for (AbstractEmployee employee : employees) {
            employee.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public AbstractEmployee employeeByName(String name) {
        for (AbstractEmployee employee : employees) {
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

    private boolean isEmployeeBelongsToCompany(AbstractEmployee employee) {
        return Arrays.asList(employees).contains(employee);
    }
}
