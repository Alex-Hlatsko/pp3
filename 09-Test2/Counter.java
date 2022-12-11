public class Counter {
    private int counter;

    Counter(int c){
        counter=c;
    }

    public void add1(){
        counter+=1;
    }
    public int getCounter(){
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
  }