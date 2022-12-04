import java.util.ArrayList;

public class Bookcase {
    private int countBooks = 0;
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        countBooks +=1;
        this.books.add(book);
    }

    public void removeBook(Book book){
        if(countBooks == 0){
            countBooks -=1;
            this.books.remove(book);
        }
    }

    public void displayInfo(){
        if(countBooks == 1){
            System.out.println("1 book on bookcase");
        } else if (countBooks == 0){
            System.out.println("no books on the bookcase");
        } else {
            System.out.println(countBooks + " books on bookcase");
        }

        for(Book book : this.books){
            book.displayInfo();
        }
    }
    
    public static void main(String[] args) {
        Bookcase b1 = new Bookcase();
        Writer w1 = new Writer("Alex", true, 19);
        Book book1 = new Book("Java practice 3h", false, w1);

        b1.addBook(book1);
        b1.displayInfo();
    }
}
