public class Writer {
    private String name;
    private Boolean isAlive;
    private int age;

    public String getName() {
        return name;
    }

    public Boolean getIsAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }

    public Writer(String name, Boolean isAlive, int age){
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    public void changeName(String name){
        this.name = name;
    }

}
