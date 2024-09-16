package lab6;
import java.util.Scanner;
public class Teeth {
    private int amount;

    private String shape;

    public Teeth(int amount, String shape) {
        this.amount = amount;

        this.shape = shape;
    }

    public Teeth() {
        this(0, "");
    };

    public int getAmount() {
        return amount;
    }

    public String getShape() {
        return shape;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public static Teeth set(Scanner scanner){
        Teeth object = new Teeth();

        System.out.print("Введите количество зубов: ");
        object.setAmount(scanner.nextInt());

        System.out.print("Введите форму зубов: ");
        object.setShape(scanner.next());

        return object;


    }



}
