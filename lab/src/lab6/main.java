package lab6;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hunter hunter = Hunter.set(scanner);



        while (true) {
            System.out.println(
                    " Выберите функцию:\n" +
                            "1. Просмотр информации о животном\n" +
                            "2. Рычать \n" +
                            "3. Бежать\n" +
                            "4. Спать \n" +
                            "5. Добывать пищу\n" +
                            "6. Поесть \n" +
                            "7. Изменить инфо о животном \n" +
                            "0. Завершить программу\n" +
                            ": "
            );
            int choice = scanner.nextInt();

            if (choice == 0)
                break;

            switch (choice) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    Hunter.showInfoAboutPredator(hunter);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    if(hunter.getEnergy() < 1 && hunter.getFood()){
                        System.out.println(hunter.getName() + " устал. Покушай или поспи что-бы погавкать!");
                        System.out.println("-----------------------------------------------------------");
                    } else if (hunter.getEnergy() < 1 && !hunter.getFood()) {
                        System.out.println(hunter.getName() + " устал. Поспи что-бы погавкать!");
                        System.out.println("-----------------------------------------------------------");
                    }
                    else {
                        System.out.println("-----------------------------------------------------------");
                        Hunter.bark(hunter);
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    if(hunter.getEnergy() < 2 && hunter.getFood()){
                        System.out.println(hunter.getName() + " устал. Покушай или поспи что-бы бежать!");
                        System.out.println("-----------------------------------------------------------");
                    } else if (hunter.getEnergy() < 2 && !hunter.getFood()) {
                        System.out.println(hunter.getName() + " устал. Поспи что-бы бежать!");
                        System.out.println("-----------------------------------------------------------");
                    }
                    else {
                        Hunter.run(hunter);
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    Hunter.sleep(hunter);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------");
                    if(hunter.getEnergy() < 4 && hunter.getFood()){
                        System.out.println(hunter.getName() + " устал. Покушай или поспи что-бы выйти на охоту!");
                        System.out.println("-----------------------------------------------------------");
                    } else if (hunter.getEnergy() < 4 && !hunter.getFood()) {
                        System.out.println(hunter.getName() + " устал. Поспи что-бы охоту!");
                        System.out.println("-----------------------------------------------------------");
                    }
                    else {
                        Hunter.hunting(hunter);
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------");
                    Hunter.eat(hunter);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------------");
                    Hunter.changeInfoAboutHunter(hunter,scanner);
                    System.out.println("-----------------------------------------------------------");

            }
        }
        scanner.close();



        }
}
