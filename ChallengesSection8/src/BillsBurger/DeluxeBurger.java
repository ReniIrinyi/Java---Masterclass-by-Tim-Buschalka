package BillsBurger;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "chicken", "white",  19.10);
        super.addHamburgerAddition1("Chips", 3);
        super.addHamburgerAddition2("Drink", 1);
    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("*".repeat(50));
        System.out.println("Cannot add additional items to a deluxe burger");
        System.out.println("*".repeat(50));
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("*".repeat(50));
        System.out.println("Cannot add additional items to a deluxe burger");
        System.out.println("*".repeat(50));
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("*".repeat(50));
        System.out.println("Cannot add additional items to a deluxe burger");
        System.out.println("*".repeat(50));
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("*".repeat(50));
        System.out.println("Cannot add additional items to a deluxe burger");
        System.out.println("*".repeat(50));
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }
}
