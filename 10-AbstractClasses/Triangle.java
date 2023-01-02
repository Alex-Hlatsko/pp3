public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    //Construktor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getters and Setters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    //Main methods
    public double area(){
        double s = perimeter() / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double perimeter(){
        return a+b+c;
    }
}
