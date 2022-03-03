package PaladinsLesson1;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {
        int value1, value2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 переменную:");
        value1 = scanner.nextInt();
        System.out.println("Введите 2 переменную:");
        value2 = scanner.nextInt();

        int sum = value1 + value2;
        System.out.println("Cумма равна " + sum);
        int difference = value1 - value2;
        System.out.println("Разность равна " + difference);
        int multiply = value1 * value2;
        System.out.println("Произведение равно " + multiply);
        double quotient = (double) value1 / value2;
        System.out.println("Частное равно " + quotient);

        String firstName, lastName;
        int age;

        scanner.nextLine();
        System.out.println("Введите имя");
        firstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        lastName = scanner.nextLine();
        System.out.println("Введите возраст");
        age = scanner.nextInt();
        System.out.println("Фамилия " + lastName);
        System.out.println("Имя " + firstName);
        System.out.println("Возраст " + age);
    }
}
