package OOP;

public interface Employee {

    void talkAbout();

    String getName();

    int getAge();

    double getSalary();

    default void haveVacation() {
        System.out.println("I have four weeks of vacation per year");
    }
}
