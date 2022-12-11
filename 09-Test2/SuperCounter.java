public class SuperCounter extends Counter{

    SuperCounter(int counter){
        super(counter);
    }

    public void addN(int n){
         setCounter(getCounter() + n); 
         
    }

    public static void main(String[] args) {
        SuperCounter s1 = new SuperCounter(3);
        s1.add1();
        System.out.println(s1.getCounter());
        s1.addN(3);
        System.out.println(s1.getCounter());

    }
}
