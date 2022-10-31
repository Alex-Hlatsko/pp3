class TempCal{
    static void CelsiusToKelvin(double c){
        System.out.println(c + "degrees Celsius in Kelvin is " + (c+273.15));
    }
    static void KelvinToCelsius(double c){
        System.out.println(c + "degrees Kelvin in Celsius " + (c-273.15));
    }
    static void FahrenheitToKelvinAndCelsius(double c){
        System.out.println(c + "degrees Fahrenheit in Kelvin" + ((c-32) * 5/9) + " in Celsius" + ((c-32) * 5/9 + 273.15));
    }

    public static void main(){
        TempCal.CelsiusToKelvin(13.4);
        TempCal.KelvinToCelsius(10.9);
        TempCal.FahrenheitToKelvinAndCelsius(54);
    }
}