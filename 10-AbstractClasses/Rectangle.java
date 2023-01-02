public class Rectangle extends Shape{
    private double a;
    private double b;

    //Constructor
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    //Getters and Setters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //Main methods
    public double area(){
        return a*b;
    }
    public double perimeter(){
        return (a+b)*2;
    }
    
}
