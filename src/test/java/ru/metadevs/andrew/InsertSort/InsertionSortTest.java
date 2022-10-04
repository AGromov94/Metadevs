package ru.metadevs.andrew.InsertSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void shouldPrintArr() {
        int maxAmount = 200;
        ArrayIns arr = new ArrayIns(maxAmount);
        for (int i = 0; i < 20; i++) {
            arr.insertElementInArray((int) (Math.random() * (maxAmount + 1)));
        }
        arr.printElementsOfArray();
    }

    @Test
    public void shouldApplyInsertionSortForRandomArr() {
        int maxAmount = 20;
        ArrayIns arr = new ArrayIns(maxAmount);
        for (int i = 0; i < 20; i++) {
            arr.insertElementInArray((int) (Math.random() * (maxAmount + 1)));
        }
        arr.insertionSort();

        for (int i = 0; i < arr.getArr().length - 1; i++) {
            assertTrue(arr.getArr()[i] <= arr.getArr()[i + 1]);
        }
    }

    @Test
    public void shouldApplyInsertionSortForArr() {
        int maxAmount = 10;
        int[] standardArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayIns arr = new ArrayIns(maxAmount);
        arr.insertElementInArray(2);
        arr.insertElementInArray(5);
        arr.insertElementInArray(8);
        arr.insertElementInArray(1);
        arr.insertElementInArray(9);
        arr.insertElementInArray(0);
        arr.insertElementInArray(4);
        arr.insertElementInArray(3);
        arr.insertElementInArray(7);
        arr.insertElementInArray(6);
        arr.insertionSort();
        assertArrayEquals(arr.getArr(), standardArr, "Arrays are not the same");
    }

    @Test
    public void shouldApplySelectionSortForRandomArr() {
        int maxAmount = 20;
        ArrayIns arr = new ArrayIns(maxAmount);
        for (int i = 0; i < 20; i++) {
            arr.insertElementInArray((int) (Math.random() * (maxAmount + 1)));
        }
        arr.selectionSort();

        for (int i = 0; i < arr.getArr().length - 1; i++) {
            assertTrue(arr.getArr()[i] <= arr.getArr()[i + 1]);
        }
    }

    @Test
    public void shouldApplySelectionSortForArr() {
        int maxAmount = 10;
        int[] standardArr = {0, 1, 2, 3, 4, 5, 5, 6, 8, 9};
        ArrayIns arr = new ArrayIns(maxAmount);
        arr.insertElementInArray(2);
        arr.insertElementInArray(5);
        arr.insertElementInArray(8);
        arr.insertElementInArray(1);
        arr.insertElementInArray(9);
        arr.insertElementInArray(0);
        arr.insertElementInArray(4);
        arr.insertElementInArray(3);
        arr.insertElementInArray(5);
        arr.insertElementInArray(6);
        arr.selectionSort();
        assertArrayEquals(arr.getArr(), standardArr, "Arrays are not the same");
    }

    @Test
    public void shouldApplyBubbleSortForRandomArr() {
        int maxAmount = 20;
        ArrayIns arr = new ArrayIns(maxAmount);
        for (int i = 0; i < 20; i++) {
            arr.insertElementInArray((int) (Math.random() * (maxAmount + 1)));
        }
        arr.bubbleSort();

        for (int i = 0; i < arr.getArr().length - 1; i++) {
            assertTrue(arr.getArr()[i] <= arr.getArr()[i + 1]);
        }
    }

    @Test
    public void shouldApplyBubbleSortForArr() {
        int maxAmount = 10;
        int[] standardArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayIns arr = new ArrayIns(maxAmount);
        arr.insertElementInArray(2);
        arr.insertElementInArray(5);
        arr.insertElementInArray(8);
        arr.insertElementInArray(1);
        arr.insertElementInArray(9);
        arr.insertElementInArray(0);
        arr.insertElementInArray(4);
        arr.insertElementInArray(3);
        arr.insertElementInArray(7);
        arr.insertElementInArray(6);
        arr.bubbleSort();
        assertArrayEquals(arr.getArr(), standardArr, "Arrays are not the same");
    }
}
