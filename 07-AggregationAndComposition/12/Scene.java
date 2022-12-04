import java.util.ArrayList;

public class Scene {
    private String title;
    private ArrayList<Actor> actors = new ArrayList<>();
    private Scenario scenario;

    Scene(String title, Scenario scenario, Actor actor){
        this.title = title;
        this.scenario = scenario;
        this.actors.add(actor);
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }
    public void removeActor(Actor actor){
        this.actors.remove(actor);
    }
    public void displayInfo(){
        System.out.println("Scene title: " + title);
        System.out.println("Actors: ");
        for(Actor actor : this.actors){
            actor.displayInfo();
        }
        scenario.displayScript();
    }
}
