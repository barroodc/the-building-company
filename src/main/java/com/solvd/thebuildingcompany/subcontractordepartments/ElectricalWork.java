package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class ElectricalWork extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public ElectricalWork(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean installElectricalComponents();
    //wiring and lighting
    protected abstract boolean electricalComponentInspection();

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
