package OOP;

import java.util.Arrays;

public class Company {
    private String name;
    private Worker[] workers;

    public Company(String name, int amountOfWorkers) {
        this.name = name;
        this.workers = new Worker[amountOfWorkers];
    }

    public void hire(Worker worker) {
        Worker[] hireArray = new Worker[workers.length + 1];
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = worker;
                return;
            }
            hireArray[i] = workers[i];
        }
        hireArray[workers.length] = worker;
        workers = hireArray;
    }

    public void fire(Worker worker) {
        int deleteIndex = Arrays.asList(workers).indexOf(worker);
        Worker[] fireArray = new Worker[workers.length - 1];
        System.arraycopy(workers, 0, fireArray, 0, deleteIndex);
        System.arraycopy(workers, deleteIndex + 1, fireArray, deleteIndex, workers.length - 1 - deleteIndex);

        workers = fireArray;
    }

    public void printWorkers() {
        for (int i = 0; i < workers.length; i++) {
            System.out.print(workers[i].getName());
            System.out.print(" " + workers[i].getAge() + " ");
            System.out.printf("%.2f", workers[i].getSalary());
            System.out.println();
        }
    }
}
