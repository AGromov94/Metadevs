package com.company.lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Число равно 1");
                break;
            case 8:
                System.out.println("Число равно 8");
                break;
            case 9:
                System.out.println("Число равно 9");
                break;
            default:
                System.out.println("Число не равно 1, 8, 9");
        }

        if (num == 1) {
            System.out.println("Число равно 1");
        }
        if (num == 8) {
            System.out.println("Число равно 8");
        }
        if (num == 9) {
            System.out.println("Число равно 9");
        } else {
            System.out.println("Число не равно 1, 8, 9");
        }

        equalityEightNineOrOne(num);
        equalityOneOrZero(num);
        outputNumbers();
        equalityTen(4);

        int year = 85;
        while (year >= 0) {
            if (year % 4 == 0) {
                System.out.println("Високосный год: " + year);
            }
            year--;
        }
    }

    public static void equalityEightNineOrOne(int num) {
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8, 9");
        } else System.out.println("Число равно 1, 8, 9");
    }

    public static void equalityOneOrZero(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Число равно 1 или 0");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }
    }

    public static void outputNumbers() {
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
    }

    public static int equalityTen(int x) {
        return x == 10 ? 1 : 2;
    }
}
