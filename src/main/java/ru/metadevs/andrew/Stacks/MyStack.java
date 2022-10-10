package ru.metadevs.andrew.Stacks;

public class MyStack {
    private int maxSize;
    private long[] arr;
    private int top;

    public MyStack(int s) {
        maxSize = s;
        arr = new long[maxSize];
        top = -1;
    }

    public void pushElementOnTheTop(long element) {
        arr[++top] = element;
    }

    public long popElementOfTheTop() {
        return arr[top--];
    }

    public long peekElementOfTheTop() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
