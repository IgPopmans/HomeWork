package de.telran;

public class BMW extends Car {

    private final String fuelType;
    private float acceleration;
    public static final float DEFAULT_ACCELERATION = 0;

    public BMW(String name, String color, int price, boolean isNew, int horsePower, String fuelType, float acceleration) {
        super(name, color, price, isNew, horsePower);
        this.fuelType = fuelType;
        this.acceleration = acceleration;
    }

    public float doAcceleration(float acceleration) {
        if (acceleration == DEFAULT_ACCELERATION) {
            this.acceleration += acceleration;
        } else {
            System.out.println("Car is switched off");
        }
        return this.acceleration;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "fuelType='" + fuelType + '\'' +
                ", acceleration=" + acceleration +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + ": This car is out of stock ");
        super.showInfo();
    }
}

