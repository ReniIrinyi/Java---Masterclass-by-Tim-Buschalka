package PolymorphismChallenge;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine=true;
        this.wheels=4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
      return "Car -> engine is starting "+ "type is: "+ getClass().getSimpleName() ;
    }

    public String accelerate(){
        return"Car -> accelerating "+ "type is: "+ getClass().getSimpleName();
    }

    public String brake(){
        return"Car -> braking "+ "type is: "+ getClass().getSimpleName();
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
