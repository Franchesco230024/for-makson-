package lab5;
import java.util.Scanner;
class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time() {
        this(0, 0, 0);
    }


    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String CountTimeTillTheMidnight() {
        int totalSecondsTillMidnight = 86400 - (getHours() * 60 * 60 + getMinutes() * 60 + getSeconds());
        int hoursTillMidnight = totalSecondsTillMidnight / 3600;
        int minutesTillMidnight = (totalSecondsTillMidnight % 3600) / 60;
        int secondsTillMidnight = totalSecondsTillMidnight % 60;
        return String.format("%02d:%02d:%02d", hoursTillMidnight, minutesTillMidnight, secondsTillMidnight);
    }

    public String PlusOneHundredMinutes() {
        int secondsTotal = hours * 60 * 60 + minutes * 60 + seconds + 6000;
        hours = secondsTotal / 3600;
        minutes = (secondsTotal % 3600) / 60;
        seconds = secondsTotal % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        Time time = (Time) obj;
        return (this.hours == time.getHours() && this.minutes == time.getMinutes() && this.seconds == time.getSeconds());
    }


    public static Time[] fillInTime(Time[] arr, int amount, Scanner scanner) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите количество часов:");
            String hours = scanner.nextLine();
            System.out.println("Введите количество минут:");
            String minutes = scanner.nextLine();
            System.out.println("Введите количество секунд: ");
            String seconds = scanner.nextLine();

            if (minutes.isEmpty() && seconds.isEmpty() && hours.isEmpty()) {
                Time time = new Time();
                arr[i] = time;
                continue;
            }

            if (minutes.isEmpty()) {
                minutes = "0";
            }
            if (seconds.isEmpty()) {
                seconds = "0";
            }
            if (hours.isEmpty()) {
                hours = "0";
            }

            while (Integer.parseInt(minutes) >= 60 || Integer.parseInt(seconds) >= 60 || Integer.parseInt(hours) > 24) {
                System.out.println("Вы ввели неверное время");
                System.out.println("Введите верное количество часов:");
                hours = scanner.nextLine();
                System.out.println("Введите верное количество минут:");
                minutes = scanner.nextLine();
                System.out.println("Введите верное количество секунд: ");
                seconds = scanner.nextLine();
            }

            Time time = new Time(Integer.parseInt(hours), Integer.parseInt(minutes), Integer.parseInt(seconds));
            arr[i] = time;
        }
        return arr;
    }

    public static void printArrayWithTime(Time[] array) {
        for (Time time : array) {
            String timeString = "Время: " + String.format("%02d:%02d:%02d", time.getHours(), time.getMinutes(), time.getSeconds());
            System.out.println(timeString);
            System.out.println("---------------------------");
        }
    }

    public static void ChangeObject(Time time, Scanner scanner) {
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();

        System.out.print("Введите количество минут: ");
        int min = scanner.nextInt();

        System.out.print("Введите координату секунд: ");
        int sec = scanner.nextInt();

        time.setHours(hours);
        time.setMinutes(min);
        time.setSeconds(sec);
    }

    public static void FindEqual(Time[] time) {
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if (time[i].equals(time[j])) {
                    System.out.println("Элементы " + i + " и " + j + " равны.");
                } else {
                    System.out.println("Элементы " + i + " и " + j + " не равны.");
                    System.out.println("");
                }
            }
        }
    }


}
