class InternetDevice{
    String name;
    boolean connected = false;
    static int connectedDevices;
    
    public InternetDevice(String name){
        this.name = name;
    }
    
    public void connect(){
        connected = true;
        connectedDevices++;
    }
    
    public void disconnect(){
        connected = false;
        connectedDevices--;
    }
    
    public void isConnected(){
        if(connected){
            System.out.println("Device is connected");
        } else {
            System.out.println("Device not connected");
        }
    }
    
    public void dispalyStatus(){
        System.out.println("Device " + name);
        if(connected){
            System.out.println("Device is connected");
        } else {
            System.out.println("Device not connected");
        }
    }
    
    static void displayConnections(){
        System.out.println("Count of connections: " + connectedDevices);
    }
    
    public static void main(String[] args){
        InternetDevice d1 = new InternetDevice("Laptop");
        d1.connect();
        d1.dispalyStatus();

        InternetDevice d2 = new InternetDevice("Smartphone");
        d2.connect();
        d2.dispalyStatus();
        
        InternetDevice d3 = new InternetDevice("Radio");
        d3.connect();
        d3.dispalyStatus();
        
        InternetDevice d4 = new InternetDevice("TV");
        d4.dispalyStatus();
        
        InternetDevice d5 = new InternetDevice("Personal computer");
        d5.dispalyStatus();
        
        InternetDevice.displayConnections();
    }
}