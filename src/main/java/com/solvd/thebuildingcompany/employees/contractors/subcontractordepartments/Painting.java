package com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.contractors.ResidentialContractor;

import java.util.HashMap;

public abstract class Painting extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public Painting(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean surfacePreparation();
    protected abstract double calculateAreaToPaint();
    protected abstract boolean primersAdded();
    protected abstract boolean sealersAdded();
    protected abstract HashMap<String, String> paintColorAndRoom();

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
}
