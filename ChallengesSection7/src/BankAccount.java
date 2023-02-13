public class BankAccount {
    private int account;
    private double balance;
    private int phone;
    private String name;
    private String email;

    public double getBalance() {
        return balance;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void deposit(double funds){
      balance+=funds;
        System.out.println("Deposit: "+funds+" New Balance: "+balance);
    }
    public void withdraw(double funds){
        if(balance-funds>0){
           balance-=funds;

            System.out.println("Withdraw: "+funds+" Remaining Balance: "+balance);
        } else {
            System.out.println("Insufficient Fund");
        }

    }
}
