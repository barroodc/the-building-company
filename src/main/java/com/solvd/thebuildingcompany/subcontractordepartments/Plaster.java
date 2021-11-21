package com.solvd.thebuildingcompany.subcontractordepartments;


import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class Plaster extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public Plaster(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean examineSurfaces(); //for plaster
    protected abstract boolean applyPlasters(); //exterior and interior

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
