package de.telran;

public class Car {

    private final static int DEFAULT_PRICE = 100;
    private final static int DEFAULT_HORSE_POWER = 235;
    private final static String DEFAULT_NAME = "FutureCar";
    private final static String DEFAULT_COLOR = "White";

    private String name;
    private String color;
    private int price;
    private boolean isNew;
    private int horsePower;

    public Car(String name, String color, int price, boolean isNew, int horsePower) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isNew = isNew;
        this.horsePower = horsePower;
    }

    public Car(String name, String color, int horsePower) {
        this.name = name;
        this.color = color;
        this.horsePower = horsePower;
    }

    public Car(Car car) {
        this.name = car.name;
        this.color = car.color;
        this.horsePower = car.horsePower;
        this.price = car.price;
        this.isNew = car.isNew;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setName(String name) {
        this.name = (name == null) ? DEFAULT_NAME : name;
    }

    public void setColor(String color) {
        this.color = (color == null) ? DEFAULT_COLOR : color;
    }

    public void setPrice(int price) {
        this.price = (price < 0) ? DEFAULT_PRICE : price;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = (horsePower < 0) ? DEFAULT_HORSE_POWER : horsePower;

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                ", horsePower=" + horsePower +
                '}';
    }

    public void showInfo() {
        System.out.println("This is the best car for sale : " + name);
    }
}

