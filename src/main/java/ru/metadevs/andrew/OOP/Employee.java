package ru.metadevs.andrew.OOP;

public interface Employee {

    void salaryValidate(int salary);

    void printPersonalInfo();

    default void haveVacation() {
        System.out.println("I have four weeks of vacation per year");
    }
}
