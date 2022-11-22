
public class BankAccount{
    //Atributes
    private int balance; 
    private String owner;
    private String accountNumber;

    //Constructor
    BankAccount(String name, int balance, String accountNumber){
        owner = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //Methods
    public void deposit(int deposit){
        balance+=deposit;
        System.out.println("+ " + deposit);
    }

    public void withDraw(int amount){
        if(balance < amount){
            System.out.println("Error");
        } else {
            if (amount > 500){
                System.out.println("More then 500");
            } else{
                balance-=amount;
                System.out.println("- " + amount);
            } 
        }
    }

    public void displayBalance(){
        System.out.println("Balance: " + balance + "PLN");
    }

    public static void main(String[] args){
        BankAccount p1 = new BankAccount("Alex", 100, "1234 12234 12131 12131");
        p1.displayBalance();
        p1.withDraw(100);
        p1.deposit(100);
        p1.displayBalance();
        p1.deposit(600);
        p1.withDraw(501);
        p1.displayBalance();
    }

}