public class ComputerFIle {
    private String name;
    private int size;
    private String date;
    
    public void renameFile(String name){
        this.name = name;
    }

    public void copyFile(){
        System.out.println("File " + name + "copied");
    }
    public void delete(){
        name = null;
        size = 0;
        date = null;
    }
}
