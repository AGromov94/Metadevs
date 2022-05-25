package PaladinsLesson4;

public class Task4 {
    public static void main(String[] args) {
        int[][] initialArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] invertArray = new int[3][3];

        System.out.println("Initial array");
        for (int[] i : initialArray) {
            for (int j : i) {
                System.out.print("[" + j + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray.length; j++) {
                invertArray[i][j] = initialArray[initialArray.length - 1 - i][initialArray.length - 1 - j];
            }
        }

        System.out.println("Invert array");
        for (int[] i : invertArray) {
            for (int j : i) {
                System.out.print("[" + j + "]");
            }
            System.out.println();
        }
    }
}
