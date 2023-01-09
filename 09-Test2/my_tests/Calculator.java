package my_tests;

//POLYMORPHISM

public class Calculator{
    static int sum(int a, int b){
        return a+b;
    }
    static double sum(double a, double b){
        return a+b;
    }
    static String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,3)); // sum of integer
        System.out.println(sum(5.2,3.3)); // sum of double
        System.out.println(sum("5","4")); // sum of string
    }
}