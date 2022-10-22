class Lampa{
    Boolean isOn = false;
    public void onLamp(){
        if (isOn == false){
            isOn = true;
            System.out.println("Lamp is ON ");
        } else{
            System.out.println("Lamp already ON");
        }
    }
    public void offLamp(){
        if (isOn == true){
            isOn = false;
            System.out.println("Lamp is OFF");
        } else{
            System.out.println("Lamp already OFF");
        }
    }
    public void display (){
        if (isOn == true){
            isOn = false;
            System.out.println("Lamp is OFF");
        } else{
            System.out.println("Lamp is ON");
        }
    }
}