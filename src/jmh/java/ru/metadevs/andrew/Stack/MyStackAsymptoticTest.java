package ru.metadevs.andrew.Stack;

import org.openjdk.jmh.annotations.*;
import ru.metadevs.andrew.Stacks.MyStack;

@State(Scope.Benchmark)
public class MyStackAsymptoticTest {
    @Param({"100", "1000", "10000"})
    public int value;

    MyStack<Object> jmhstack;

    @Setup(Level.Invocation)
    public void preparation() {
        jmhstack = new MyStack<>(value);
        for (int i = 0; i < value - 1; i++) {
            jmhstack.pushElementOnTheTop(i);
        }
    }

    @Benchmark
    public void pushElementOnTheTop() {
        jmhstack.pushElementOnTheTop(value);
    }

    @Benchmark
    public void popElementOnTheTop() {
        jmhstack.popElementOfTheTop();
    }

    @Benchmark
    public void peekElementOfTheTop() {
        jmhstack.peekElementOfTheTop();
    }

    @Benchmark
    public void stackIsEmpty() {
        jmhstack.isEmpty();
    }

    @Benchmark
    public void stackIsFull() {
        jmhstack.isFull();
    }
}
