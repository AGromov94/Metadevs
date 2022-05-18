package OOP;

import java.util.Arrays;

public class Company implements IdealCompany {
    private String name;
    private Employee[] workers;

    public Company(String name, int amountOfWorkers) {
        this.name = name;
        this.workers = new Employee[amountOfWorkers];
    }

    @Override
    public void hire(Employee worker) {
        Employee[] hireArray = new Employee[workers.length + 1];
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

    @Override
    public void fire(Employee worker) {
        int deleteIndex = Arrays.asList(workers).indexOf(worker);
        Employee[] fireArray = new Employee[workers.length - 1];
        System.arraycopy(workers, 0, fireArray, 0, deleteIndex);
        System.arraycopy(workers, deleteIndex + 1, fireArray, deleteIndex, workers.length - 1 - deleteIndex);

        workers = fireArray;
    }

    @Override
    public void printWorkers() {
        for (int i = 0; i < workers.length; i++) {
            System.out.print(workers[i].getName());
            System.out.print(" " + workers[i].getAge() + " ");
            System.out.printf("%.2f", workers[i].getSalary());
            System.out.println();
        }
    }
}
