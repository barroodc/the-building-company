package com.solvd.thebuildingcompany;


import com.solvd.thebuildingcompany.residentialdevelopment.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeBuilder {

    public static void main(String[] args) {
        Bathroom room1 = new Bathroom();
        room1.addBathroom(40,40);
        Bathroom room2 = new Bathroom();
        room2.addBathroom(50,50);
        Bedroom room3 = new Bedroom();
        room3.addBedroom(100,100);
        Bedroom room4 = new Bedroom();
        room4.addBedroom(200,200);
        Bedroom room5 = new Bedroom();
        room5.addBedroom(75,75);
        Garage room6 = new Garage();
        room6.addGarage(20,40);
        Kitchen room7 = new Kitchen();
        room7.addKitchen(50,50);
        FamilyRoom room8 = new FamilyRoom();
        room8.addFamilyRoom(45,45);
        LivingRoom room9 = new LivingRoom();
        room9.addLivingRoom(50,50);
    }
}
