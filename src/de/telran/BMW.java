package de.telran;

public class BMW extends Car {

    private final String fuelType;
    private float acceleration;

    public BMW(String name, String color, int price, boolean isNew, int horsePower, String fuelType, float acceleration) {
        super(name, color, price, isNew, horsePower);
        this.fuelType = fuelType;
        this.acceleration = acceleration;
    }

    public float getAcceleration(float acceleration) {
        return this.acceleration += acceleration;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "fuelType='" + fuelType + '\'' +
                ", acceleration=" + acceleration +
                '}';
    }
}

