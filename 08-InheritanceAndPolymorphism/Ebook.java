public class Ebook extends Book{
    private String filename;

    public Ebook(String title, String author, String filename){
        super(title, author);
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