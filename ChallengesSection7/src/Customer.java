public class Customer {
    private String name, adress;
    private int creditlimit;

    public Customer(){
        this("name", "adress" );
    }
    public Customer(String name, String adress) {
        this(name, adress, 2500);
    }

    public Customer(String name, String adress, int creditlimit) {
        this.name = name;
        this.adress = adress;
        this.creditlimit = creditlimit;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCreditlimit() {
        return creditlimit;
    }




}
