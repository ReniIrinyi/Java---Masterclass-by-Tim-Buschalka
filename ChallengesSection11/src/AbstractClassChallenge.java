import java.util.ArrayList;

public class AbstractClassChallenge {
    private static ArrayList<ProdutsForSale> storeProducts = new ArrayList<>();
    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));

}

public static void printOrder(ArrayList<OrderItem>order){
        double salesTotal=0;
        for(var item:order){
            item.produtc.printPriceLineItem(item.quantity);
            salesTotal+=item.produtc.getSalesPrice(item.quantity);

        }
    System.out.printf("Sales Total= $%6.2f %n", salesTotal);
}
    public static void main(String[] args) {
        storeProducts.add(new ArtItem(1, 1350, "Painting", "Impressionistic work"));
        storeProducts.add(new ArtItem(5, 500, "Sculpture", "sculpture"));
        storeProducts.add(new Furniture(15,5000,"Cher","white"));
        listProducts();

        var order1=new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 1);
        addItemToOrder(order1, 2, 1);
        System.out.println("Order 1");
        printOrder(order1);
    }
}

    class OrderItem {

        protected int quantity;
        ProdutsForSale produtc;

        public OrderItem(int quantity, ProdutsForSale produtc) {
            this.quantity = quantity;
            this.produtc = produtc;
        }
}

class Furniture extends ProdutsForSale {

    public Furniture(int quantity, int price, String type, String description) {
        super(quantity, price, type, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in Hungary");
        System.out.printf("The price of the piece is $%d %n", price);
        System.out.println(description);
    }
}

    class ArtItem extends ProdutsForSale {

        public ArtItem(int quantity, int price, String type, String description) {
            super(quantity, price, type, description);
        }

        @Override
        public void showDetails() {
            System.out.println("This " + type + " is a beautiful type");
            System.out.printf("The price of the piece is $%d %n", price);
            System.out.println(description);
        }
    }

    abstract class ProdutsForSale {
        protected int quantity, price;
        protected String type, description;

        public ProdutsForSale(int quantity, int price, String type, String description) {
            this.quantity = quantity;
            this.price = price;
            this.type = type;
            this.description = description;
        }

        public int getSalesPrice(int quantity) {
            return quantity * this.price;
        }

        public void printPriceLineItem(int quantity) {
            System.out.printf("%2d quy at $%d each, %-15s => %-35s %n", quantity, price, type, description);
        }

        public abstract void showDetails();
    }


