package com.company;

import java.util.Random;

public abstract class Vehicle {
    public String vehicleModel;
    public String make;
    public String vehicleIdorReg;
    public static int repairCost;


    public String getVehicle(){
        return vehicleModel;
    }

    public String getMake(){
        return make;
    }

    public String getVehicleIdorReg(){
        return vehicleIdorReg;
    }

    public int repairCost(){
        return repairCost;
    }

    @Override
    public String toString() {
        return vehicleModel.toString();
        //return super + propellor etc
    }

}
