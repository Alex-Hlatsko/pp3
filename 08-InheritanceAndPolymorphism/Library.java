import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book){
        this.books.add(book);
    }
    public void addBook(Ebook book){
        this.books.add(book);
    }
    public void addBook(AudioBook book){
        this.books.add(book);
    }

    // Remove Book
    public void removeBook(Book book){
        this.books.remove(book);
    }
    public void removeBook(Ebook book){
        this.books.remove(book);
    }
    public void removeBook(AudioBook book){
        this.books.remove(book);
    }

    public void display(){
        int num = 0;
        for(Book book : books){
            num+=1;
            System.out.println("Book " + num);
            book.display();
        }
    }

    public static void main(String[] args) {
        Library l = new Library();

        //Books
        Book b1 = new Book("Book title1", new Writer("Alex", "Hl", "genre"), "2022", new Publisher("publisher1", "New York"));
        Book b2 = new Book("Book title2", new Writer("Alex", "Hl", "genre"), "2021", new Publisher("publisher2", "New York"));
        
        //Ebooks
        Ebook eb1 = new Ebook("Book title3", new Writer("Alex", "Hl", "genre"), "2020", new Publisher("publisher3", "New York"), "eb1");
        Ebook eb2 = new Ebook("Book title4", new Writer("Alex", "Hl", "genre"), "2019", new Publisher("publisher4", "New York"), "eb2");
        
        //AudioBook
        AudioBook ab1 = new AudioBook("Book title 5", new Writer("Alex", "Hl", "genre"), "2018", new Publisher("publisher5", "New York"), 12, 3);
        AudioBook ab2 = new AudioBook("Book title 6", new Writer("Alex", "Hl", "genre"), "2017", new Publisher("publisher6", "New York"), 55, 32);

        //Add books
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(eb1);
        l.addBook(eb2);
        l.addBook(ab1);
        l.addBook(ab2);

        l.display();
    }
}
