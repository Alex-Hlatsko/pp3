public class Logic {
    private String[] a;

    public Logic(String[] a) {
        this.a = a;
    }
    
    public String[] getA() {
        return a;
    }

    public void setA(String[] a) {
        this.a = a;
    }

    public int opposite(){
        int b = 0;
        for(int i=0; i<(getA().length-2); i++){
            if(getA()[i+1]!=getA()[i+2]){
                b+=1;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Logic l1 = new Logic(new String[] {"True","False","True","True","False","True","False","True","False"});
        System.out.println(l1.opposite());
    }

    
}
