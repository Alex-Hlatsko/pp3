import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Numbers n1 = new Numbers(new int[] {6,7,6,1,4});
        // Numbers n1 = new Numbers(new int[] {2,5,2,8,4});
        // System.out.println(n1.ok());

        Product p1 = new Product("E", 1.2);
        Product p2 = new Product("D", 2.2);
        Product p3 = new Product("C", 3.2);
        Product p4 = new Product("B", 4.2);
        Product p5 = new Product("A", 5.2);

        ArrayList<String> titles = new ArrayList<>();

        titles.add(p1.getName());
        titles.add(p2.getName());
        titles.add(p3.getName());
        titles.add(p4.getName());
        titles.add(p5.getName());

        p1.filter(titles);
    }
}