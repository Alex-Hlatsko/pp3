public class Person{
    private String name;
    private int age; 
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isAdult(){
        if(age>18){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return getName() + getAge();
    }

    public static void main(String[] args){
        Person p = new Person("Anna",21); 
        p.getAge(); // => 21 
        p.isAdult(); // => true 
        p.setAge(17); 
        p.isAdult(); // => false 
        p.toString();  //=> “Anna,17”
    }
}