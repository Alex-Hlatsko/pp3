public class Counter{
    int count = 0;

    public void increase(){
        count+=1;
    }
    public void increase(int n){
        count +=n;
    }
    public void decrease(){
        count -=1;
    }
    public void decrease(int n){
        count -=n;
    }
    public int value(){
        return count;
    }

    public static void main(String[] args){
        Counter c = new Counter();
        c.value(); // => 0 
        c.increase(); 
        c.increase(); 
        c.decrease();
        c.increase(5); 
        c.decrease(2); 
        c.value(); // => 4
    }
}