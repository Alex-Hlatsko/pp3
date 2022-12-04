import java.util.ArrayList;

public class Film {
    private String title;
    private ArrayList<Scene> scenes = new ArrayList<>();
    private double budget;

    Film(String title, Scene scenes, double budget){
        this.title = title;
        this.scenes.add(scenes);
        this.budget = budget;
    }

    public void addScene(Scene scene){
        this.scenes.add(scene);
    }

    public void removeScene(Scene scene){
        this.scenes.remove(scene);
    }

    public void displayInfo(){
        System.out.println("Film title: " + title);
        for(Scene scene : scenes){
            scene.displayInfo();
        }
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Actor a1 = new Actor("Alex", 1000);
        Actor a2 = new Actor("Alina", 1200);

        Scenario scenario1 = new Scenario("Script about first scene");
        Scenario scenario2 = new Scenario("Script about second scene");

        Scene scene1 = new Scene("First scene", scenario1, a1);
        Scene scene2 = new Scene("Second scene", scenario2, a2);

        Film f1 = new Film("Zycie na UEKu", scene1, 10);
        f1.addScene(scene2);

        f1.displayInfo();




    }
}
