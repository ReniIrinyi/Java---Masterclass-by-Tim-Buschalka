package CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost = cost < 0 ? 0 : cost;
    }



}
