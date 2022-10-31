class Clock{
    //Attributes
    int hour = 0;
    int minute = 0;
    
    //Constructor
    public Clock (int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    //Methods
    public void setClock(int hour, int minute){
        if (hour>=0 && hour <=23 && minute >=0 && minute <= 59){
            this.hour = hour;
            this.minute = minute;
        }
    }
    
    public void setClock(){
        hour = 0;
        minute = 0;
    }

    public void displayTime(){
        if(hour>=0 && hour<=9 && minute>=0 && minute<=9){
            System.out.println("Time: " + "0" + hour + ":" + "0" + minute);
        } else if(hour>=0 && hour<=9){
            System.out.println("Time: " + "0" + hour + ":" + minute);
        } else if(minute>=0 && minute<=9){
            System.out.println("Time: " + hour + ":" + "0" + minute);
        } else {
            System.out.println("Time: " + hour + ":" + minute);
        }
    }
    
    public void addOneMinute(){
        if(minute >=0 && minute <= 59){
            if(minute == 59){
                if(hour == 23){
                    hour = 0;
                    minute = 0;
                } else{
                    hour +=1;
                    minute = 0;
                }
            } else{
                minute+=1;
            }
        }
    }
    
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        
    }
}