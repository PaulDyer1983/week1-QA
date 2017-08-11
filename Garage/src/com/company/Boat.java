package com.company;

import java.util.ArrayList;

public class Boat extends Vehicle{


    public Boat(String Make, String Model, String boatId, int repairCost){
        this.make = Make;
        this.vehicleModel= Model;
        this.vehicleIdorReg = boatId;
        this.repairCost = repairCost;
    }
}
