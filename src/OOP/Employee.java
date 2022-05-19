package OOP;

public interface Employee {

    default void haveVacation() {
        System.out.println("I have four weeks of vacation per year");
    }

    void printPersonalInfo();
}
