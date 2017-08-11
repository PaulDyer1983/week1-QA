package com.company;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehicle = new ArrayList();

    public void addVehicle(Vehicle v){
        vehicle.add(v);
    }

    public void removeVehicle(Vehicle v){
        vehicle.remove(v);
    }

    public void removeVehicleByReg(String regNumber){

        Vehicle matched = null;

        for(Vehicle v : vehicle){
            if(regNumber == v.vehicleIdorReg){
                matched = v;
                //break; not good for biger systems
            }
        }

        if(matched != null){
            vehicle.remove(matched);
        }
    }

    public void vehicleType(){
        //Add Cars
        this.addVehicle( new Car("Renault","Megane", "PK66 UKG", 55));
        this.addVehicle( new Car("Nissan","Skyline", "RT66 FPA", 100));

        //Add Boats
        this.addVehicle( new Boat("Seaking","Sea King", "Boat1", 200));
        this.addVehicle( new Boat("Rowing Boat","Sinker", "Boat2", 150));

        //Add Motorcycle
        this.addVehicle( new Motorcycle("Honda","CBR 600", "UB57 RTY", 59));
        this.addVehicle( new Motorcycle("Nissan","Skyline", "WS10 ERT", 40));
    }

    public void printDetails(){
        for(Vehicle v: vehicle){
            System.out.println(v);
        }
    }

    public int totalCost(){
        int total = 0;
        for(Vehicle v: vehicle){
            total+= v.repairCost;
        }
        return total;
    }

    public void emptyGarage() {
        vehicle.clear();
    }
}


