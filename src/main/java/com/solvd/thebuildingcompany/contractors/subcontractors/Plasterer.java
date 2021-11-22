package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;

import java.util.logging.Logger;

public class Plasterer implements ICleanable, ISpreadable {

    private String name;
    private String nameOfCompany;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private final Logger logger = Logger.getLogger(Plasterer.class.getName());

    public Plasterer(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean examineSurfaces() {
        final Plasterer casandra = new Plasterer("Casandra", "BMX Group");
        return false;
    }

    private boolean applyPlasters() {
        final Plasterer giovani = new Plasterer("Giovani", "BMX Group");
        return false;
    }

    @Override
    public void cleanArea() {

    }

    @Override
    public void spread() {

    }
}
