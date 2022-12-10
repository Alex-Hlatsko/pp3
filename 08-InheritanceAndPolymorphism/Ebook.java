public class Ebook extends Book{
    private String filename;

    public Ebook(String title, Writer writer, String yearOfPub, Publisher publisher, String filename){
        super(title, writer, yearOfPub, publisher);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void display(){
        super.display();
        System.out.println("Ebook");
        System.out.println("Filename: " + getFilename());
    }

}