package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IPaintable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class Painter extends Contractor implements ICleanable, IMeasurable, IPaintable {

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

    private final Logger logger = Logger.getLogger(Painter.class.getName());

    public Painter(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean surfacePreparation() {
        final Painter paul = new Painter("Paul", "STU Group");
        return false;
    }

    private double calculateAreaToPaint() {
        final Painter steven = new Painter("Steven", "STU Group");
        return 0;
    }

    private boolean primersAdded() {
        final Painter brendan = new Painter("Brendan", "STU Group");
        return false;
    }

    private boolean sealersAdded() {
        final Painter connor = new Painter("Connor", "STU Group");
        return false;
    }

    private HashMap<String, String> paintColorAndRoom() {
        final Painter harvey = new Painter("Harvey", "STU Group");
        return null;
    }

    @Override
    public void cleanArea() {

    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void paintStructures() {

    }
}
