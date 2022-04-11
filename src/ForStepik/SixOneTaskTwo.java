package ForStepik;

import java.util.Scanner;

public class SixOneTaskTwo {
    public static void main(String[] args) {
        schoolGradeValues();
    }

    public static void schoolGradeValues() {
        System.out.println("Enter the mark");
        int userInput = inputWithValidation();
        switch (userInput) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("wrong mark");
        }
    }

    public static int inputWithValidation() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("It's not a number, try again");
            scan.next();
        }
        return scan.nextInt();
    }
}
