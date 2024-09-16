
package lab2;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Все двузначные числа, которые равны удвоенному произведению своих цифр:");
        for (int i = 10; i < 100; i++) {
            if (i == 2 * (i / 10) * (i % 10)) {
                System.out.println(i);
            }


        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            } else {
                System.out.println("NOT THIS NUMBER ");


            }
        }
    }
}
