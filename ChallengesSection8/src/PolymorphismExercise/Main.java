package PolymorphismExercise;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        ElectricCar car2=new ElectricCar("Jaguar", 15, 6);
        car2.drive();
        runRace(car2);
        }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
