import java.util.*;
public class Product implements Comparable{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void filter(ArrayList<String> a) {
        String sortTitles = "";
        Collections.sort(a);
        for(String s : a){
            sortTitles+=s+" ";
        }
        System.out.println(sortTitles);
    }


}
