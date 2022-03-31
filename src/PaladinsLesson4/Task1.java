package PaladinsLesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int userInput;
        System.out.println("Введите число");
        userInput = inputWithValidation();
        int factorial = factorialCalculation(userInput);
        System.out.println(userInput + "!= " + factorial);
    }

    public static int factorialCalculation(int UserInput) {
        int result;
        result = 1;
        for (int i = 1; i <= UserInput; i++) {
            result = result * i;
        }
        return result;
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
