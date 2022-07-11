package de.telran;

public class Audi extends Car {

     private int maxSpeed;
     private int wheels;
     private int fuel;

    public Audi(String name, String color, int price, boolean isNew, int horsePower, int maxSpeed, int wheels, int fuel) {
        super(name, color, price, isNew, horsePower);
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public int fuelUsage(int fuel) {
        if (this.fuel > fuel) {
            this.fuel -= fuel;
        }
        return this.fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "maxSpeed=" + maxSpeed +
                ", wheels=" + wheels +
                ", fuel=" + fuel +
                '}';
    }

    public void start() {
        System.out.println(getName() + " : Switched on");
    }

}
