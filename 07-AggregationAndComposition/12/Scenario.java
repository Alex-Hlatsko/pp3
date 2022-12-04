public class Scenario{
    private String script;

    Scenario(String script){
        this.script = script;
    }

    public void displayScript(){
        System.out.println("Scenario: " + script);
    }
}