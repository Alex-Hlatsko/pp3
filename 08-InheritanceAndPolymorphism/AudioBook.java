public class AudioBook extends Book {
    private int minutes;
    private int seconds;

    AudioBook(String title, Writer writer, String yearOfPub, Publisher publisher, int minutes, int seconds){
        super(title, writer, yearOfPub, publisher);
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
