public class Car extends Vehicle{
    private String model;
    private String color;
   
    //Construktor 
    public Car(int max_speed, int count_passengers, String model, String color) {
        super(max_speed, count_passengers);
        this.model = model;
        this.color = color;
    }

    //Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Main methods
    public void displayInfo(){
        System.out.println("Car");
        System.out.println("Model " + getModel());
        System.out.println("Color " + getColor());
        System.out.println("Max speed " + getMax_speed());
        System.out.println("Count of passengers " + getCount_passengers());
    }
}
