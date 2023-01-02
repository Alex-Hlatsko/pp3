public class Circle extends Shape {
    private double radius;

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Main methods
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2* Math.PI * radius;
    }
    
}
