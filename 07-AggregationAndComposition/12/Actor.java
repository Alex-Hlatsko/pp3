public class Actor{
    private String name;
    private double price;

    public Actor(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}