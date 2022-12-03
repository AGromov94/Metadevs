package ru.metadevs.andrew.Queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MyQueueTest {

    @Test
    public void shouldCheckSizeOfQueue() {
        MyQueue<String> queue = new MyQueue<>(5);
        queue.add("String1");
        queue.add("String2");

        assertThat(queue.size()).isEqualTo(2);
    }

    @Test
    public void shouldAddElementToTheEndOfQueue() {
        MyQueue<String> queue = new MyQueue<>(5);
        queue.add("String1");
        queue.add("String2");
        queue.add("String3");
        queue.add("String4");
        queue.add("String5");

        assertThat(queue.size()).isEqualTo(5);
        assertThat(queue.peek()).isEqualTo("String1");
    }

    @Test
    public void shouldRemoveElementFromStartOfQueue() {
        MyQueue<String> queue = new MyQueue<>(5);
        queue.add("String1");
        queue.add("String2");
        queue.add("String3");
        queue.add("String4");
        queue.add("String5");
        queue.remove();

        assertThat(queue.peek()).isEqualTo("String2");
        assertThat(queue.size()).isEqualTo(4);
    }

    @Test
    public void shouldCheckThatQueueIsEmpty() {
        MyQueue<String> queue = new MyQueue<>(5);

        assertThat(queue.isEmpty()).isTrue();
        assertThat(queue.isFull()).isFalse();
    }

    @Test
    public void shouldCheckThatQueueIsFull() {
        MyQueue<String> queue = new MyQueue<>(2);
        queue.add("String1");
        queue.add("String2");

        assertThat(queue.isEmpty()).isFalse();
        assertThat(queue.isFull()).isTrue();
    }

    @Test
    public void shouldCheckThatQueueContainsElement(){
        MyQueue<String> queue = new MyQueue<>(2);
        queue.add("String1");
        queue.add("String2");

        assertThat(queue.contains("String2")).isTrue();
    }
}
