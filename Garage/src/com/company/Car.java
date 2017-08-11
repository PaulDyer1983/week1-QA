package com.company;

import java.util.ArrayList;

public class Car extends Vehicle{


    public Car(String Make, String Model, String regNumber, int repairCost){
        this.make = Make;
        this.vehicleModel= Model;
        this.vehicleIdorReg = regNumber;
        this.repairCost = repairCost;
    }
}
