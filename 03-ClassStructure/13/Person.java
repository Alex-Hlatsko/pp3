class Person{
    String name;
    double weight;
    double height;
    double BMI;
    //Constructors
    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
        BMI = calculateBMI();
    }
    
    //Methods
    public double calculateBMI(){
        return BMI = weight / (height*height);
    }
    
    public void displayRecord(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        if (BMI < 18.5){
            System.out.println("BMI too low");
        } else if (BMI > 24.9){
            System.out.println("BMI too high");
        } else {
            System.out.println("BMI: " + BMI);
        }
    }
    
    
    public static void main(String[] args){
        Person p1 = new Person("Alex", 58.3, 166);
        p1.displayRecord();
        
    }
}