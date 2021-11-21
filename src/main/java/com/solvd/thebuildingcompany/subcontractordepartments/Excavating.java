package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

import java.util.ArrayList;

public abstract class Excavating extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public Excavating(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract void equipmentOperation();
    protected abstract boolean preparingDiggingSites();
    protected abstract ArrayList<String> maintenanceAndRepairs();
    protected abstract boolean debrisCleared();

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
