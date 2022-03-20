package PaladinsLesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int UserInput;
        System.out.println("Введите число");
        UserInput = inputWithValidation();
        int factorial = factorialCalculation(UserInput);
        System.out.println(UserInput + "!= " + factorial);
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
