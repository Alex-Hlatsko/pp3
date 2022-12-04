public class Book {
    private String title;
    private Boolean isStarted;
    private int countOfPages;
    private Writer writer;
    private Chapter chapter;
    
    public Book(String title, int countOfPages, Boolean isStarted, Writer writer, Chapter chapter){
        this.title = title;
        this.isStarted = isStarted;
        this.countOfPages = countOfPages;
        this.writer = writer;
        this.chapter = chapter;
    }

    public void openBook(){
        if(isStarted){
            System.out.println("Juz otwarta!");
        } else {
            isStarted = true;
            System.out.println("Ksiazka otwarta!");
        }
    }

    public void closeBook(){
        if(isStarted){
            isStarted = false;
            System.out.println("Ksiazka zamknieta!");
        } else {
            System.out.println("Juz zamknieta!");
        }
    }

    public void displayInfo(){
        System.out.println("Book: " + title);
        System.out.println("Author: " + writer.getName());

        if(writer.getIsAlive()){
            System.out.println("Author is alive");
        } else {
            System.out.println("Author is not alive");
        }

        System.out.println("Age: " +  writer.getAge());

        if(isStarted){
            System.out.println("You started reading the book");
        } else {
            System.out.println("you haven't started reading");
        }
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Alex", false, 19);
        Chapter ch1 = new Chapter("First chapter", 100, 50);
        Book b1 = new Book("Lol Kek", 250, false, w1, ch1);
        
        b1.openBook();
        b1.displayInfo();
    }

}
