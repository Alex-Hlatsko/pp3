public class Main {
    public static void main(String[] args) {
        //1
        // Circle c1 = new Circle(7.0);
        // System.out.println(c1.area());
        // System.out.println(c1.perimeter());
        // Triangle t1 = new Triangle(2.3, 4.2, 5.3);
        // System.out.println(t1.area());
        // System.out.println(t1.perimeter());
        // Rectangle r1 = new Rectangle(5.2, 6.3);
        // System.out.println(r1.area());
        // System.out.println(r1.perimeter());

        //2
        User u1 = new User("Alex", "Hlatsko", "lol.kek@gmail.com", "+48 228 666 69");
        Email e1 = new Email("Mess1", "Sub1", u1);
        e1.send();
    }
}
