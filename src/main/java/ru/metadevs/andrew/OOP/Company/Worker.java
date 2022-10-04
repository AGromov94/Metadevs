package ru.metadevs.andrew.OOP.Company;

public class Worker extends AbstractEmployee {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void printPersonalInfo() {
        System.out.print("I'm a worker" + " ");
        super.printPersonalInfo();
    }
}
