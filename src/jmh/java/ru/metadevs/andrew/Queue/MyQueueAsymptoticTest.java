package ru.metadevs.andrew.Queue;

import org.openjdk.jmh.annotations.*;
import ru.metadevs.andrew.Stacks.MyStack;

@State(Scope.Benchmark)
public class MyQueueAsymptoticTest {
    @Param({"100", "1000", "10000"})
    public int value;

    MyQueue jmhqueue;

    @Setup(Level.Invocation)
    public void preparation() {
        jmhqueue = new MyQueue(value);
        for (int i = 0; i < value - 1; i++) {
            jmhqueue.add(i);
        }
    }

    @Benchmark
    public void addElement() {
        jmhqueue.add(value);
    }

    @Benchmark
    public void removeElement() {
        jmhqueue.remove();
    }

    @Benchmark
    public void peekElement() {
        jmhqueue.peek();
    }

    @Benchmark
    public void queueIsEmpty() {
        jmhqueue.isEmpty();
    }

    @Benchmark
    public void queueIsFull() {
        jmhqueue.isFull();
    }

    @Benchmark
    public void queueSize() {
        jmhqueue.size();
    }

    @Benchmark
    public void containsElement(){
        jmhqueue.contains(value);
    }
}
