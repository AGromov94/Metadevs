package PaladinsLesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int UserInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        while (!scan.hasNextInt()) {
            System.out.println("Это не число, попробуйте еще раз");
            scan.next();
        }
        UserInput = scan.nextInt();
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
}
