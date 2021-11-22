package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.HashMap;
import java.util.logging.Logger;

public class PaperHanger implements IInstallable {

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

    private final Logger logger = Logger.getLogger(PaperHanger.class.getName());

    public PaperHanger(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private HashMap<String, String> roomAndWallPaper() {
        final PaperHanger sarah = new PaperHanger("Sarah", "AZB Group");
        return null;
    }

    private boolean wallPaperApplied() {
        final PaperHanger cassidy = new PaperHanger("Cassidy", "AZB Group");
        return false;
    }

    @Override
    public void addComponents() {

    }
}
