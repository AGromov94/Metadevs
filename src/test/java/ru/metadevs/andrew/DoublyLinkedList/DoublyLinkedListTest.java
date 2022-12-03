package ru.metadevs.andrew.DoublyLinkedList;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void checkThatListIsEmpty(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();

        assertThat(testList.isEmpty()).isTrue();
    }

    @Test
    public void shouldInsertElementAtFirst() {
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");

        assertThat(testList.getFirst().getData()).isEqualTo("Andrew");
    }

    @Test
    public void shouldInsertElementAtLast(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");
        testList.insertLastElement("Fedor");
        testList.displayForward();

        assertThat(testList.getLast().getData()).isEqualTo("Fedor");
    }

    @Test
    public void shouldDeleteFirstElement(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");
        testList.deleteFirst();

        assertThat(testList.getFirst().getData()).isEqualTo("Max");
    }

    @Test
    public void shouldDeleteLastElement(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");
        testList.deleteLast();

        assertThat(testList.getLast().getData()).isEqualTo("Max");
    }

    @Test
    public void shouldDeleteElementWithCurrentKey(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");

        assertThat(testList.deleteKey("Max").getData()).isEqualTo("Max");
        testList.displayForward();
    }

    @Test
    public void shouldInsertElementAfterCurrentKey(){
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.insertFirstElement("Ivan");
        testList.insertFirstElement("Max");
        testList.insertFirstElement("Andrew");

        assertThat(testList.insertAfter("Max","Fedor")).isTrue();
        testList.displayForward();
    }
}