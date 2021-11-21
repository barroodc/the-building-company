package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;


import java.io.IOException;
import java.util.HashMap;


public abstract class Carpentering extends ResidentialContractor {

    private String name;
    private String nameOfCompany;
    private int expectedNumberOfFixtures;
    private int expectedNumberOfFrameworks;

    public Carpentering(String name, String contractorCompany) {
        super(name, contractorCompany);
    }


    protected abstract void fixturesAndFrameworks() throws IOException;
    protected abstract void modifyMaterials();
    protected abstract HashMap<String, Boolean> damagedMaterial();

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

    public int getExpectedNumberOfFixtures() {
        return expectedNumberOfFixtures;
    }

    public void setExpectedNumberOfFixtures(int expectedNumberOfFixtures) {
        this.expectedNumberOfFixtures = expectedNumberOfFixtures;
    }

    public int getExpectedNumberOfFrameworks() {
        return expectedNumberOfFrameworks;
    }

    public void setExpectedNumberOfFrameworks(int expectedNumberOfFrameworks) {
        this.expectedNumberOfFrameworks = expectedNumberOfFrameworks;
    }
}
