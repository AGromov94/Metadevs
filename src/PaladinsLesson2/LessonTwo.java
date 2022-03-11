package PaladinsLesson2;

import java.util.Scanner;

public class LessonTwo {
    public static Scanner scanner = new Scanner(System.in);
    public static int a, b;
    public static boolean statement;

    public static void main(String[] args) {
        System.out.println("Введите переменную");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        int value = scanner.nextInt();
        if (value > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }

        methodOne();
        methodTwo();
        methodThree();
        methodFour();
        methodFive();
        methodSix();
        methodSeven();
        methodEight();

        String answer;
        String catStandardSound = "мяу";
        System.out.println("Что говорит кошка?");
        scanner.nextLine();
        answer = scanner.nextLine();
        boolean retVal = answer.equalsIgnoreCase(catStandardSound);
        if (retVal) {
            System.out.println("Да, верно");
        } else {
            System.out.println("Это говорит какое-то другое животное");
        }

        int value1, value2;
        boolean statement1, statement2;
        System.out.println("Введите первое число ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        value1 = scanner.nextInt();
        System.out.println("Введите второе число ");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        value2 = scanner.nextInt();
        statement1 = value1 > value2;
        statement2 = value1 < value2;
        if (statement1) {
            System.out.println("Первое введенное число больше второго");
        } else if (statement2) {
            System.out.println("Первое введенное число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }

    static void methodOne() {
        a = 10;
        b = 5;
        statement = a > b;
        System.out.println(statement);
    }

    static void methodTwo() {
        a = 50;
        b = 25;
        statement = a > b;
        System.out.println(statement);
    }

    static void methodThree() {
        a = 67;
        b = 23;
        statement = a < b;
        System.out.println(statement);
    }

    static void methodFour() {
        a = 90;
        b = 80;
        statement = a == b;
        System.out.println(statement);
    }

    static void methodFive() {
        System.out.println("Введите значение а");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        a = scanner.nextInt();
        b = 90;
        statement = a == b;
        System.out.println(statement);
    }

    static void methodSix() {
        a = 100;
        System.out.println("Введите значение b");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        b = scanner.nextInt();
        statement = a < b;
        if (statement) {
            System.out.println(statement);
        }
    }

    static void methodSeven() {
        b = 60;
        System.out.println("Введите значение а");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        a = scanner.nextInt() + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        }
    }

    static void methodEight() {
        System.out.println("Введите значение а");
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не целочисленное значение, попробуйте еще раз");
            scanner.next();
        }
        b = 146;
        a = scanner.nextInt() + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        }
    }
}