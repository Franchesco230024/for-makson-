
package lab1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Введите значение x:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double a = 0.5;
        double b = 4.5;
        double z = Math.exp(a * x);



        System.out.println("Значение функции при следующих параметрах: a = 0.5, b = 4.5, e^ax: ");
        if (x <= 5 * a) {
            double y = 2.5 * Math.pow(b, 2) + a * x - 4.5 * Math.cos(x) * z;
            System.out.println("Т.к x <= 5a, ф-я равна: " + y);
        } else if (x > b) {
            double y = Math.pow((Math.pow(a, 2) - 5.4 * x), 3) + Math.log10(x * z);
            System.out.println("Т.к x > b, ф-я равна: " + y);
        } else if (x > 5 * a & b >= x) {
            double y = Math.sqrt(6.5 * Math.pow(b, 2) + (a - Math.pow(x, 3)) * z);
            System.out.println("Т.к 5a < x <= b, ф-я равна: " + y);
        }

        b = 3.7;
        z = Math.exp(2 * a * x);

        System.out.println("Значение функции при следующих параметрах: a = 0.5, b = 3.7, e^2ax: ");
        if (x <= 5 * a) {
            double y = 2.5 * Math.pow(b, 2) + a * x - 4.5 * Math.cos(x) * z;
            System.out.println("Т.к x <= 5a, ф-я равна: " + y);
        } else if (x > b) {
            double y = Math.pow((Math.pow(a, 2) - 5.4 * x), 3) + Math.log10(x * z);
            System.out.println("Т.к x > b, ф-я равна: " + y);
        } else if (x > 5 * a & b >= x) {
            double y = Math.sqrt(6.5 * Math.pow(b, 2) + (a - Math.pow(x, 3)) * z);
            System.out.println("Т.к 5a < x <= b, ф-я равна: " + y);
        }


        b = 2.7;
        z = Math.exp(2.5 * a * x);

        System.out.println("Значение функции при следующих параметрах: a = 0.5, b = 2.7, e^2ax: ");
        if (x <= 5 * a) {
            double y = 2.5 * Math.pow(b, 2) + a * x - 4.5 * Math.cos(x) * z;
            System.out.println("Т.к x <= 5a, ф-я равна: " + y);
        } else if (x > b) {
            double y = Math.pow((Math.pow(a, 2) - 5.4 * x), 3) + Math.log10(x * z);
            System.out.println("Т.к x > b, ф-я равна: " + y);
        } else if (x > 5 * a & b >= x) {
            double y = Math.sqrt(6.5 * Math.pow(b, 2) + (a - Math.pow(x, 3)) * z);
            System.out.println("Т.к 5a < x <= b, ф-я равна: " + y);
        }



    }
}
