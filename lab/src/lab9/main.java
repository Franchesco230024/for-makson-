package lab9;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        WorkerManager workerManager = new WorkerManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "\nВыберите пункт меню:\n" +
                            "0. Выход\n" +
                            "1. Вывести всех работников на экран\n" +
                            "2. Добавить работника в список\n" +
                            "3. Удалить работника из списка\n" +
                            "4. Найти работника по имени\n" +
                            "5. Отсортировать список работников по имени\n" +
                            "6. Записать в стек работников, работающих менее 5 лет."
            );
            int choice = scanner.nextInt();
            if (choice == 0) {
                scanner.close();
                break;
            }

            switch (choice) {
                case 1:
                    workerManager.printWorkers();
                    break;
                case 2:
                    workerManager.addWorker(scanner);
                    break;
                case 3:
                    workerManager.removeWorker(scanner);
                    break;
                case 4:
                    workerManager.searchWorkerByName(scanner);
                    break;
                case 5:
                    workerManager.sortWorkersByName();
                    workerManager.printWorkers();

                    break;
                case 6:
                    List<Worker> recentWorkersList = workerManager.writeList();
                    System.out.println("Работники, работающие менее 5 лет:");
                    for (Worker worker : recentWorkersList) {
                        System.out.println(worker.getName() + " работает менее 5 лет.");
                    }
                    break;
                default:
                    System.out.println("Выбран неправильный пункт меню, повторите ввод.");
            }
        }
    }
}
