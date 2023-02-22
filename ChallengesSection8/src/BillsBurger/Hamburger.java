package BillsBurger;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private double addition1Price, addition2Price, addition3Price, addition4Price;
    private String addition1Name, addition2Name,addition3Name,addition4Name;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.printf("%15s Burger: %6.2f %n",name, price);
        System.out.println("-".repeat(30));
    }

    public void addHamburgerAddition1(String addition, double price){
        this.addition1Name=addition;
        this.addition1Price=price;
        System.out.printf("%15s: %6.2f %n", addition, price);
    }
    public void addHamburgerAddition2(String addition, double price){
        this.addition2Name=addition;
        this.addition2Price=price;
        System.out.printf("%15s: %6.2f %n", addition, price);
    }
    public void addHamburgerAddition3(String addition,double price){
        this.addition3Name=addition;
        this.addition3Price=price;
        System.out.printf("%15s: %6.2f %n", addition, price);
    }
    public void addHamburgerAddition4(String addition,double price){
        this.addition4Name=addition;
        this.addition4Price=price;
        System.out.printf("%15s: %6.2f %n", addition, price);
    }

    public String getName() {
        return name;
    }

    public double itemizeHamburger(){

        System.out.printf("%15s: %6.2f %n",getName(), totalPrice());
        System.out.println("-".repeat(30));
        return totalPrice();
    }

    public double totalPrice(){
       return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }


}
