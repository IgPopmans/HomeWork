package de.telran;

public class CarsForSale {

    public static void main(String[] args) {

        Car[] cars = new Car[5];

        cars[0] = new Car("BMW", "White", 15000, true, 230);
        cars[1] = new Car("Toyota", "Black", 18000, true, 150);
        cars[2] = new Car("Mercedes-Benz", "Green", 27000, false, 450);
        cars[3] = new Car("Audi", "Pink", 7000, false, 100);
        cars[4] = new Car("Suzuki", "Grey", 20000, true, 145);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}