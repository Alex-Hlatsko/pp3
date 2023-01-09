public class Cities {
    private String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
    


    public Cities filter(char a){
        String[] filterArr = new String[getCities().length];

        for (int i=0; i<getCities().length; i++){
            char[] charArr = getCities()[i].toCharArray();
            if(charArr[0]==a){
                filterArr[i] = getCities()[i];
            }
        }
        setCities(filterArr);
        return this;
    }

    public String cities(){
        String a = "";
        for (int i=0; i<getCities().length; i++){
            if(getCities()[i] != null){
                a+=getCities()[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Cities c1 = new Cities(new String[] {"Warszawa","Sopot","Kielce","Szczecin"});
        System.out.println(c1.filter('S').cities());
    }
}
