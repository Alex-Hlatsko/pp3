public class Pizza extends Food implements Extra{    
    private int size;

    public Pizza(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double delivary() {
        // TODO Auto-generated method stub
        if(size>=50){
            return 8;
        } else {
            return 6;
        }
    }

    @Override
    public double delivary(int a) {
        if(size>=50){
            return 8+a;
        } else {
            return 6+a;
        }
    }

    @Override
    public double discount() {
        if(getPrice()>=30){
            return (getPrice()/100)*5;
        } else{
            return 0;
        }
    }

    @Override
    public void setPrice() {
        // TODO Auto-generated method stub
        setPrice(size-10);
    }
    
}
