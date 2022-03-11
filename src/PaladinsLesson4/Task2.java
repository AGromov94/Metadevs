package PaladinsLesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        outputOfEvenNumbers();
    }

    public static void outputOfEvenNumbers() {
        int upperLimit;
        int lowLimit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите верхнюю границу диапазона");
        while (!scan.hasNextInt()) {
            System.out.println("Граница должна быть числом, попробуйте еще раз");
            scan.next();
        }
        upperLimit = scan.nextInt();
        System.out.println("Введите нижнюю границу диапазона");
        while (!scan.hasNextInt()) {
            System.out.println("Граница должна быть числом, попробуйте еще раз");
            scan.next();
        }
        lowLimit = scan.nextInt();
        for (int i = lowLimit; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
