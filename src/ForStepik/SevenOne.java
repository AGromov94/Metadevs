package ForStepik;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SevenOne {
    public static void main(String[] args) {
        //taskOne();
        // taskTwo();
        // taskThree();
        // taskFour();
        // taskFive();
        // taskSix();
        // taskSeven();
        //taskEight();
        taskNine();
        //taskTen();
        //taskEleven();
    }

    public static void taskOne() {
        System.out.println("======Task1======");
        System.out.println("Enter the number");
        int number = inputWithValidation();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void taskTwo() {
        System.out.println("\n======Task2======");
        System.out.println("Enter the upper limit");
        int upperLimit = inputWithValidation();
        System.out.println("Enter the low limit");
        int lowLimit = inputWithValidation();
        if (upperLimit > lowLimit) {
            if (lowLimit <= 0) {
                for (int i = 1; i <= upperLimit; i++) {
                    System.out.printf("%d ", i);
                }
            } else {
                for (int i = lowLimit; i <= upperLimit; i++) {
                    System.out.printf("%d ", i);
                }
            }
        } else {
            System.out.println("upper limit should be more than low limit");
        }
    }

    public static void taskThree() {
        System.out.println("\n======Task3======");
        System.out.println("Enter the upper limit");
        int upperLimit = inputWithValidation();
        System.out.println("Enter the low limit");
        int lowLimit = inputWithValidation();
        if (upperLimit > lowLimit) {
            if (lowLimit <= 0) {
                for (int i = 1; i <= upperLimit; i++) {
                    System.out.printf("%d ", i);
                }
                System.out.println("\n" + upperLimit);
            } else {
                for (int i = lowLimit; i <= upperLimit; i++) {
                    System.out.printf("%d ", i);
                }
                System.out.println("\n" + (upperLimit - lowLimit + 1));
            }
        } else {
            System.out.println("upper limit should be more than low limit");
        }
    }

    public static void taskFour() {
        System.out.println("\n======Task4======");
        System.out.println("Enter the upper limit");
        int upperLimit = inputWithValidation();
        System.out.println("Enter the low limit");
        int lowLimit = inputWithValidation();
        if (upperLimit > lowLimit) {
            for (int i = upperLimit; i >= lowLimit; i--) {
                System.out.printf("%d ", i);
            }
        } else {
            System.out.println("upper limit should be more than low limit");
        }
    }

    public static void taskFive() {
        System.out.printf("\n======Task5======%nEnter the number\n");
        int userInput = inputWithValidation();
        int factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial = factorial * i;
        }
        System.out.println(userInput + "! = " + factorial);
    }

    public static void taskSix() {
        System.out.printf("\n======Task6======%nEnter the number\n");
        int userInput = inputWithValidation();
        int F = (int) ((pow(1.618034, userInput) - (pow(1 - 1.618034, userInput))) / sqrt(5));
        System.out.println(F);
    }

    public static void taskSeven() {
        System.out.println("\n======Task7======");
        System.out.println("Enter the upper limit");
        int upperLimit = inputWithValidation();
        System.out.println("Enter the low limit");
        int lowLimit = inputWithValidation();
        if (upperLimit > lowLimit) {
            for (int i = lowLimit; i <= upperLimit; i++) {
                for (int j = 0; j <= i - lowLimit; j++) {
                    System.out.printf("%5d ", i);
                }
            }
        } else {
            System.out.println("upper limit should be more than low limit");
        }
    }

    public static void taskEight() {
        System.out.println("\n======Task8======");
        System.out.println("Enter the upper limit");
        int upperLimit = inputWithValidation();
        System.out.println("Enter the low limit");
        int lowLimit = inputWithValidation();
        if (upperLimit > lowLimit) {
            for (int i = lowLimit; i <= upperLimit; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%4d ", i);
                }
            }
        } else {
            System.out.println("upper limit should be more than low limit");
        }
    }

    public static void taskNine() {
        System.out.println("\n======Task9======");
        System.out.println("Enter the number");
        int userNumber = inputWithValidation();
        int counter = 0;
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                System.out.printf("%d ", i);
                counter++;
            }
        }
        System.out.println("\n" + counter);
    }

    public static void taskTen() {
        System.out.println("\n======Task10======");
        System.out.println("Enter the number");
        int userNumber = inputWithValidation();
        int counter = 0;
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("It's easy number");
        } else {
            System.out.println("It's NOT easy number");
        }
    }

    public static void taskEleven() {
        System.out.println("\n======Task11======");
        System.out.println("Enter the amount of numbers");
        int amount = inputWithValidation();
        int max = -9999;
        int userNumber;
        for (int i = 1; i <= amount; i++) {
            System.out.println("Enter " + i + " number");
            userNumber = inputWithValidation();
            if (max < userNumber) {
                max = userNumber;
            }
        }
        System.out.println(max);
    }

    public static int inputWithValidation() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("It's not an integer, try again");
            scan.next();
        }
        return scan.nextInt();
    }
}
