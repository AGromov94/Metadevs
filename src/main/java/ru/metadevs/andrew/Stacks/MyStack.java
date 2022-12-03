package ru.metadevs.andrew.Stacks;

public class MyStack<T> implements IdealStack<T> {
    private int maxSize;
    private T[] arr;
    private int top;

    public MyStack(int s) {
        maxSize = s;
        arr = (T[]) new Object[maxSize];
        top = -1;
    }

    public void pushElementOnTheTop(T element) {
        arr[++top] = element;
    }

    public T popElementOfTheTop() {
        return arr[top--];
    }

    public T peekElementOfTheTop() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
