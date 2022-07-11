package de.telran;

public class Opel extends Car {

    private static final int DEFAULT_SEATS_COUNT = 4;
    private int seatsCount;
    private final double fuelAverage;
    private final int dateOfProduction;

    public Opel(String name, String color, int price, boolean isNew, int horsePower, int seatsCount, double fuelAverage, int dateOfProduction) {
        super(name, color, price, isNew, horsePower);
        this.seatsCount = seatsCount;
        this.fuelAverage = fuelAverage;
        this.dateOfProduction = dateOfProduction;
    }

    public void changeSeatsCount(int seatsCount) {
        if (seatsCount == DEFAULT_SEATS_COUNT) {
            this.seatsCount = seatsCount;
        } else {
            System.out.println("Wrong seats quantity");
        }
    }

    @Override
    public String toString() {
        return "Opel{" +
                "seatsCount=" + seatsCount +
                ", fuelAverage=" + fuelAverage +
                ", dateOfProduction=" + dateOfProduction +
                '}';
    }
}
