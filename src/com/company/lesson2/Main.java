package com.company.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5, 23);

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;

        if (aGreaterThenB) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
            if (aLessThenB) {
                System.out.println("a < b");
            }

            if (aGreaterOrEqualThenB) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }

            if (aLessOrEqualThenB) {
                System.out.println("a <= b");
            } else {
                System.out.println("a > b");
            }
        }

        System.out.println("Задание в конце урока");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    static void sum(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }
}
