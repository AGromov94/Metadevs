package ru.metadevs.andrew.OOP;

public abstract class AbstractEmployee implements Employee {
    private String name;
    private int age;
    private int salary;
    private String placeOfWork;

    protected AbstractEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.placeOfWork = companyName;
    }

    @Override
    public void salaryValidate(int salary) {
        if (salary < age) throw new SalaryValidateException("Salary could not be lower than age");
    }

    @Override
    public void printPersonalInfo() {
        System.out.print(this.name);
        System.out.print(" " + this.age + " ");
        System.out.print(this.salary + " ");
        System.out.print(this.placeOfWork);
    }
}
