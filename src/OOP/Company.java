package OOP;

import java.util.Arrays;

public class Company implements IdealCompany {
    private String name;
    private Employee[] employees;

    public Company(String name, int amountOfWorkers) {
        this.name = name;
        this.employees = new Employee[amountOfWorkers];
    }

    @Override
    public void hire(Employee worker) {
        Employee[] hireArray = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = worker;
                return;
            }
            hireArray[i] = employees[i];
        }
        hireArray[employees.length] = worker;
        employees = hireArray;
    }

    @Override
    public void fire(Employee worker) {
        int deleteIndex = Arrays.asList(employees).indexOf(worker);
        Employee[] fireArray = new Employee[employees.length - 1];
        System.arraycopy(employees, 0, fireArray, 0, deleteIndex);
        System.arraycopy(employees, deleteIndex + 1, fireArray, deleteIndex, employees.length - 1 - deleteIndex);

        employees = fireArray;
    }

    @Override
    public void printEmployees() {
        for (Employee worker : employees) {
            worker.printPersonalInfo();
            System.out.println();
        }
    }
}
