package CompositionChallenge;

public class SmartKitchen  {
  private DishWasher dishWasher;
  private Refrigerator fridge;
  private CofeeMaker cofeeMaker;

 public SmartKitchen(){
     cofeeMaker=new CofeeMaker();
     fridge=new Refrigerator();
     dishWasher=new DishWasher();
 }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public CofeeMaker getCofeeMaker() {
        return cofeeMaker;
    }
}
