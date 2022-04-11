package ForStepik;

import static ForStepik.SevenOne.inputWithValidation;

public class SevenThree {
    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
        //taskThree();
        taskFour();
    }

    public static void taskOne() {
        System.out.println("Enter the amount of numbers");
        int amount = inputWithValidation();
        int number;
        int arr[] = new int[amount];
        for (int i = 1; i <= amount; i++) {
            System.out.println("Enter " + i + " number");
            number = inputWithValidation();
            arr[i - 1] = number;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }

    public static void taskTwo() {
        System.out.println("Enter the height of pyramid");
        int heightOfPyramid = inputWithValidation();
        for (int i = 0; i <= heightOfPyramid; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void taskThree() {
        int userInput;
        int counter = 0;
        do {
            userInput = inputWithValidation();
            if (userInput < 0 && userInput != -9999) {
                counter++;
            }
        }
        while (userInput != -9999);
        if (counter > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void taskFour() {
        System.out.println("Enter the amount of numbers");
        int amount = inputWithValidation();
        int number;
        int arr[] = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter " + i + " number");
            number = inputWithValidation();
            arr[i] = number;
        }
        for (int i = 0; i < amount - 1; i++) {
            for (int j = i + 1; j < amount; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < amount; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
