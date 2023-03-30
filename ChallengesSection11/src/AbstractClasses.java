import java.util.ArrayList;

public class AbstractClasses {
    public static void main(String[] args) {
        Dog animal=new Dog("Wolf", 15, 15);
        animal.makeNoise();
        doAnimalStoff(animal);
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Dog("Wolf", 15, 20));
        animals.add(new Fish("Goldfish", 15, 1));

        animals.add(new Horse("Clydesdale", 15, 200));

        for(Animal a:animals){
            doAnimalStoff(a);
            if(a instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }
        System.out.println(animals);


    }

    private static void doAnimalStoff(Animal animal){
        animal.makeNoise();
        animal.move(15);
    }
}

 class Horse extends Mammal{
    public Horse(String type, int size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
    }
    @Override
    public void makeNoise() {
        System.out.println(getExplicitType()+" hair");
    }
}
abstract class Mammal extends Animal{
    public Mammal(String type, int size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(int speed){
        System.out.println(getExplicitType()+" ");
        System.out.println(speed==15?"walks":"runs");
    }

    public abstract void shedHair();
}

 abstract class Animal{
    protected String type;
    private int size;
    private double weight;

     public Animal(String type, int size, double weight) {
         this.type = type;
         this.size = size;
         this.weight = weight;
     }

     public abstract void move(int speed);

     public abstract  void makeNoise();

     public final String getExplicitType(){
         return "+type+ "+getClass().getSimpleName();
     }
 }

 class Dog extends Animal{
     public Dog(String type, int size, double weight) {
         super(type, size, weight);
     }

     @Override
     public void move(int speed) {
        if(speed==15){
    System.out.println("walking "+getExplicitType());

        }else {
    System.out.println("running "+getExplicitType());
}
     }

     @Override
     public void makeNoise() {
        if(type=="Wolf"){
            System.out.println("Howling "+getExplicitType());
        } else {
            System.out.println("Woof "+getExplicitType());
        }
     }
 }
class Fish extends Animal{
    public Fish(String type, int size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(int speed) {
        if(speed==15){
            System.out.println("lazily swimming "+getExplicitType());

        }else {
            System.out.println("darting fractically "+getExplicitType());
        }
    }

    @Override
    public void makeNoise() {
        if(type=="Wolf"){
            System.out.println("swish "+getExplicitType());
        } else {
            System.out.println("splash "+getExplicitType());
        }
    }
}