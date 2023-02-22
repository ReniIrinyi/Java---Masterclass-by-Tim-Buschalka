package OOPMasterChallenge;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("fries", "drink", "regular");
    }

    public MealOrder(String side, String drink, String burger ) {
        if(burger.equalsIgnoreCase("deluxe")){
            this.burger=new DeluxeBurger(burger, 8.5);
        } else {
            this.burger=new Burger(burger, 4.50);
        }

    this.side=new Item("Side", side, 1.00);

    this.drink=new Item("Drink", drink, 1.50);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice()+drink.getAdjustedPrice()+ burger.getAdjustedPrice();
    }

    public void printItemizedList(){

        burger.printItem();

        if(burger instanceof  DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(),0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: ", getTotalPrice());
    }

public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addTopping(extra1, extra2,extra3);
}
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if(burger instanceof DeluxeBurger db){
            db.addTopping(extra1, extra2, extra3,extra4,extra5);
        } else {
            burger.addTopping(extra1, extra2,extra3);
        }
    }
public void setDrinkSize(String size){
        drink.setSize(size);
}
}
