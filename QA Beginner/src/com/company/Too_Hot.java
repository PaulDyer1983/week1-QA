package com.company;

public class Too_Hot {

    public static void main(String[] args){
        temperature(50, true);
    }

    private static boolean temperature(int temperature, boolean isSummer) {

        if (!isSummer){
            if (temperature >= 60 && temperature <= 90) {
                return true;
            }
    }
        else if (isSummer){
                if(temperature >= 60 && temperature <= 100){
                    return true;
                }
            }

        return false;
    }
}
