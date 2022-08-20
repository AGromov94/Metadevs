package ru.metadevs.andrew.OOP;

public class LessonOOP {
    public static void main(String[] args) throws Exception {
        Employee sasha = new Worker("Sasha", 40);
        Employee anton = new Worker("Anton", 30);
        Employee ivan = new Worker("Ivan", 20);
        Employee fedor = new Manager("Fedor", 25);
        Employee misha = new Worker("Misha", 32);

        Company simaland = new Company("Sima-Land", 5);

        simaland.hire(sasha,20000);
        sasha.setSalary(20000);
        simaland.hire(anton,40000);
        anton.setSalary(40000);
//        simaland.hire(ivan,50000);
//        simaland.hire(fedor,25000);
//        simaland.hire(misha,15000);
        //simaland.fire(misha);
      //  simaland.fire(anton);
        simaland.printEmployees();
       // fedor.haveVacation();
    }
}

