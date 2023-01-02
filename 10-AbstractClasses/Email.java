public class Email extends Message{
    private String subject;
    // private String addressTo;
    private User user;

    //Constructor
    public Email(String text, String subject, User user) {
        super(text);
        this.subject = subject;
        // this.addressTo = addressTo;
        this.user = user;
    }

    //Getters and Setters
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getAddressTo() {
        return user.getEmail();
    }
    public void setAddressTo(String addressTo) {
        user.setEmail(addressTo);
    }

    //Main Methods
    public void send(){
        System.out.println("Send message to: " + getAddressTo());
        System.out.println("Subject: " + getSubject());
        System.out.println("Message: " + getText());
    }
}