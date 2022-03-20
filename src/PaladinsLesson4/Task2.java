package PaladinsLesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        outputOfEvenNumbers();
    }

    public static void outputOfEvenNumbers() {
        int upperLimit;
        int lowLimit;
        System.out.println("Введите верхнюю границу диапазона");
        upperLimit = inputWithValidation();
        System.out.println("Введите нижнюю границу диапазона");
        lowLimit = inputWithValidation();
        for (int i = lowLimit; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int inputWithValidation() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Требуется ввести целочисленное значение");
            scan.next();
        }
        return scan.nextInt();
    }
}
