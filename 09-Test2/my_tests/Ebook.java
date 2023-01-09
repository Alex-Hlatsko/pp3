package my_tests;

public class Ebook extends Book{
    private String author;

    Ebook(String title, String author){
        super(title);
        this.author = author;
    }
    public void display(){
        System.out.println("The best of the best: " + author);
        System.out.println("Title " + super.getTitle());
    }

    public static void main(String[] args) {
        Ebook e1 = new Ebook("Title", "Alina");
        e1.display();
    }
}
