package LiveCoding2;

import java.util.Scanner;

public class LiveCodingTwo {
    static int myArray[];

    public static void main(String[] args) {
        int numberOfOperation;
        System.out.printf("Please, select an operation:\n\n" +
                "1 - Enter an array of numbers\n" +
                "2 - Output an array of numbers\n" +
                "3 - Change array element (enter its number and new value)\n" +
                "4 - Remove array element\n" +
                "5 - Add a new array element.\n" +
                "6 - Fill the array with the entered number.\n" +
                "7 - Exit\n");
        do {
            System.out.println("\nPlease, select an operation");
            numberOfOperation = inputWithValidation();
            switch (numberOfOperation) {
                case 1:
                    newArray();
                    break;
                case 2:
                    arrayOutput();
                    break;
                case 3:
                    arrayCorrect();
                    break;
                case 4:
                    arrayElementDelete();
                    break;
                case 5:
                    arrayAddElement();
                    break;
                case 6:
                    arraySameNumber();
                    break;
                case 7:
                    System.out.println("It's exit of this program");
                    break;
                default:
                    System.out.println("Operation is not defined");
            }
        }
        while (numberOfOperation != 7);
    }


    public static void newArray() {
        System.out.println("Please, enter the array length");
        int length = inputWithValidation();
        myArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please, enter the " + i + " element of array");
            myArray[i] = inputWithValidation();
        }
    }

    public static void arrayOutput() {
        if (myArray != null) {
            System.out.println("Your array:");
            for (int i : myArray) {
                System.out.print("[" + i + "]");
            }
        } else {
            System.out.println("Go back to 1 operation");
        }
    }

    public static void arrayCorrect() {
        if (myArray != null) {
            System.out.println("Enter the index of element for change");
            int element = inputWithValidation();
            if (element < myArray.length) {
                System.out.println("Enter the new element");
                myArray[element] = inputWithValidation();
            } else {
                System.out.println("Wrong index");
            }
        } else {
            System.out.println("Go back to 1 operation");
        }
    }

    public static void arrayElementDelete() {
        if (myArray != null) {
            System.out.println("Enter the index of element for delete");
            int deleteIndex = inputWithValidation();
            if (deleteIndex < myArray.length) {
                int[] deleteArray = new int[myArray.length - 1];
                System.arraycopy(myArray, 0, deleteArray, 0, myArray.length - 1 - deleteIndex);
                System.arraycopy(myArray, deleteIndex + 1, deleteArray, deleteIndex, myArray.length - 1 - deleteIndex);
                for (int i : deleteArray) {
                    System.out.print("[" + i + "]");
                }
            } else {
                System.out.println("Wrong index");
            }
        } else {
            System.out.println("Go back to 1 operation");
        }
    }

    public static void arrayAddElement() {
        if (myArray != null) {
            System.out.println("Enter the element for addition");
            int addElement = inputWithValidation();
            int[] additionArray = new int[myArray.length + 1];
            System.arraycopy(myArray, 0, additionArray, 0, myArray.length);
            additionArray[myArray.length] = addElement;
            for (int i : additionArray) {
                System.out.print("[" + i + "]");
            }
        } else {
            System.out.println("Go back to 1 operation");
        }
    }

    public static void arraySameNumber() {
        if (myArray != null) {
            System.out.println("Enter the number");
            int sameNumber = inputWithValidation();
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = sameNumber;
            }
        } else {
            System.out.println("Go back to 1 operation");
        }
    }

    public static int inputWithValidation() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("It's not an integer number");
            scan.next();
        }
        return scan.nextInt();
    }
}
