package com.company;

import java.util.Scanner;

public class Dacha228 {
    public static void main(String[] args) {
        //вывод в консоль фразы Hell YEAH
    /*System.out.println("Hell YEAH");*/
    int value1=0;//такой вот коммент
    int value2=5;
    int sum=value1+value2;
    System.out.println("Сумма "+sum);
    int multiply=value1*value2;
    System.out.println("Произведение "+multiply);
    int difference=value1-value2;
    System.out.println("Разность "+difference);

        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);

    }
}
