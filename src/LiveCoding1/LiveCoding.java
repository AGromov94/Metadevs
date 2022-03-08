package LiveCoding1;

import java.util.Scanner;

public class LiveCoding {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int value1, value2;
        int userInput;

        System.out.println("Please, enter the first variable");
        value1 = checkInt();
        System.out.println("Please, enter the second variable");
        value2 = checkInt();
        System.out.println("\nPlease, enter the number of operation:");
        System.out.printf("1 - Addition%n2 - Subtraction%n3 - Multiplication\n\n");
        userInput = checkInt();

            switch (userInput) {
                case 1:
                    int sum = value1 + value2;
                    System.out.println(sum);
                    break;
                case 2:
                    int difference = value1 - value2;
                    System.out.println(difference);
                    break;
                case 3:
                    int multiply = value1 * value2;
                    System.out.println(multiply);
                    break;
                default: System.out.println("Incorrect input");
        }
    }

    public static int checkInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число");
            sc.next();
        }
        return sc.nextInt();
    }
}
