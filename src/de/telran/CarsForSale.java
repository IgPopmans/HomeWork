package de.telran;


public class CarsForSale {

    public static void main(String[] args) {


        Car car1 = new Car("Mazda", "Black", 200); // clone constructor
        Car car2 = new Car(car1);
        Car car3 = new Car(car2);

        Car [] bestCars = {car1,car2,car3};

        printCars(bestCars);

        System.out.println("================================");


        Car[] cars = new Car[5];

        cars[0] = new Car("BMW", "White", 15000, true, 230);
        cars[1] = new Car("Toyota", "Black", 18000, true, 150);
        cars[2] = new Car("Mercedes-Benz", "Green", 27000, false, 450);
        cars[3] = new Car("Audi", "Pink", 7000, false, 100);
        cars[4] = new Car("Suzuki", "Grey", 20000, true, 145);

        printCars(cars);
    }

    public static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println("Car name : " + car.getName() + " , color = " + car.getColor() + " , price = " + car.getPrice() + " , status = " + car.isNew() + ", horsepower = " + car.getHorsePower());
        }
    }
}
