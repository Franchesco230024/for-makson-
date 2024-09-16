package lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        File file = new File("books.dat");


        createFileIfNotExists(file);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. Выход\n" +
                            "1. Первоначальное добавление книг в файл\n" +
                            "2. Показать все книги\n" +
                            "3. Добавить книгу\n" +
                            "4. Показать количество и общую стоимость книг о программировании на языке Java"
            );
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0)
                break;

            switch (choice) {
                case 1:
                    writeObjectsToFile(createFillArray(), file, false);
                    break;
                case 2:
                    showAllBooks(file);
                    break;
                case 3:
                    Book book = Book.set(scanner);
                    writeObjectsToFile(List.of(book), file, true);
                    break;
                case 4:
                    showJavaProgrammingBooksInfo(file);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    private static void createFileIfNotExists(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }
    }

    private static void writeObjectsToFile(List<Book> books, File file, boolean append) {
        try (FileOutputStream fos = new FileOutputStream(file, append);
             ObjectOutputStream oos = append && file.length() > 0
                     ? new AppendableObjectOutputStream(fos) : new ObjectOutputStream(fos)) {

            for (Book book : books) {
                oos.writeObject(book);
            }
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showAllBooks(File file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Book book = (Book) inputStream.readObject();
                System.out.println(book);
            }
        } catch (EOFException e) {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void showJavaProgrammingBooksInfo(File file) {
        int totalCopies = 0;
        double totalCost = 0.0;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Book book = (Book) inputStream.readObject();
                    if (book.getTitle().toLowerCase().contains("java")) {
                        totalCopies += book.getCopies();
                        totalCost += book.getCopies() * book.getCost();
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Количество книг о программировании на языке Java: " + totalCopies);
        System.out.println("Общая стоимость книг о программировании на языке Java: " + totalCost);
    }

    public static List<Book> createFillArray() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Author1", "Java Programming Basics", 1000, 29.99));
        books.add(new Book("Author2", "Advanced Java Programming", 500, 49.99));
        books.add(new Book("Author3", "Python Programming", 700, 39.99));
        books.add(new Book("Author4", "C++ Programming", 300, 34.99));
        books.add(new Book("Author5", "Java Design Patterns", 400, 59.99));

        return books;
    }
}
