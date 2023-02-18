package CompositionChallenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen=new SmartKitchen();

        kitchen.getDishWasher().setHasWorktoDo(true);
        kitchen.getFridge().setHasWorktoDo(true);
        kitchen.getCofeeMaker().setHasWorktoDo(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getCofeeMaker().brewCoffee();
        kitchen.getFridge().orderFood();


    }
}