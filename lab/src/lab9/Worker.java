package lab9;

public class Worker {
    String name;
    int month;
    int year;

    public Worker(String name, int month, int year) {
        this.name = name;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Имя работника: " + name + ". Дата поступления на работу: " + month + "." + year ;
    }

}
