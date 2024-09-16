package lab7;
import java.util.Scanner;
public class Pupils_Book extends Publication {
    private int numberOfForm;
    private String subjectOfBook;

    public int getNumberOfForm(){
        return numberOfForm;
    }

    public String getSubjectOfBook(){
        return subjectOfBook;
    }

    public void setNumberOfForm(int numberOfForm){
        this.numberOfForm = numberOfForm;
    }

    public void setSubjectOfBook(String subjectOfBook){
        this.subjectOfBook = subjectOfBook;
    }

    public Pupils_Book(String name, int amountOfProduct, int priceForOneItem, String typeOfCover, int numberOfForm, String subjectOfBook) {
        super(name, amountOfProduct, priceForOneItem,typeOfCover);
        this.numberOfForm = numberOfForm;
        this.subjectOfBook = subjectOfBook;
    }
    @Override
    public void displayInfo() {
        System.out.println("Информация о учебнике:");
        System.out.println(this);
        System.out.printf("Номер класса: %d, Предмет: %s\n", numberOfForm, subjectOfBook);

    }

    public static Pupils_Book setChild(Scanner scanner) {
        Pupils_Book obj = new Pupils_Book("", 0, 0, "", 0, "");

        obj.set(scanner);

        System.out.print("Введите для каких классов учебник: ");
        obj.numberOfForm= scanner.nextInt();

        System.out.print("Введите дисциплину: ");
        obj.subjectOfBook = scanner.next();

        return obj;

    }

}