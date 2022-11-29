public class Processor{
    private String nazwa;
    private double taktowanie;
    private int liczbaRdzeni;
    private String socket;

    Processor(String nazwa, double taktowanie, int liczbaRdzeni, String socket){
        this.nazwa = nazwa;
        this.taktowanie = taktowanie;
        this.liczbaRdzeni = liczbaRdzeni;
        this.socket = socket;
    }

    //Sumuj
    public void sumujLiczby(int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    public void sumujLiczby(double a, double b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    //Dziel
    public void dzielLiczby(int a, int b){
        System.out.println(a + ":" + b + "=" + (a/b));
    }

    public void dzielLiczby(double a, double b){
        System.out.println(a + ":" + b + "=" + (a/b));
    }

    //Odejmuj
    public void odejmujLiczby(int a, int b){
        System.out.println(a + "-" + b + "=" + (a-b));
    }

    public void odejmujLiczby(double a, double b){
        System.out.println(a + "-" + b + "=" + (a-b));
    }

    //Pomnoz
    public void pomnozLiczby(int a, int b){
        System.out.println(a + "*" + b + "=" + (a*b));
    }

    public void pomnozLiczby(double a, double b){
        System.out.println(a + "*" + b + "=" + (a*b));
    }

    public String toString(){
        return "Nazwa: " + nazwa + " Taktowanie: " + taktowanie + " Liczba Rodzeni: " + liczbaRdzeni + "Socket: " + socket;
    }
}