package PaladinsLesson3;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        int month;
        for (month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                case 2:
                case 12:
                    System.out.println(month + " - Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(month + " - Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month + " - Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month + " - Осень");
                    break;
            }
        }

        int number, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение number");
        while (!scan.hasNextInt()) {
            System.out.println("Это не число, попробуйте еще раз");
            scan.next();
        }
        number = scan.nextInt();
        System.out.println("Введите значение i");
        while (!scan.hasNextInt()) {
            System.out.println("Это не число, попробуйте еще раз");
            scan.next();
        }
        i = scan.nextInt();
        if (number < i) {
            for (int j = number; j < i; j++) {
                System.out.println("Любая фраза");
                number++;
            }
        } else {
            System.out.println("Заданное число больше или равно i");
        }

        int a;

        addSevenOrDivideByTen(5);
        addSevenOrDivideByTen(0);
        addSevenOrDivideByTen(-3);
        addSevenOrDivideByTen(2);

        compareWithZeroAndFive(5);
        compareWithZeroAndFive(0);
        compareWithZeroAndFive(-3);
        compareWithZeroAndFive(2);
    }

    public static void addSevenOrDivideByTen(int a) {
        int b = ((a == 2 || a == 0) ? a + 7 : a / 10);
        System.out.println(b);
    }

    public static void compareWithZeroAndFive(int a) {
        System.out.println((a > 0 && a < 5) ? ("Верно") : ("Неверно"));
    }
}

