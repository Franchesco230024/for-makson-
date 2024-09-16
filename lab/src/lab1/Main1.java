package lab1;
import java.util.Scanner;

public class Main1{

    
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if((a>b & a>c & b>c) || (b>a & b>c & a>c) ){
            System.out.println("Сумма двух наибольших равна:" + (a + b));
        }
        else if ((b>a & b>c & c>a) ||(c>b & c>a & b>a)){
            System.out.println("Сумма двух наибольших равна:" + (b + c));
        }
        else if((a>b & a>c & c>b) ||(c>b & c>a & a>b)){
            System.out.println("Сумма двух наибольших равна:" + (a + c));
        }


    }
}
