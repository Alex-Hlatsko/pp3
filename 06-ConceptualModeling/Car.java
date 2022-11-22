import javax.sql.rowset.spi.SyncResolver;

public class Car {
    private String model;
    private String color;
    private String title;
    private String createDate;
    private int power;
    private boolean isStarted;

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void turnOn(){
        if(isStarted == false){
            isStarted = true;
            System.out.println("Car started!");
        } else {
            System.out.println("Already started");
        }
    }
    public void turnOff(){
        if(isStarted == true){
            isStarted = false;
            System.out.println("Car is off!");
        } else {
            System.out.println("Already off");
        }
    }
    
}
