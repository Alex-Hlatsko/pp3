public class SMS extends Message{
    // private String phoneNumber;
    private User user;
    //Constructor
    public SMS(String text, User user){
        super(text);
        // this.phoneNumber = phoneNumber;
        this.user = user;
    }

    //Getters and Setters
    public String getPhoneNumber() {
        return user.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) {
        user.setPhoneNumber(phoneNumber);
    }    

    //Main methods
    public void send(){
        System.out.println("Message: " + getText()); 
        System.out.println("Count of words: " + charNumber()); 
        System.out.println("Send to: " + getPhoneNumber()); 
    }
}
