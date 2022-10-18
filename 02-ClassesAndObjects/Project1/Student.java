public class Student{
    //Atrybuty
    String name;
    String card_id;
    Boolean is_valid;
    int semestr;
    double grade;
    
    //Metody
    public void displayPublicInfo(){
        System.out.println("Student ID card: " + card_id +
        "Whether is valid: " + (is_valid ? "Yes" : "No") +
        "Semestr: " + semestr +
        "Average graduade: " + grade);
    }  
    
    public void changeIdStatus(){
        is_valid = !is_valid;
    }
    
    public void showIdStatus(){
        System.out.println(name + card_id + is_valid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Alex";
        s1.card_id = "223166";
        s1.is_valid = true;
        s1.semestr = 3;
        s1.grade = 5.0;
        
        s1.displayPublicInfo();
        s1.showIdStatus();
        
        s1.changeIdStatus();
        s1.showIdStatus();
        
    }
}