package my_tests;

//Agregacja
public class Person {
    private String name;
    private Apple apple;

    Person(String name, Apple apple){
        this.name = name;
        this.apple = apple;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Apple sugar: " + apple.getSugar());
    }

    public static void main(String[] args) {
        Apple a1 = new Apple(20);

        Person p1 = new Person("Alex", a1);

        p1.display();
    }
}
