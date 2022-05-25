package ForStepik;

import static ForStepik.SevenOne.inputWithValidation;

public class EightOne {
    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
        taskSix();
    }

    public static void taskOne() {
        int amount = inputWithValidation();
        int arr[] = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter " + i + " element of array");
            arr[i] = inputWithValidation();
        }
        for (int i = amount - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void taskTwo() {
        int amount = inputWithValidation();
        int arr[] = new int[amount];
        String answer = "";

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter " + i + " element of array");
            arr[i] = inputWithValidation();
        }
        for (int i = 0; i < amount; i++) {
            if (arr[i] == arr[amount - 1 - i]) {
                answer = "YES";
            } else {
                answer = "No";
            }
        }
        System.out.println(answer);
    }

    public static void taskSix() {
        int amount = inputWithValidation();
        int arr[] = new int[amount];
        double sum = 0;
        double average;

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter " + i + " element of array");
            arr[i] = inputWithValidation();
        }
        for (int i = 0; i < amount; i++) {
            sum = sum + arr[i];
        }
        average = sum / amount;
        System.out.printf("%.2f", average);
    }
}
