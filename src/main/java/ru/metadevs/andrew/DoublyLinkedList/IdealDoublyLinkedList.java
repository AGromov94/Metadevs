package ru.metadevs.andrew.DoublyLinkedList;

public interface IdealDoublyLinkedList<T> {
    boolean isEmpty();

    void insertFirstElement(T element);

    void insertLastElement(T element);

    Link deleteFirst();

    Link deleteLast();

    void displayForward();

    void displayBackward();

    boolean insertAfter(T key, T element);

    Link deleteKey(T key);
}
