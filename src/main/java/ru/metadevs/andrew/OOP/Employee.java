package ru.metadevs.andrew.OOP;

public interface Employee {

    void salaryValidate(int salary);

    void printPersonalInfo();

    String getName();

    default void haveVacation() {
        System.out.println("I have four weeks of vacation per year");
    }

    void setSalary(int salary);
}
