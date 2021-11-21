package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class Roofing extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public Roofing(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean roofPreInspections();
    protected abstract double measureAndCutMaterials();
    protected abstract boolean roofSurfaceSmoothed();
    protected abstract boolean roofInstallation();

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
