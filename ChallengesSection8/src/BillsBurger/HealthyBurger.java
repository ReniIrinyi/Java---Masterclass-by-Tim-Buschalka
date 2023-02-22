package BillsBurger;

public class HealthyBurger extends Hamburger {
private String healthyExtra1Name, healthyExtra2Name;
private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Brown rye", price);
    }


    public void addHealthyAddition1(String addition, double price) {
        this.healthyExtra1Name=addition;
        this.healthyExtra1Price=price;
    }


    public void addHealthyAddition2(String addition, double price) {
        this.healthyExtra2Name=addition;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger()+healthyExtra1Price+healthyExtra2Price;
    }


}
