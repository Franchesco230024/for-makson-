package lab3;
import java.util.Arrays;
import java.util.Scanner;


public class Main1{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                array[i] = 3;
                if (i > 0) {
                    array[i - 1] = 3;
                }
                if((i != size -1) && array[i+1] == 0){
                    continue;
                }
                if (i < size - 1) {
                    array[i + 1] = 3;

                }
            }
        }

        System.out.println("полученный массив массив:");
        System.out.println(Arrays.toString(array));
    }
}

