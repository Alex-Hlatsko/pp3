class CinemaTicket{
    //Attributes
    static String name = "Morning Star Cinema";
    String film_title;
    int row;
    String seat;
    int price;
    
    //Methods
    public int calculatePrice(){
     if (row <= 2){
            return price = 10;
        } else {
            return price = 25;
        }
    }
    
    public CinemaTicket(String film, int r, String s){
        film_title = film;
        row = r;
        seat = s;
        price = calculatePrice();
    } 
    
    public void display_ticket(){
        System.out.println(CinemaTicket.name);
        System.out.println("Film: " + film_title);
        System.out.println("Row: " + row);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price + "PLN");
    }
    
    public static void main(String[] args){
        // First Ticket
        CinemaTicket t1 = new CinemaTicket("Gladiator", 1, "15");
        t1.display_ticket();
        
        //Second Ticket
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, "2");
        t2.display_ticket();
    }
}