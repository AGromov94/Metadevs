package PaladinsLesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        arrayReverseOrder();
    }

    public static void arrayReverseOrder() {
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        while (!scan.hasNextInt()) {
            System.out.println("Требуется ввести целочисленное значение");
            scan.next();
        }
        length = scan.nextInt();
        scan.nextLine();
        String[] araiV1 = new String[length];
        for (int i = 0; i < araiV1.length; i++) {
            System.out.println("Ведите элемент массива номер " + i);
            araiV1[i] = scan.nextLine();
        }
        for (int i = araiV1.length - 1; i >= 0; i--) {
            System.out.print(araiV1[i] + " ");
        }
    }
}
