public class Family {
    private Person[] person;

    Family(Person[] person){
        this.person= person;
    }

    public int adults(){
        int a = 0;
        for(Person p : person){
            if(p.getAge() >= 18){
                a+=1;
            }
        }
        return a;
    } 

    public static void main(String[] args) {
        Family f1 = new Family(new Person[] {new Person("Alex", 19), new Person("Alex", 20), new Person("Alex", 5)});
        System.out.println(f1.adults());
    }
}
