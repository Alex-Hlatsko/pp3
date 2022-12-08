public class AudioBook extends Book {
    private int minutes;
    private int seconds;

    AudioBook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public void display(){
        super.display();
        System.out.println("Audio Book"); 
        System.out.println("Minutes: " + getMinutes()); 
        System.out.println("Seconds: " + getSeconds()); 
    }
}
