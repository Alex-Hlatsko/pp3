public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    private boolean isOn;
    private int channel_num;
    private int watch_channel;
    private int volume_level;

    public TV(int channel_num) {
        this.isOn = false;
        this.channel_num = channel_num;
        this.volume_level = 1;
        this.watch_channel = 1;
    }

    //Getters and Setters
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannel_num() {
        return channel_num;
    }

    public void setChannel_num(int channel_num) {
        this.channel_num = channel_num;
    }

    public int getVolume_level() {
        return volume_level;
    }

    public void setVolume_level(int volume_level) {
        this.volume_level = volume_level;
    }

    public int getWatch_channel() {
        return watch_channel;
    }

    public void setWatch_channel(int watch_channel) {
        this.watch_channel = watch_channel;
    }

   //Main methods
    public void displayInfo(){
        System.out.println("TV");
        System.out.println("Count of channels: " + getChannel_num());
        System.out.println(isOn ? "Tv on" : "Tv off");
        System.out.println(isOn() ? "Channel: " + getWatch_channel() : "");
        System.out.println(isOn() ? "Volume: " + getVolume_level() : "");
    }

    @Override
    public void channelUp(){
        if(getWatch_channel() >= getChannel_num()){
            System.out.println("Max num of channel");
        } else{
            setChannel(getWatch_channel()+1);
        }
    }

    @Override
    public void channelDown(){
        if(getWatch_channel() <= 1){
            System.out.println("Min num of channel");
        } else {
            setWatch_channel(getWatch_channel()-1);
        }
    }
    @Override
    public void setChannel(int channelNo){
        if(channelNo > getChannel_num() || channelNo < 1){
            System.out.println("You cant set channel");
        } else {
            setWatch_channel(channelNo);
        }
    }

    @Override
    public void off() {
        setOn(false);
        
    }

    @Override
    public void on() {
        setOn(true);  
    }

    @Override
    public void volumeUp() {
        if(isOn()){
            if(getVolume_level() == 10){
                System.out.println("Max volume, you cant change volume");
            } else{
                setVolume_level(getVolume_level()+1);
            }
        } else{
            if(getVolume_level() == 1){
                System.out.println("Min volume, you cant change volume");
            } else{
                setVolume_level(getVolume_level()-1);
            }
            System.out.println("Tv of, you cant change volume");
        }
        
    }

    @Override
    public void volumeDown() {
        if(isOn()){
            
        } else{
            System.out.println("Tv of, you cant change volume");
        }
        
    }
}
