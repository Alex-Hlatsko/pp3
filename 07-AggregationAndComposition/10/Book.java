public class Book {
    private String title;
    private Boolean isStarted;
    private int countOfPages;
    private Writer writer;
    
    public Book(String title, Boolean isStarted, Writer writer){
        this.title = title;
        this.isStarted = isStarted;
        this.isStarted = isStarted;
        this.writer = writer;
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
        Book b1 = new Book("Lol Kek", false, w1);
        
        b1.openBook();
        b1.displayInfo();
    }

}
