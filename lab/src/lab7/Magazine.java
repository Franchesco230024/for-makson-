package lab7;
import java.util.Scanner;
public class Magazine extends Publication {
    private int numberOfMagazine;
    private String theme;

    public int getNumberOfMagazine(){
        return numberOfMagazine;
    }

    public String getTheme(){
        return theme;
    }

    public void setNumberOfMagazine(int numberOfMagazine){
        this.numberOfMagazine = numberOfMagazine;
    }

    public void setTheme(String theme){
        this.theme = theme;
    }

    public Magazine(String name, int amountOfProduct, int priceForOneItem, String typeOfCover, int numberOfMagazine, String subjectOfBook) {
        super(name, amountOfProduct, priceForOneItem,typeOfCover);
        this.numberOfMagazine= numberOfMagazine;
        this.theme= subjectOfBook;
    }
    @Override
    public void displayInfo() {
        System.out.println("Информация о учебнике:");
        System.out.println(this);
        System.out.printf("Номер выпуска: %d, Тема журнала: %s\n", numberOfMagazine, theme);

    }

    public static Magazine setMagazine(Scanner scanner) {
        Magazine obj = new Magazine("", 0, 0, "", 0, "");

        obj.set(scanner);

        System.out.print("Введите номер выпуска: ");
        obj.numberOfMagazine= scanner.nextInt();

        System.out.print("Введите тему журнала: ");
        obj.theme= scanner.next();

        return obj;

    }

}