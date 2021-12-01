package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IPaintable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Painter extends Contractor implements IPaintable {

    private String name;
    private String nameOfCompany;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private static final Logger logger = Logger.getLogger(Painter.class.getName());

    public Painter(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }


    private HashMap<String, String> paintColorAndRoom() {
        final Painter harvey = new Painter("Harvey", "STU Group");
        HashMap<String, String> roomAndColor = new HashMap<>();
        roomAndColor.put("Family room", "Blue");
        roomAndColor.put("Dining room", "White");
        roomAndColor.put("Living room", "Blue");
        roomAndColor.put("Bathroom (1st Floor)", "Blue and White");
        roomAndColor.put("Kitchen", "Blue and White");
        roomAndColor.put("Basement", "No color/unfinished");
        roomAndColor.put("Child Bedroom (2nd Floor)", "Black");
        roomAndColor.put("Guest Bedroom (2nd Floor)", "Pink");
        roomAndColor.put("Master Bedroom (2nd Floor)", "Blue and White");
        roomAndColor.put("Master Bathroom (2nd Floor)", "Blue and White");
        roomAndColor.put("Bathroom (2nd Floor)", "Blue and White");

        for (Map.Entry<String, String> set : roomAndColor.entrySet()) {
            logger.info(set.getKey() + " " +  set.getValue());
        }
        return roomAndColor;
    }

    public static void main(String[] args) {
        Painter john = new Painter("John", "Example");
        john.paintColorAndRoom();
    }


    @Override
    public void paintStructures() {
      logger.info("paint the room");
    }
}
