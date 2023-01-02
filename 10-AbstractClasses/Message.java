abstract class Message {
    private String text;
    
    //Construktor
    public Message(String text){
        this.text = text;
    }

    //Getters and Setters
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    //Main methods
    public int charNumber(){
        return text.length();
    }
    public abstract void send(); 
}
