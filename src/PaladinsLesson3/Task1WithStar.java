package PaladinsLesson3;

import java.util.Scanner;

public class Task1WithStar {
    public static void main(String[] args) {
        String[] monthsOfYear = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Явгуст", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String month;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название месяца");
        month = scan.nextLine();

        if (month.equalsIgnoreCase(monthsOfYear[0]) || month.equalsIgnoreCase(monthsOfYear[1]) || month.equalsIgnoreCase(monthsOfYear[11])) {
            System.out.println("Зима");
        } else if (month.equalsIgnoreCase(monthsOfYear[2]) || month.equalsIgnoreCase(monthsOfYear[3]) || month.equalsIgnoreCase(monthsOfYear[4])) {
            System.out.println("Весна");
        } else if (month.equalsIgnoreCase(monthsOfYear[5]) || month.equalsIgnoreCase(monthsOfYear[6]) || month.equalsIgnoreCase(monthsOfYear[7])) {
            System.out.println("Лето");
        } else if (month.equalsIgnoreCase(monthsOfYear[8]) || month.equalsIgnoreCase(monthsOfYear[9]) || month.equalsIgnoreCase(monthsOfYear[10])) {
            System.out.println("Осень");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}

