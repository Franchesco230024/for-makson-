package lab9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;




public class WorkerManager {
    private ArrayList<Worker> workers;

    public WorkerManager() {
        workers = new ArrayList<>();
        initializeClients();
    }

    public void sortWorkersByName() {
        Collections.sort(workers, (w1, w2) -> w1.getName().compareTo(w2.getName()));
        System.out.println("Список работников отсортирован по имени.");
    }

    private void initializeClients() {
        workers.add(new Worker("Джон", 5, 2014));
        workers.add(new Worker("Ник", 11, 2017));
        workers.add(new Worker("Яна", 1, 2022));
        workers.add(new Worker("Алиса", 2, 2023));
        workers.add(new Worker("Ромео", 12, 2019));
        workers.add(new Worker("По", 5, 2024));
    }


    public void printWorkers() {
        System.out.println("Список всех работников:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }


    public List<Worker> writeList() {
        int currentYear = 2024;
        int currentMonth = 5;
        List<Worker> recentWorkersList = new ArrayList<>();

        for (Worker worker : workers) {
            int yearsWorked = currentYear - worker.getYear();
            int monthsWorked = currentMonth - worker.getMonth();

            if (monthsWorked < 0) {
                yearsWorked--;
                monthsWorked += 12;
            }

            if (yearsWorked < 5 || (yearsWorked == 4 && monthsWorked < 0)) {
                recentWorkersList.add(worker);
            }
        }

        return recentWorkersList;
    }

    public void addWorker(Scanner scanner) {
        System.out.println("Введите имя работника:");
        String name = scanner.next();
        System.out.println("Введите год начала работы:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц начала работы (1-12):");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Неверный месяц. Введите значение от 1 до 12.");
            return;
        }

        workers.add(new Worker(name, month, year));
        System.out.println("Работник успешно добавлен.");
    }

    public void removeWorker(Scanner scanner) {
        System.out.println("Список работников:");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i) + ", id: " + i);
        }

        System.out.print("Введите id работника для удаления: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < workers.size()) {
            workers.remove(number);
            System.out.println("Работник успешно удален.");
        } else {
            System.out.println("Неверный id.");
        }
    }

    public void searchWorkerByName(Scanner scanner) {
        System.out.print("Введите имя работника для поиска: ");
        String requiredPerson = scanner.next();
        boolean containsRequiredPerson = false;
        for (Worker worker : workers) {
            if (worker.getName().equals(requiredPerson)) {
                containsRequiredPerson = true;
                System.out.println("Работник найден:");
                System.out.println(worker);
            }
        }

        if (!containsRequiredPerson) {
            System.out.println("Работник не найден.");
        }
    }
}