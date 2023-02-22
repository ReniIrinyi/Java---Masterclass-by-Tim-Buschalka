package OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {
/*    Item item=new Item("DRINK", "Cola",  2.5);
    item.printItem();
    item.setSize("SMALL");
    item.printItem();

    Burger burger=new Burger("regular", 4);
    burger.addTopping("Bacon", "Cheese", "none");
    burger.printItem();*/

/*    MealOrder meal=new MealOrder();
    meal.setDrinkSize("SMALL");
    meal.addBurgerToppings("cheese", "none", "none");
    meal.printItemizedList();*/

    MealOrder deluxeMeal=new MealOrder("salat", "zip", "deluxe");
    deluxeMeal.printItemizedList();
    }
}
