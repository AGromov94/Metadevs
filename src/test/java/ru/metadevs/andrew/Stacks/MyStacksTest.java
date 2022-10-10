package ru.metadevs.andrew.Stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyStacksTest {

    @Test
    public void shouldPushElementOnTopOfStack() {
        MyStack stack = new MyStack(5);
        stack.pushElementOnTheTop(0);
        stack.pushElementOnTheTop(1);
        stack.pushElementOnTheTop(2);
        stack.pushElementOnTheTop(3);
        stack.pushElementOnTheTop(4);

        assertEquals(stack.peekElementOfTheTop(), 4);
    }

    @Test
    public void shouldPopElementOnTopOfStack() {
        MyStack stack = new MyStack(5);
        stack.pushElementOnTheTop(0);
        stack.pushElementOnTheTop(1);
        stack.pushElementOnTheTop(2);
        stack.pushElementOnTheTop(3);
        stack.pushElementOnTheTop(4);

        stack.popElementOfTheTop();
        assertEquals(stack.peekElementOfTheTop(), 3);
    }

    @Test
    public void checkThatStackIsNotEmpty() {
        MyStack stack = new MyStack(5);
        stack.pushElementOnTheTop(0);
        stack.pushElementOnTheTop(1);
        stack.pushElementOnTheTop(2);
        stack.pushElementOnTheTop(3);
        stack.pushElementOnTheTop(4);

        assertTrue(stack.isFull());
    }

    @Test
    public void checkThatStackIsEmpty() {
        MyStack stack = new MyStack(5);

        assertTrue(stack.isEmpty());
    }
}
