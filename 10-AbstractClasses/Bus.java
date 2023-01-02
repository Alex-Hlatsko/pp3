public class Bus extends Vehicle{
    private String driver_name;
    private boolean isStarted;
    
    //Constructor
    public Bus(int max_speed, int count_passengers, String driver_name, boolean isStarted) {
        super(max_speed, count_passengers);
        this.driver_name = driver_name;
        this.isStarted = isStarted;
    }

    //Getters and Setters
    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

    //Main methods
    public void displayInfo(){
        System.out.println("Bus");
        System.out.println("Driver: " + getDriver_name());
        System.out.println("Max speed: " + getMax_speed());
        System.out.println("Count of passengers: " + getCount_passengers());
        System.out.println(isStarted() ? "Bus started" : "Bus not started");
    }
}
