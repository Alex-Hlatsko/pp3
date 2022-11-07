public class Person{

    String name;
    double weight;
    double height;
    double bmi;

    Person(String name){
        this.name = name;
    }

    Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double setWeightAndHeight(double weight, double height){
        return double(weight/height);
    }
}