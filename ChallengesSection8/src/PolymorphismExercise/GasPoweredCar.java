package PolymorphismExercise;

public class GasPoweredCar extends Car {
private double avgKmPerLitre;
    private int cylinders=6;

    public GasPoweredCar(String description) {
        super(description);

    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
