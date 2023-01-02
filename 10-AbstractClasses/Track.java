public class Track extends Vehicle{
    private boolean isCargo;
    private double mileage;

    //Constructor
    public Track(int max_speed, int count_passengers, boolean isCargo, double mileage) {
        super(max_speed, count_passengers);
        this.isCargo = isCargo;
        this.mileage = mileage;
    }

    //Getters and Setters
    public boolean isCargo() {
        return isCargo;
    }
    public void setCargo(boolean isCargo) {
        this.isCargo = isCargo;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //Main methods
    public void displayInfo(){
        System.out.println("Track");
        System.out.println(isCargo() ? "Track has cargo" : "Track has not cargo");
        System.out.println("Mileage: " + getMileage());
        System.out.println("Count of Passengers: " + getCount_passengers());
        System.out.println("Max speed: " + getMax_speed());
    }    
}
