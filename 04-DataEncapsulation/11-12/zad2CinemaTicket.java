class zad2CinemaTicket{
    
    //Attributes
    private static String name = "Morning Star Cinema";
    private String film_title;
    private int row;
    private String seat;
    private int price;
    
    //Constructor
    public zad2CinemaTicket(){
        film_title = getFilmTitle();
        row = getRow();
        seat = getSeat();
        price = calculatePrice();
    } 
    //Methods
    public void display_ticket(){
        System.out.println(zad2CinemaTicket.name);
        System.out.println("Film: " + film_title);
        System.out.println("Row: " + row);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price + "PLN");
    }

    public int calculatePrice(){
     if (getRow() <= 2){
            return price = 10;
        } else {
            return price = 25;
        }
    }
    
    public void setFIlmTitle(String film_title){
        this.film_title = film_title;
    }
    public String getFilmTitle(){
        return film_title;
    }

    public void setRow(int row){
        this.row = row;
    }
    public int getRow(){
        return row;
    }

    public void setSeat(String seat){
        this.seat = seat;
    }
    public String getSeat(){
        return seat;
    }

    public static void main(String[] args){
        // First Ticket
        zad2CinemaTicket t1 = new zad2CinemaTicket();
        t1.setFIlmTitle("Run boy");
        t1.setRow(4);
        t1.setSeat("2");
        t1.display_ticket();
    }
}