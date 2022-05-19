package OOP;

public class LessonOOP {
    public static void main(String[] args) throws Exception {
        Employee sasha = new Worker("Sasha", 40, 30000);
        Employee anton = new Worker("Anton", 30, 20000);
        Employee ivan = new Worker("Ivan", 20, 15000);
        Employee fedor = new Manager("Fedor", 25, 150000);
        Employee misha = new Worker("Misha", 32, 75000);

        Company simaland = new Company("Sima-Land", 5);

        simaland.hire(sasha);
        simaland.hire(anton);
        simaland.hire(ivan);
        simaland.hire(fedor);
        simaland.hire(misha);
        simaland.fire(misha);
        simaland.fire(anton);
        simaland.printEmployees();
        fedor.haveVacation();
    }
}

