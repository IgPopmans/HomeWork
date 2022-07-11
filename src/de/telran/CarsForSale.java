package de.telran;


import java.util.Arrays;

public class CarsForSale {

    public static void main(String[] args) {

        Car bmw = new BMW("BMW-X1", "Black", 20000, true, 250, "Petrol", 12.4f);
        Car audi = new Audi("Audi A6", "White", 23000, false, 200, 270, 4, 230);
        Car opel = new Opel("Opel corsa", "Grey", 23000, false, 127, 4, 8.7, 2017);


        Car[] bestCar = {bmw, audi, opel};
        for (Car car : bestCar) {
            System.out.println(car);
        }
    }


    public static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println("Car name : " + car.getName() + " , color = " + car.getColor() + " , price = " + car.getPrice() + " , status = " + car.isNew() + ", horsepower = " + car.getHorsePower()) ;

        }
    }
}

