package ru.metadevs.andrew.Queue;

import java.util.Collection;
import java.util.Iterator;

public class MyQueue<T> implements java.util.Queue {
    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue(int s) {
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    @Override
    public boolean add(Object o) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = (T) o;
        nItems++;
        return true;
    }

    @Override
    public T remove() {
        T temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    @Override
    public T peek() {
        return queArray[front];
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    @Override
    public boolean isEmpty() {
        return (nItems == 0);
    }

    @Override
    public int size() {
        return nItems;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < nItems; i++) {
            if (queArray[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    //region another methods
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
    //endregion
}
