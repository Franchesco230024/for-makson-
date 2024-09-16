package lab5;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество времен:");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Time[] array = new Time[amount];
        array = Time.fillInTime(array, amount, scanner);

        System.out.println("\nНапишите номер функции:\n" +
                "1: Вывести все объекты\n" +
                "2: Изменить объект\n" +
                "3: Осуществить две проверки элементов массива между собой на равенство\n" +
                "4: Рассчитать время до полуночи\n" +
                "5: + 100 минут к времени\n" +
                "0: Выйти из программы");

        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            switch (num) {
                case 1:
                    Time.printArrayWithTime(array);
                    break;

                case 2:
                    System.out.print("Введите номер объекта: ");

                    Time.ChangeObject(array[scanner.nextInt()], scanner);
                    break;

                case 3:
                    Time.FindEqual(array);
                    break;

                case 4:
                    System.out.print("Введите номер объекта: ");

                    System.out.println(array[scanner.nextInt()].CountTimeTillTheMidnight());
                    break;
                case 5:
                    System.out.print("Введите номер объекта: ");

                    System.out.println("Время добавлено.");

                    System.out.println(array[scanner.nextInt()].PlusOneHundredMinutes());
                    break;

                default:
                    System.out.println("Неверный номер функции!");
                    break;

            }
            System.out.print("Напишите номер функции: ");

        }
        scanner.close();
    }
}
