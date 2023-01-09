public class Person{
    private String fisrt_name;
    private String last_name;

    public Person(String fisrt_name, String last_name) {
        this.fisrt_name = fisrt_name;
        this.last_name = last_name;
    }

    public String getFisrt_name() {
        return fisrt_name;
    }

    public void setFisrt_name(String fisrt_name) {
        this.fisrt_name = fisrt_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String display(){
        return getFisrt_name().substring(0,1).toUpperCase() + getLast_name().substring(0,1).toUpperCase();
    }

    static String Person(String f_n, String l_n){
        return f_n.substring(0,1).toUpperCase() + l_n.substring(0,1).toUpperCase();
    }

    public static void main(String[] args) {
        // First method
        Person p1 = new Person("Alex", "Hlatsko");
        System.out.println(p1.display());
        // Second method
        System.out.println(Person("anna", "may"));
    }
}