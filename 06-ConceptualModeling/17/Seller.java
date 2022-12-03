public class Seller {
    private String name;
    private double money;
    private int countOfProducts;

    public Seller(String name, double money, int countOfProducts){
        this.name = name;
        this.money = 0;
        this.countOfProducts = countOfProducts;
    }

    public void sellProduct(){
        if(countOfProducts == 0){
            
            System.out.println("You don't have products");
        } else{
            countOfProducts -= 1;
            money += 100;
            System.out.println("Sold 1 product");
        }
    }

    public void buyProduct(){
        countOfProducts += 1;
        money -= 100;
        System.out.println("Bought 1 product");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Money: " + money);
        System.out.println("Count of Products: " + countOfProducts);
    }

    

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public static void main(String[] args) {
        Seller s1 = new Seller("Alex", 1000.00, 21);
        s1.sellProduct();
        s1.buyProduct();
        s1.displayInfo();
    }
}