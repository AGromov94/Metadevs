package ru.metadevs.andrew.OOP;

public class Manager implements Employee {
    private String name;
    private int age;
    private int salary;
    private String placeOfWork;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //region getters/setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    // endregion

    @Override
    public void salaryValidate(int salary) {
        if (salary < age) throw new SalaryValidateException("Salary could not be lower than age");
    }

    @Override
    public void printPersonalInfo() {
        System.out.print("I'm a manager" + " ");
        System.out.print(this.name);
        System.out.print(" " + this.age + " ");
        System.out.print(this.salary);
    }
}
