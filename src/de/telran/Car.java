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

    public Car(String name, String color, int horsePower) {
        this.name = name;
        this.color = color;
        this.horsePower = horsePower;
    }

    public Car(Car car) {
        this.name = car.name;
        this.color = car.color;
        this.horsePower = car.horsePower;
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
        if (name.isEmpty()) {
            this.name = "old car";
        } else
            this.name = name;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            this.color = "some color";
        } else
            this.color = color;
    }

    public void setPrice(int price) {
        if (price < 0) {
            this.price = 20000;
        } else
            this.price = price;
    }

    public void setNew(boolean aNew) {
        if (!aNew) {
            isNew = false;
        }
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            this.horsePower = 100;
        } else
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

