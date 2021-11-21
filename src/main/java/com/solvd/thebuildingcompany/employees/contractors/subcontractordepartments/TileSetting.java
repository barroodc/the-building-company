package com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.contractors.ResidentialContractor;

public abstract class TileSetting extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public TileSetting(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract double tilesCut(); //to marble size
    protected abstract boolean surfaceAreaMaintenance(); //cleaning
    protected abstract boolean tileArrangement(); //according to design plans
    protected abstract boolean groutApplied();

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
