package ru.metadevs.andrew.InsertSort;

public class ArrayIns {
    private final int[] arr;
    private int counterOfElements;

    public ArrayIns(int max) {
        arr = new int[max];
        counterOfElements = 0;
    }

    public ArrayIns(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void insertElementInArray(int element) {
        arr[counterOfElements] = element;
        counterOfElements++;
    }

    public void printElementsOfArray() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void insertionSort() {
        int in;
        int out;

        for (out = 1; out < counterOfElements; out++) {
            int copyOfElement = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= copyOfElement) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = copyOfElement;
        }
    }

    public void selectionSort() {
        int out, in, min, temp;

        for (out = 0; out < counterOfElements - 1; out++) {
            min = out;
            for (in = out + 1; in < counterOfElements; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
        }
    }

    public void bubbleSort() {
        int out, in, temp;
        for (out = counterOfElements - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }
}
