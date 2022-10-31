import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades {  
    String studentName;
    double[] grades;
    double minGrade;
    double maxGrade;
    int numbGrades;
    double averageGrade;
    
    //Constructor
    
    StudentGrades(String name) {
        this.studentName = name;
        this.grades = inputGrades();
        minGrade = calculateMinGrade();
        maxGrade = calculateMaxGrade();
        numbGrades = calculateNumGrades();
        averageGrade = calculateAverage();
    }
    
    //Methods
    
    public double[] inputGrades(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt(); 
        double array[] = new double[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }
    
    public double calculateMinGrade(){
        double min = 5.0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]<min){
                min=grades[i];
            }
        }
        return min;
    }
    
    public double calculateMaxGrade(){
        double max = 0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]>max){
                max=grades[i];
            }
        }
        return max;
    }
    
    public int calculateNumGrades(){
        int count = 0;
        for(int i=0; i<grades.length; i++){
            count++;
        }
        return count;
    }
    
    public double calculateAverage(){
        double p = 0;
        for(double i : grades){
            p+=i;
        }
        return p/numbGrades;
    }
    
    public void displayStudRecords(){
        System.out.println("Name: " + studentName);
        System.out.println("List of the student's grades: " + Arrays.toString(grades));
        System.out.println("Number of grades: " + numbGrades);
        System.out.println("Lowest grade: " + minGrade);
        System.out.println("Highest grade: " + maxGrade);
        System.out.println("Grade point average: " + averageGrade);
    }
    
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda");
        s1.displayStudRecords();
        
        StudentGrades s2 = new StudentGrades("James"); 
        
        s2.displayStudRecords();
    }

}