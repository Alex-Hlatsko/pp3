package my_tests;

//Kompozycja
public class Car {
    private String title;
    private Engine engine;

    Car(String title, int power, String model){
        this.title = title;
        this.engine = new Engine(power, model);
    }

    public void display(){
        System.out.println("Car title " + title);
        System.out.println("Engine power " + engine.getPower());
        System.out.println("Engine model " + engine.getModel());
    }

    public static void main(String[] args) {
        Car c1 = new Car("Aga", 250, "Sas");
        c1.display();
    }
}
