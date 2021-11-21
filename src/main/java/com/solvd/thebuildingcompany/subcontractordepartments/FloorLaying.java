package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

import java.util.HashMap;

public abstract class FloorLaying extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public FloorLaying(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean carpetInstalled();
    protected abstract boolean hardwoodFloorInstalled();
    protected abstract boolean inspectAndCleanSurface();
    protected abstract boolean flooringMaterialsOrdered();

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
