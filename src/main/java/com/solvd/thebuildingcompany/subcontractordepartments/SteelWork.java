package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class SteelWork extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public SteelWork(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract double steelSupportMeasurements();
    protected abstract boolean constructSteelSupports();

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
