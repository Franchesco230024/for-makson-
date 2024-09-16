package lab4;
import java.util.Arrays;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк массива: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.print("Заполните массив нулями и единицами: ");
        fillArray(array, scanner);

        printArray(array);

        int countG = findLongestSequenceHorizontal(array);
        System.out.println("Самая длинная цепочка подряд идущих нулей по горизонтали: " + countG);

        int countV = findLongestSequenceVertical(array);
        System.out.println("Самая длинная цепочка подряд идущих нулей по вертикали: " + countV);

        int countD = findDiagonalCount(array);
        System.out.println("Самая длинная цепочка подряд идущих нулей по диагонали: " + countD);


    }

    public static void fillArray(int[][] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findLongestSequenceHorizontal(int[][] array) {
        int countG = 0;
        int countCurrent = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    countCurrent++;
                } else {
                    if (countCurrent > countG) {
                        countG = countCurrent;
                    }
                    countCurrent = 0;
                }
            }
            if (countCurrent > countG) {
                countG = countCurrent;
            }
            countCurrent = 0;
        }
        return countG;
    }



    public static int findLongestSequenceVertical(int[][] array) {
        int countV = 0;
        int countCurrent = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 0) {
                    countCurrent++;
                } else {
                    if (countCurrent > countV) {
                        countV = countCurrent;
                    }
                    countCurrent = 0;
                }
            }
            if (countCurrent > countV) {
                countV = countCurrent;
            }
            countCurrent = 0;
        }
        return countV;
    }

    public static int findDiagonalCount(int[][] array) {
            int countD = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    int countCurrent = 0;
                    for (int k = 0; i + k < array.length && j + k < array[0].length; k++) {
                        if (array[i + k][j + k] == 0) {
                            countCurrent++;
                            if (countCurrent > countD) {
                                countD = countCurrent;
                            }
                        } else {
                            countCurrent = 0;
                        }
                    }

                    countCurrent = 0;

                    for (int k = 0; i + k < array.length && j - k >= 0; k++) {
                        if (array[i + k][j - k] == 0) {
                            countCurrent++;
                            if (countCurrent > countD) {
                                countD = countCurrent;
                            }
                        } else {
                            countCurrent = 0;
                        }
                    }
                }
            }

            return countD;
        }
}






