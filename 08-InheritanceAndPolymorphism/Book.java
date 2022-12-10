public class Book{
    private String title;
    private Writer writer;
    private Publisher publisher;
    private String yearOfPub;

    public Book(String title, Writer writer, String yearOfPub, Publisher publisher){
        this.title = title;
        this.writer = writer;
        this.yearOfPub = yearOfPub;
        this.publisher = publisher;
    }

    public String getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(String yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("Title: " + getTitle());
        writer.display();
        System.out.println("Year of publication: " + getYearOfPub());
        System.out.println("Publisher Name: " + publisher.getName());
        System.out.println("Publisher City: " + publisher.getCity());
    }
    
}