package de.telran;

public class Car {
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

    public  int getPrice(int price) {
        return price + this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
}
