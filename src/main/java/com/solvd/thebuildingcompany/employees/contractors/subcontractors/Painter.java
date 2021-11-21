package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IPaintable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.Painting;

import java.util.HashMap;
import java.util.logging.Logger;

public class Painter extends Painting implements ICleanable, IMeasurable, IPaintable {

    private final Logger logger = Logger.getLogger(Painter.class.getName());

    public Painter(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean surfacePreparation() {
        final Painter paul = new Painter("Paul", "STU Group");
        return false;
    }

    @Override
    protected double calculateAreaToPaint() {
        final Painter steven = new Painter("Steven", "STU Group");
        return 0;
    }

    @Override
    protected boolean primersAdded() {
        final Painter brendan = new Painter("Brendan", "STU Group");
        return false;
    }

    @Override
    protected boolean sealersAdded() {
        final Painter connor = new Painter("Connor", "STU Group");
        return false;
    }

    @Override
    protected HashMap<String, String> paintColorAndRoom() {
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
