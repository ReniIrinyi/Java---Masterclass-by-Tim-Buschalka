import java.util.ArrayList;

public class AutoboxingChallenge {
    public static void main(String[] args) {
        Bank bank=new Bank("bank");
        bank.addCustomers("Maria");
        bank.addCustomers("bob");
        bank.addCustomers("Bob");

        bank.addingTransactionsToCustomerList(15.0, "maria");
        bank.addingTransactionsToCustomerList(100, "bob");
        bank.addingTransactionsToCustomerList(150, "maria");
        bank.addingTransactionsToCustomerList(15, "name");

        System.out.println(bank.toString());
        bank.printCustomerData("maria");
        bank.printCustomerData("bob");

        System.out.println(bank.getCustomers("maria"));
        bank.getCustomers("anna");

    }
}

class Customer {
   public   String name;
    private ArrayList <Double> transactions;

    public Customer(String name) {
        this.transactions=new ArrayList<>(500);
        this.name = name.toUpperCase();
    }

    protected void addTransactions(double transactions) {
        this.transactions.add(transactions);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

class Bank{
    String name;
    ArrayList <Customer> customers;

    public Bank(String name) {
        this.name = name.toUpperCase();
        this.customers=new ArrayList<>(10);
    }

    public Customer getCustomers(String name) {
       for(var customer: customers){
           if(customer.name.equalsIgnoreCase(name)){
               return customer;
           }
       }
        System.out.printf("Costumer (%s) wasn´t found %n", name.toUpperCase());
       return null;
    }

    public void addCustomers(String name) {
        if(getCustomers(name)==null) {
                this.customers.add(new Customer(name));
            System.out.printf("Customer %s is added to the Database %n", name);
        } else {
            System.out.printf("Customer %s is already deklared %n", name);
        }
    }

    public void printCustomerData(String name){
                System.out.println(name +"'s date:  "+ getCustomers(name).getTransactions());
                for(double d: getCustomers(name).getTransactions()){
                    System.out.printf("EUR %10.2f (%s)%n",d,d<0? "debit": "credit");
        }
    }

    public void addingTransactionsToCustomerList(double transactions, String name){
           if(getCustomers(name)!=null){
               getCustomers(name).addTransactions(transactions);
               System.out.println(transactions +" added to " + name.toUpperCase());
           }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
