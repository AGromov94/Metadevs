package OOP;

public class LessonOOP {
    public static void main(String[] args) throws Exception {
        Worker sasha = new Worker("Sasha", 40, 30000);
        Worker anton = new Worker("Anton", 30, 20000);
        Worker ivan = new Worker("Ivan", 20, 15000);
        Worker fedor = new Worker("Fedor", 25, 150000);
        Worker misha = new Worker("Misha", 32, 75000);

        Company simaland = new Company("Sima-Land", 5);

        simaland.hire(sasha);
        simaland.hire(anton);
        simaland.hire(ivan);
        simaland.hire(fedor);
        simaland.hire(misha);
        simaland.fire(misha);
        simaland.fire(anton);
        simaland.printWorkers();
    }
}

