package lab7;




import java.util.Scanner;

public abstract class Publication {
    private String name;
    private int amountOfProduct;
    private int priceForOneItem;
    private String typeOfCover;


    public Publication(String name, int amountOfProduct, int priceForOneItem, String typeOfCover){
        this.name = name;
        this.amountOfProduct = amountOfProduct;
        this.priceForOneItem = priceForOneItem;
        this.typeOfCover = typeOfCover;
    }
    public abstract void displayInfo();

    public String toString(){
        String string = "";
        string += "Название продукта: " + name +
                ". Количество продукции: " + amountOfProduct +
                ". Цена за товар: " + priceForOneItem +
                ". Тип обложки " + typeOfCover;
        return string;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public int getPriceForOneItem() {
        return priceForOneItem;
    }

    public void setPriceForOneItem(int priceForOneItem) {
        this.priceForOneItem = priceForOneItem;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public void set(Scanner scanner) {

        System.out.println("Введите название продукта:");
        this.name = scanner.next();

        System.out.println("Введите количество товара в шт.:");
        this.amountOfProduct = scanner.nextInt();

        System.out.println("Введите цену за штуку.:");
        this.priceForOneItem = scanner.nextInt();

        System.out.println("Тип обложки:");
        this.typeOfCover = scanner.next();

    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Publication)) {
            return false;
        }
        Publication product = (Publication) obj;
        return this.priceForOneItem == product.getPriceForOneItem();
    }

}
