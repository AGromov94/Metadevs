package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hell YEAH");
        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int multiply = value1 * value2;
        System.out.println("Произведение " + multiply);
        int difference = value1 - value2;
        System.out.println("Разность " + difference);
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}
