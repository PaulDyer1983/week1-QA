package ProgramPackage;

public class Temperature {
    public static boolean temperature(int temperature, boolean isSummer) {

        if (!isSummer){
            if (temperature >= 60 && temperature <= 90) {
                return true;
            }
        }
        else {
            if(temperature >= 60 && temperature <= 100){
                return true;
            }
        }

        return false;
    }
}
