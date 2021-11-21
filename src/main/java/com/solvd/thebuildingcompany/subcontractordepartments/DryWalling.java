package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;
import org.w3c.dom.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class DryWalling extends ResidentialContractor {

    private String name;
    private String nameOfCompany;
    private boolean dryWallPanelsAvailable;
    private boolean measurementsTook;
    private int numberOfMistakesMade;



    public DryWalling(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean drywallInstallation();
    protected abstract boolean measureDryWallPanels() throws IOException;
    protected abstract HashMap<String, String> modifyMaterials();
    protected abstract ArrayList<String> mistakesToFix(); //smooth out imperfections

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

    public boolean isDryWallPanelsAvailable() {
        return dryWallPanelsAvailable;
    }

    public void setDryWallPanelsAvailable(boolean dryWallPanelsAvailable) {
        this.dryWallPanelsAvailable = dryWallPanelsAvailable;
    }

    public boolean isMeasurementsTook() {
        return measurementsTook;
    }

    public void setMeasurementsTook(boolean measurementsTook) {
        this.measurementsTook = measurementsTook;
    }

    public int getNumberOfMistakesMade() {
        return numberOfMistakesMade;
    }

    public void setNumberOfMistakesMade(int numberOfMistakesMade) {
        this.numberOfMistakesMade = numberOfMistakesMade;
    }
}
