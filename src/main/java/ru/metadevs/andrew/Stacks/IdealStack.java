package ru.metadevs.andrew.Stacks;

public interface IdealStack<T> {

    void pushElementOnTheTop(T element);

    T popElementOfTheTop();

    T peekElementOfTheTop();

    boolean isEmpty();

    boolean isFull();
}
