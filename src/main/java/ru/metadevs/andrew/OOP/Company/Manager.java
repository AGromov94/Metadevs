package ru.metadevs.andrew.OOP.Company;

public class Manager extends AbstractEmployee {


    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void printPersonalInfo() {
        System.out.print("I'm a manager" + " ");
        super.printPersonalInfo();
    }
}
