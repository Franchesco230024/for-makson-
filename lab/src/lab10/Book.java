package lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements Serializable {
    private String author;
    private String title;
    private int copies;
    private double cost;

    public Book(String author, String title, int copies, double cost) {
        this.author = author;
        this.title = title;
        this.copies = copies;
        this.cost = cost;
    }

    public static Book set(Scanner scanner) {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите количество тиража: ");
        int copies = scanner.nextInt();

        System.out.print("Введите стоимость книги: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        return new Book(author, title, copies, cost);
    }

    @Override
    public String toString() {
        return "Автор: " + author +
                "\nНазвание книги: " + title +
                "\nКоличество тиража: " + copies +
                "\nСтоимость: " + cost + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public double getCost() {
        return cost;
    }
}
