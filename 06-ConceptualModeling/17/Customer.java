public class Customer {
    private String name;
    private double money;
    private int countOfProducts;

    public Customer(String name, double money, int countOfProducts){
        this.name = name;
        this.money = money;
        this.countOfProducts = countOfProducts;
    }

    public void buyProduct(){
        if(money == 0){
            countOfProducts += 1;
            money -= 100;
            System.out.println("Bought 1 product");
        } else {
            System.out.println("You don't have money");
        }
        
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Money: " + money);
        System.out.println("Count of Products: " + countOfProducts);
    }
}
