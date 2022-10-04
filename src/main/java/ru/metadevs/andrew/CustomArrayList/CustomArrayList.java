package ru.metadevs.andrew.CustomArrayList;

//import org.omg.CORBA.Object;

import java.util.*;

public class CustomArrayList<T> implements List<T> {
    private T[] arr;
    private int amountOfElements;
    private final static int DEFAULT_CAPACITY = 10;

    //конструктор класса CustomArrayList
    public CustomArrayList(T[] arr) {
        this.arr = arr;
        this.amountOfElements = arr.length;
    }

    public CustomArrayList() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
        this.amountOfElements = 0;
    }

    private T[] copyOf(T[] arr, int length) {
        T[] newArray = (T[]) new Object[length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    @Override
    public void add(int index, T element) {
        if (amountOfElements == arr.length) {
            int newLength = (int) (arr.length * 1.5);
            arr = copyOf(arr, newLength);
        }
        if (index > (amountOfElements - 1) && index < 0) {
            throw new IndexOutOfBoundsException("This index is out of length of array");
        }
        for (int i = amountOfElements; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        amountOfElements++;
    }

    @Override
    public boolean remove(Object elementForRemove) {
        for (int i = 0; i < amountOfElements; i++) {
            if (arr[i].equals(elementForRemove)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index > (amountOfElements - 1) && index < 0) {
            throw new IndexOutOfBoundsException("This index is out of length of array");
        }
        T deletedElement = arr[index];
        for (int i = index; i < amountOfElements - 1; i++) {
            arr[i] = arr[i + 1];
        }
        amountOfElements--;
        return deletedElement;
    }

    @Override
    public int size() {
        return getAmountOfElements();
    }

    @Override
    public boolean isEmpty() {
        if (amountOfElements != 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (T i : arr) {
            if (i.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        T[] subArr = (T[]) new Object[toIndex - fromIndex];
        if (toIndex > (amountOfElements - 1) && fromIndex < 0) {
            throw new IndexOutOfBoundsException("This index is out of length of array");
        }
        for (int j = 0, i = fromIndex; i < toIndex; j++, i++) {
            subArr[j] = arr[i];
        }
        return new CustomArrayList<>(subArr);
    }

    //region another methods
    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }
    //endregion

    //region getters/setters
    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int getAmountOfElements() {
        return amountOfElements;
    }

    public void setAmountOfElements(int amountOfElements) {
        this.amountOfElements = amountOfElements;
    }
    //endregion
}
