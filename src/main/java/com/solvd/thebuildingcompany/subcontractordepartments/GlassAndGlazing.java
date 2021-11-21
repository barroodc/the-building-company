package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

public abstract class GlassAndGlazing extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public GlassAndGlazing(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean riskAssessmentPerformed();
    protected abstract boolean glassApproval();
    protected abstract double glassFitting();
    protected abstract boolean waterTightCheck();
    protected abstract boolean liftGlassIntoPlace(); //using crane and suction cups

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
