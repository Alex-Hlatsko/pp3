import java.util.ArrayList;
public class ShoppingList{
    private ArrayList<Product> products = new ArrayList<>();
    
    public void add(Product product){
        products.add(product);
    }

    public String toString(){
        String str = "";
        for(Product product : products){
            str += product.getTitle() + ",";
        }
        return str.substring(0, str.length()-1);
    }

    public int total(){
        int sum = 0;
        for(Product product : products){
            sum += product.getCount();
        }
        return sum;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        s1.add(new Product("milk", 2));
        s1.add(new Product("Apple", 5));

        System.out.println(s1.total());
        System.out.println(s1.toString());
    }
}
