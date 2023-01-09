package my_tests;

public class Book {
    private String title;
    Book(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("Title: " + title);
    }

}
