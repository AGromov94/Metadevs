package ru.metadevs.andrew.DoublyLinkedList;

public class DoublyLinkedList<T> implements IdealDoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirstElement(Object element) {
        Link newLink = new Link(element);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLastElement(Object element) {
        Link newLink = new Link(element);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public void displayForward() {
        System.out.print("List (first-->last): \n");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public void displayBackward() {
        System.out.print("List (last-->first): \n");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
    }

    public boolean insertAfter(Object key, Object element) {
        Link current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Link newLink = new Link(element);
        if(current == last){
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(Object key) {
        Link current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            current = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }
}
