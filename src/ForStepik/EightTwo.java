package ForStepik;

import static ForStepik.SevenOne.inputWithValidation;

public class EightTwo {
    public static void main(String[] args) {
        //taskOne();
        taskTwo();
    }

    public static void taskOne() {
        System.out.println("Enter amount of lines");
        int amountOfLines = inputWithValidation();
        System.out.println("Enter amount of columns");
        int amountOfColumns = inputWithValidation();
        int matrix[][] = new int[amountOfLines][amountOfColumns];

        for (int i = 0; i < amountOfLines; i++) {
            for (int j = 0; j < amountOfColumns; j++) {
                System.out.println("Enter the element " + i + " " + j);
                matrix[i][j] = inputWithValidation();
            }
        }
        for (int i = 0; i < amountOfLines; i++) {
            for (int j = 0; j < amountOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void taskTwo() {
        System.out.println("Enter amount of lines");
        int amountOfLines = inputWithValidation();
        System.out.println("Enter amount of columns");
        int amountOfColumns = inputWithValidation();
        int matrix[][] = new int[amountOfLines][amountOfColumns];

        for (int i = 0; i < amountOfLines; i++) {
            for (int j = 0; j < amountOfColumns; j++) {
                System.out.println("Enter the element " + i + " " + j);
                matrix[i][j] = inputWithValidation();
            }
        }
        System.out.println("Original matrix");
        for (int i = 0; i < amountOfLines; i++) {
            for (int j = 0; j < amountOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposition matrix");
        for (int i = 0; i < amountOfColumns; i++) {
            for (int j = 0; j < amountOfLines; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
