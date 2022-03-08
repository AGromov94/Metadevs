package com.company.GameGuessNumber;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 100);
        int numberOfAttempts = 10;
        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Попробуй угадай число от 1 до 100");
        for (int i = 1; i <= numberOfAttempts; i++) {
            System.out.println("Введите число");
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();

                if (randomNumber > userNumber) {
                    System.out.println("Загаданное число больше");
                } else if (randomNumber < userNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Вы отгадали число");
                    break;
                }
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        System.out.println("\nПопробуйте в другой раз");
    }
}
