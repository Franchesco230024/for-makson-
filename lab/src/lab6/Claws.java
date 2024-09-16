package lab6;

import java.util.Scanner;

public class Claws {
    private int sharpness;
    private int length;

    public Claws(int sharpness, int length) {
        this.sharpness = sharpness;
        this.length = length;
    }

    public Claws() {
        this(0, 0);
    }

    public int getSharpness() {
        return sharpness;
    }

    public int getLength() {
        return length;
    }

    public void setSharpness(int sharpness) {
        if (sharpness >= 0 && sharpness <= 10) {
            this.sharpness = sharpness;
        } else {
            System.out.println("Неверный ввод, острота когтей должна быть от 0 до 10.");
            this.sharpness = 0;
        }
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static Claws set(Scanner scanner) {
        Claws object = new Claws();

        System.out.print("Введите длину когтей в см.: ");
        object.setLength(scanner.nextInt());

        System.out.print("Введите остроту когтей от 0-10: ");
        object.setSharpness(scanner.nextInt());

        return object;
    }
}