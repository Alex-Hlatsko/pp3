abstract class Vehicle {
    private int max_speed;
    private int count_passengers;
    abstract public void displayInfo();
    public Vehicle(int max_speed, int count_passengers) {
        this.max_speed = max_speed;
        this.count_passengers = count_passengers;
    }
    public int getMax_speed() {
        return max_speed;
    }
    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
    public int getCount_passengers() {
        return count_passengers;
    }
    public void setCount_passengers(int count_passengers) {
        this.count_passengers = count_passengers;
    }
}
