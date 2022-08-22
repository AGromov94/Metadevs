package ru.metadevs.andrew.OOP;

public class LessonOOP {
    public static void main(String[] args) {
        Company simaland = new Company("Sima-Land", 2);

        Worker sasha = new Worker("Sasha", 40);
        Manager anton = new Manager("Anton", 30);

        simaland.hire(sasha, 20000);
        simaland.hire(anton, 40000);
        simaland.printEmployees();
    }
}

