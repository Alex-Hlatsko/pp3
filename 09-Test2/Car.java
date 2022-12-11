public class Car extends Vehicle{
    private int maxSpeed;
    Car(int seat, int maxSpeed){
        super(seat);
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int[] spec(){
        return new int[] {getSeats(), getMaxSpeed()};
    }

    public String arraySpec(){
        int [] a = spec();
        return "Seats: " + a[0] + " Max Speed: " + a[1];
    }

    public static void main(String[] args) {
        Car c1 = new Car(2, 120);

        System.out.println(c1.spec());
        System.out.println(c1.arraySpec());
    }
}
