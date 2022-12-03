package ru.metadevs.andrew.CustomArrayList;

import org.openjdk.jmh.annotations.*;
import ru.metadevs.andrew.CustomArrayList.CustomArrayList;
import ru.metadevs.andrew.OOP.Company.AbstractEmployee;
import ru.metadevs.andrew.OOP.Company.Manager;
import ru.metadevs.andrew.OOP.Company.Worker;

@State(Scope.Benchmark)
public class CustomArrayListAsymptoticTest {
    CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
    AbstractEmployee ivan = new Manager("Ivan", 21);
    AbstractEmployee pavel = new Worker("Pavel", 18);
    AbstractEmployee alex = new Worker("Alex", 18);

    @Param({"100", "1000", "10000"})
    public int value;

    @Setup(Level.Invocation)
    public void preparation(){
        for (int i = 0; i < value-1; i++) {
            testList.add(pavel);
        }
    }

    @Benchmark
    public  void addByIndex(){
        testList.add(value,ivan);
    }

    @Benchmark
    public void removeByIndex(){
        testList.remove(value);
    }

    @Benchmark
    public void removeElement(){
        testList.remove(ivan);
    }

    @Benchmark
    public void size(){
        testList.size();
    }

    @Benchmark
    public void contains(){
        testList.contains(pavel);
    }

    @Benchmark
    public void sublist(){
        testList.subList(1,10);
    }
}
