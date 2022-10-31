class Room{
    int number;
    int beds;
    boolean occupied = false;
    String guestName;
    
    public Room(int number){
    this.number = number;
    this.beds = 2;
    }
    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName){
        this.guestName = guestName;
        this.occupied = true;
    }
    
    public void checkout(){
        this.guestName = null;
    }
    
    public void isOccupied(){
        if(occupied){
            System.out.println("This room is occupied");
        } else {
            System.out.println("This room is free");
        }
    }
    
    public void displayStatus(){
        System.out.println("Number: " + number);
        System.out.println("Beds: " + beds);
        isOccupied();
        System.out.println("In this room live: " + guestName);
    }
    
    static void displayListOfRooms(Room[] rooms){
        for(int i=0; i<rooms.length; i++){
            rooms[i].displayStatus();
        }
    }
    
    static void displayListOfRooms(Room[] rooms, int beds){
        for(int i=0; i<rooms.length; i++){
            if(rooms[i].beds == beds){
                rooms[i].displayStatus();
            }
        }
    }
    
    static void vacantRooms(Room[] rooms){
        int occupied = 0;
        int vacant = 0;
        for(int i=0; i<rooms.length; i++){
            if(rooms[i].occupied == true){
                occupied+=1;
            } else{
                vacant +=1;
            }
        }
        System.out.println("Vacant rooms: " + vacant);
        System.out.println("Occupied rooms: " + occupied);
    }
    
    static void vacantBeds(Room[] rooms){
        int vacant = 0;
        
        for(int i=0; i<rooms.length; i++){
            if(rooms[i].occupied == false){
                vacant = vacant + rooms[i].beds;
            }
        }
        System.out.println("Vacant rooms: " + vacant);
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        //3 rooms with 2 beds
        for(int i=0; i<3; i++){
            rooms[i] = new Room(i+1);
        }
        //2 rooms with 3 beds
        for(int i=3; i<5; i++){
            rooms[i] = new Room(i+1, 3);
        }
        //1 room with 1 bed
        rooms[5] = new Room(6, 1);
        rooms[0].checkin("Alex");
        
        //displayListOfRooms(rooms);
        
        //displayListOfRooms(rooms,2);
        
        //vacantRooms(rooms);
        
        
        
    }
}