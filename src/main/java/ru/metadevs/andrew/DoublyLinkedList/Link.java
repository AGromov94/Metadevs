package ru.metadevs.andrew.DoublyLinkedList;

public class Link<T> {
    public T data;
    public Link next;
    public Link previous;

    public Link(T d) {
        this.data = d;
    }

    public T getData(){
        return data;
    }

    public void displayLink() {
        System.out.println(data);
    }
}
