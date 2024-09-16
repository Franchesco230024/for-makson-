package lab7;
import java.util.Scanner;
public class Book extends Publication {
    private int dateOfPublication;
    private String genre;

    public int getDateOfPublication(){
        return dateOfPublication;
    }

    public String getGenre(){
        return genre;
    }

    public void setDateOfPublication(int numberOfForm){
        this.dateOfPublication= numberOfForm;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public Book(String name, int amountOfProduct, int priceForOneItem, String typeOfCover, int dateOfPublication, String genre) {
        super(name, amountOfProduct, priceForOneItem,typeOfCover);
        this.dateOfPublication = dateOfPublication;
        this.genre = genre;
    }
    @Override
    public void displayInfo() {
        System.out.println("Информация о учебнике:");
        System.out.println(this);
        System.out.printf("Год публикации: %d, Жанр: %s\n", dateOfPublication, genre);

    }

    public static Book setBook(Scanner scanner) {
        Book obj = new Book("", 0, 0, "", 0, "");

        obj.set(scanner);

        System.out.print("Введите год выхода книги: ");
        obj.dateOfPublication= scanner.nextInt();

        System.out.print("Введите жанр книги: ");
        obj.genre = scanner.next();

        return obj;

    }

}