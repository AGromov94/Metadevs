package OOP;

public class Manager implements Employee {
    private String name;
    private int age;
    private double salary;
    private String placeOfWork;

    public Manager(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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
    public void printPersonalInfo() {
        System.out.print("I'm a manager" + " ");
        System.out.print(this.name);
        System.out.print(" " + this.age + " ");
        System.out.printf("%.2f", this.salary);
    }
}
