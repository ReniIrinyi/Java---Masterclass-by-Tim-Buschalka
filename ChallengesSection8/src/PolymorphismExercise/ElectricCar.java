package PolymorphismExercise;

public class ElectricCar extends Car {

    private int batterySize;
private double avgKmPerCharge;

    public ElectricCar(String description) {
        super(description);

    }

    public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }
}
