package ru.metadevs.andrew.Stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyStacksTest {

    @Test
    public void shouldPushElementOnTopOfStack() {
        MyStack<Integer> stack = new MyStack<Integer>(5);
        Integer a = 1, b = 2, c = 3, d = 4, e = 5;
        stack.pushElementOnTheTop(a);
        stack.pushElementOnTheTop(b);
        stack.pushElementOnTheTop(c);
        stack.pushElementOnTheTop(d);
        stack.pushElementOnTheTop(e);

        assertEquals(stack.peekElementOfTheTop(), e);
    }

    @Test
    public void shouldPopElementOnTopOfStack() {
        MyStack<Integer> stack = new MyStack<Integer>(5);
        Integer a = 1, b = 2, c = 3, d = 4, e = 5;
        stack.pushElementOnTheTop(a);
        stack.pushElementOnTheTop(b);
        stack.pushElementOnTheTop(c);
        stack.pushElementOnTheTop(d);
        stack.pushElementOnTheTop(e);

        stack.popElementOfTheTop();
        assertEquals(stack.peekElementOfTheTop(), d);
    }

    @Test
    public void checkThatStackIsNotEmpty() {
        MyStack<Integer> stack = new MyStack<Integer>(5);
        Integer a = 1, b = 2, c = 3, d = 4, e = 5;
        stack.pushElementOnTheTop(a);
        stack.pushElementOnTheTop(b);
        stack.pushElementOnTheTop(c);
        stack.pushElementOnTheTop(d);
        stack.pushElementOnTheTop(e);

        assertTrue(stack.isFull());
    }

    @Test
    public void checkThatStackIsEmpty() {
        MyStack stack = new MyStack(5);

        assertTrue(stack.isEmpty());
    }
}
