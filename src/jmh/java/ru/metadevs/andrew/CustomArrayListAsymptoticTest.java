package ru.metadevs.andrew;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
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

    @Param({"1001", "10001", "100001"})
    public int value;

    @Benchmark
    public  void addByIndex(){
        for (int i = 0; i < value-1; i++) {
            testList.add(value,ivan);
        }
    }
}
