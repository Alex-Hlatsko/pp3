import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList{
    // private String[] products; 

    ArrayList<String> products;

    ShoppingList(ArrayList<String> products) {
        this.products = products;
    }


    public String displayProductList(){ 
        String list = "";
        for(String product : products){
            list += " " + product;
        }
        return list;
    }

    public int displayNumProducts(){
        return products.size();
    }

    public void addProduct(String product) {
        this.products.add(product);
    }

    public void addProductFromKeyboard() {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        this.products.add(product);
    }

    public static void main(String[] args){
        ArrayList<String> products = new ArrayList<>();
        ShoppingList p1 = new ShoppingList(products);
        
        p1.addProduct("Eggs");
        p1.addProduct("Apple");
        p1.addProduct("Banannananana");
        System.out.println(p1.displayProductList());
        System.out.println(p1.displayNumProducts());

        p1.addProductFromKeyboard();

        System.out.println(p1.displayProductList());
        System.out.println(p1.displayNumProducts());
    }

}