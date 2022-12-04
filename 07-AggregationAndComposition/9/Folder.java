import java.util.ArrayList;
public class Folder{
    private String name; 
    private ArrayList<File> files = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addFile(File file){
        this.files.add(file);
    }

    public void deleteFile(File file){
        this.files.remove(file);
    }

    public void displayFolderContent(){
        System.out.println("Folder: " + name);
        for(File file : this.files){
            System.out.println("File name: " + file.getName());
            System.out.println("Content: " + file.getContent());
        }
    }

    public static void main(String[] args) {
        Folder f1 = new Folder("Folder1");

        File file1 = new File("File 1", "Some text in it");
        File file2 = new File("File 2", "Some text in it");

        f1.addFile(file1);
        f1.addFile(file2);

        f1.displayFolderContent();

        f1.deleteFile(file1);
        
        f1.displayFolderContent();

    }
}