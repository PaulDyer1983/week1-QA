package com.company;

public class Main {

    public static void main(String[] args) {
        Garage g = new Garage();
        g.vehicleType();
        System.out.println("-----Garage List-----");
        g.printDetails();
        System.out.println("-----Total Cost-----");
        System.out.println(g.totalCost());
        System.out.println("-----Remove Vehicle-----");
        g.removeVehicleByReg("Boat1");
        g.printDetails();
        //g.totalCost();

        System.out.println("-----Empty Garage-----");
        g.emptyGarage();
        g.printDetails();

    }




}
