package lab7;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Publication[] products = new Publication[3];

        System.out.println("Создайте учебник");
        Pupils_Book pupilsBook = Pupils_Book.setChild(scanner);
        products[0] = pupilsBook;
        System.out.println("Учебник добавлен\n");

        System.out.println("Создайте книгу");
        Book book = Book.setBook(scanner);
        products[1] = book;
        System.out.println("Книга добавлена\n");
        System.out.println("--------------------------------------------");

        System.out.println("Создайте журнал");
        Magazine magazine = Magazine.setMagazine(scanner);
        products[2] = magazine;
        System.out.println("Журнал добавлен\n");
        System.out.println("--------------------------------------------");

        int choice = -1;
        while (choice != 0) {
            System.out.println("\nНапишите номер функции:\n" +
                    "1: Вывести продукт\n" +
                    "2: Изменить объект\n" +
                    "3: Осуществить  проверку элементов массива между собой на равенство цены \n" +
                    "0: Выйти из программы");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите индекс продукта (0-2):");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < products.length) {
                        Publication product = products[index];
                        product.displayInfo();
                    } else {
                        System.out.println("Некорректный индекс продукта.");
                    }
                    break;
                case 2:
                    System.out.println("Введите индекс объекта для изменения (0-2):");
                    int objIndex = scanner.nextInt();

                    if (objIndex >= 0 && objIndex < products.length) {
                        Publication product = products[objIndex];
                        System.out.println("Введите новое название объекта:");
                        String newName = scanner.next();
                        product.setName(newName);
                        System.out.println("Объект успешно изменен:\n");
                    } else {
                        System.out.println("Некорректный индекс объекта.");
                    }
                    break;
                case 3:
                    System.out.println("Введите индексы двух элементов массива для сравнения (0-2):");
                    int index1 = scanner.nextInt();
                    int index2 = scanner.nextInt();

                    if (index1 >= 0 && index1 < products.length && index2 >= 0 && index2 < products.length) {
                        Publication product1 = products[index1];
                        Publication product2 = products[index2];

                        if (product1.equals(product2)) {
                            System.out.println("У данных продуктов одинаковая цена");
                        } else {
                            System.out.println("У данных продуктов разная цена.");
                        }
                    } else {
                        System.out.println("Некорректные индексы элементов массива.");
                    }
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор функции.");
                    break;
            }
        }
    }
}