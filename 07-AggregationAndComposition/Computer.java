public class Computer{
    private String rodzajWindowsa;
    private String colorObudowy;
    private boolean status;
    private Processor processor;

    Computer(String  rodzajWindowsa, String colorObudowy){
        this.rodzajWindowsa = rodzajWindowsa;
        this.colorObudowy = colorObudowy;
        this.status = false;
        this.processor = new Processor("dd", 1.2, 1, "ss");
    }

    public void wlaczKomputer(){
        if(!status){
            status = true;
            System.out.println("Komputer wlaczony");
        } else {
            System.err.println("Juz jest wlaczony");
        }
    }

    public void wylaczKomputer(){
        if(status){
            status = false;
            System.out.println("Komputer wylaczony");
        } else {
            System.err.println("Juz jest wylaczony");
        }
    }

    public void uruchomProgram(String name){
        System.out.println("Program " + name + " started");
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("sss", "aaa");
        c1 = null;
    }
}