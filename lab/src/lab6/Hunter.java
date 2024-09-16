package lab6;

import java.util.Scanner;

public class Hunter {

    private String name;
    private Claws claws;
    private Teeth teeth;
    private  boolean food;

    private int energy;

    public Hunter(String name, Claws claws, Teeth teeth, int energy, boolean food) {
        this.name = name;
        this.claws = claws;
        this.teeth = teeth;
        this.energy = energy;
        this.food = food;
    }

    public Hunter() {
        this("", null, null,5,false);
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEnergy(int energy) {
        if (energy >= 0 && energy <= 10) {
            this.energy= energy;
        } else if (energy < 0) {
            this.energy = 0;

        } else{
            this.energy= 10;
        }
    }
    public int getEnergy() {
        return energy;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
    public boolean getFood() {
        return food;
    }


    public String toString() {
        String string = "";
        string += "Название животного: " + getName() +
                ". Количество энергии животного от 0-10: " + getEnergy() +
                ". Длина когтей в см.: " + claws.getLength() +
                ". Острота когтей от 0-10 : " + claws.getSharpness() +
                ". Количество зубов:" + teeth.getAmount() +
                ". Форма зубов:" + teeth.getShape()+
                ". Надичие еды:" + getFood();
        return string;
    }

    public static Hunter set(Scanner scanner) {

        Hunter object = new Hunter("", new Claws(0, 0), new Teeth(0, ""),0,false);
        System.out.println("Введите название животного:");
        object.setName(scanner.next());

        System.out.println("Введите количество энергии от 0-10 :");

        object.setEnergy(scanner.nextInt());

        object.teeth = Teeth.set(scanner);

        object.claws = Claws.set(scanner);

        System.out.println("Наличие еды(1-да)(2-нет):");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                object.setFood(true);
                break;
            case 2:
                object.setFood(false);
                break;
        }


        return object;
    }
    public static void showInfoAboutPredator(Hunter hunter) {
        System.out.println(hunter);

    }

    public static void bark(Hunter hunter){
        System.out.println(hunter.getName() + " гавкает!");

        hunter.setEnergy(hunter.getEnergy()-1);


    }

    public static void run(Hunter hunter){
        System.out.println(hunter.getName() + " бежит!");

        hunter.setEnergy(hunter.getEnergy()-2);


    }

    public static void sleep(Hunter hunter){
        System.out.println(hunter.getName() + " спит!");

        hunter.setEnergy(hunter.getEnergy()+5);


    }

    public static void hunting(Hunter hunter){
        System.out.println(hunter.getName() + " на охоте!");

        hunter.setEnergy(hunter.getEnergy()-4);

        hunter.setFood(true);


    }
    public static void eat(Hunter hunter){
        if (hunter.getFood()){
        System.out.println(hunter.getName() + " кушает!");

        hunter.setEnergy(hunter.getEnergy()+3);

        hunter.setFood(false);}
        else{
            System.out.println(hunter.getName() + " нечего покушать!");
        }



    }

    public static void changeInfoAboutHunter(Hunter hunter , Scanner scanner){
        System.out.println("Выберите, какую информацию вы хотите изменить:\n"+
                           "1. Название животного\n"+
                           "2. Количество энергии\n"+
                           "3. Длина когтей\n"+
                           "4. Острота когтей\n"+
                           "5. Количество зубов\n"+
                           "6. Форма зубов\n"+
                           "7. Наличие еды\n"
        );
        int choice= scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите новое название животного:");
                hunter.setName(scanner.next());
                break;
            case 2:
                System.out.println("Введите новое количество энергии:");
                hunter.setEnergy(scanner.nextInt());
                break;
            case 3:
                System.out.println("Введите новую длину когтей:");
                hunter.claws.setLength(scanner.nextInt());
                break;
            case 4:
                System.out.println("Введите новую остроту когтей:");
                hunter.claws.setSharpness(scanner.nextInt());
                break;
            case 5:
                System.out.println("Введите новое количество зубов:");
                hunter.teeth.setAmount(scanner.nextInt());
                break;
            case 6:
                System.out.println("Введите новую форму зубов:");
                hunter.teeth.setShape(scanner.next());
                break;
            case 7:
                System.out.println("Введите наличие еды (1-да, 2-нет):");
                System.out.println("Наличие еды(1-да)(2-нет):");
                int hasFood = scanner.nextInt();
                switch (hasFood){
                    case 1:
                        hunter.setFood(true);
                        break;
                    case 2:
                        hunter.setFood(false);
                        break;
                }
                break;


        }

    }



}









