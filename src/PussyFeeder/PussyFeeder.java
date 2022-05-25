package PussyFeeder;

import java.util.Arrays;
import java.util.Scanner;

public class PussyFeeder {
    static Scanner scan = new Scanner(System.in);
    static String cats[] = {"персик", "барсик", "мурзик", "пупсик", "фуксик"};
    static int bowls[] = {1, 1, 1, 1, 1};
    static int userInput;

    public static void main(String[] args) {
        do {
            printBowls();
            printMenu();
            System.out.println("\nВыберите действие");
            userInput = inputWithValidation();
            switch (userInput) {
                case 1:
                    addOrDeleteFoodAtThisCat();
                    break;
                case 2:
                    addOrDeleteFoodAtAllCats();
                    break;
                case 3:
                    addOrDeleteFoodAtEvenOrOddCats();
                    break;
                case 666:
                    System.out.println("Вы вышли из программы");
                    break;
                default:
                    System.out.println("Выберите доступный номер команды меню");
            }
        } while (userInput != 666);
    }

    public static int inputWithValidation() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Это не целое число, повторите ввод");
            scan.next();
        }
        return scan.nextInt();
    }

    public static void printMenu() {
        System.out.printf("Доступные функции программы:%n1 - Добавить/убавить еды у выбранного кота%n2 - Добавить/убавить еды у всех котов%n3 - Добавить/убавить еду у четных/нечетных котов%n666 - Выход из программы");
    }

    public static void printBowls() {
        for (int i = 0; i < bowls.length; i++) {
            if (bowls[i] > 1 && bowls[i] < 5) {
                System.out.println("№" + (i + 1) + " - " + cats[i].substring(0, 1).toUpperCase() + cats[i].substring(1) + " : " + bowls[i] + " пакетика в миске");
            } else if (bowls[i] == 1) {
                System.out.println("№" + (i + 1) + " - " + cats[i].substring(0, 1).toUpperCase() + cats[i].substring(1) + " : " + bowls[i] + " пакетик в миске");
            } else {
                System.out.println("№" + (i + 1) + " - " + cats[i].substring(0, 1).toUpperCase() + cats[i].substring(1) + " : " + bowls[i] + " пакетиков в миске");
            }
        }
    }

    public static void addOrDeleteFoodAtThisCat() {
        System.out.println("Введите имя кота");
        String nameOfCat = scan.nextLine();
        int numberOfBowl = Arrays.asList(cats).indexOf(nameOfCat.toLowerCase());
        System.out.println("Введите действие: 1 - добавить; 2 - отнять");
        int operation = inputWithValidation();
        System.out.println("Введите количество пакетиков");
        int amountOfFood = inputWithValidation();
        if (operation == 1) {
            bowls[numberOfBowl] = bowls[numberOfBowl] + amountOfFood;
        } else if (operation == 2) {
            bowls[numberOfBowl] = bowls[numberOfBowl] - amountOfFood;
        } else {
            System.out.println("Неверная команда");
        }
        if (bowls[numberOfBowl] > 7) {
            bowls[numberOfBowl] = 7;
        }
        if (bowls[numberOfBowl] < 0) {
            bowls[numberOfBowl] = 0;
        }
    }

    public static void addOrDeleteFoodAtAllCats() {
        System.out.println("Введите действие: 1 - добавить; 2 - отнять");
        int operation = inputWithValidation();
        System.out.println("Введите количество пакетиков");
        int amountOfFood = inputWithValidation();
        if (operation == 1) {
            for (int i = 0; i < bowls.length; i++) {
                bowls[i] = bowls[i] + amountOfFood;
                if (bowls[i] > 7) {
                    bowls[i] = 7;
                }
            }
        } else if (operation == 2) {
            for (int i = 0; i < bowls.length; i++) {
                bowls[i] = bowls[i] - amountOfFood;
                if (bowls[i] < 0) {
                    bowls[i] = 0;
                }
            }
        } else {
            System.out.println("Неверная команда");
        }
    }

    public static void addOrDeleteFoodAtEvenOrOddCats() {
        System.out.println("Введите порядок котов: 1 - четные; 2 - нечетные");
        int order = inputWithValidation();
        System.out.println("Введите действие: 1 - добавить; 2 - отнять");
        int operation = inputWithValidation();
        System.out.println("Введите количество пакетиков");
        int amountOfFood = inputWithValidation();
        if (order == 1) {
            if (operation == 1) {
                for (int i = 0; i < bowls.length; i++) {
                    if ((i + 1) % 2 == 0) {
                        bowls[i] = bowls[i] + amountOfFood;
                    }
                    if (bowls[i] > 7) {
                        bowls[i] = 7;
                    }
                }
            } else if (operation == 2) {
                for (int i = 0; i < bowls.length; i++) {
                    if ((i + 1) % 2 == 0) {
                        bowls[i] = bowls[i] - amountOfFood;
                    }
                    if (bowls[i] < 0) {
                        bowls[i] = 0;
                    }
                }
            } else {
                System.out.println("Неверная команда");
            }
        } else if (order == 2) {
            if (operation == 1) {
                for (int i = 0; i < bowls.length; i++) {
                    if ((i + 1) % 2 != 0) {
                        bowls[i] = bowls[i] + amountOfFood;
                    }
                    if (bowls[i] > 7) {
                        bowls[i] = 7;
                    }
                }
            } else if (operation == 2) {
                for (int i = 0; i < bowls.length; i++) {
                    if ((i + 1) % 2 != 0) {
                        bowls[i] = bowls[i] - amountOfFood;
                    }
                    if (bowls[i] < 0) {
                        bowls[i] = 0;
                    }
                }
            } else {
                System.out.println("Неверная команда");
            }

        } else {
            System.out.println("Неверная команда");
        }
    }
}
