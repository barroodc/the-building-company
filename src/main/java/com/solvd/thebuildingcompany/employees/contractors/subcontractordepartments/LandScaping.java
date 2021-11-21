package com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments;


import com.solvd.thebuildingcompany.employees.contractors.ResidentialContractor;

public abstract class LandScaping extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public LandScaping(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean pesticidesApplied();
    protected abstract boolean generalMaintenanceDuties();
    protected abstract boolean applyFertilizer();
    protected abstract boolean maintainTheLand();
    protected abstract boolean plantDecorativeBushes();
    protected abstract boolean plantDecorativeFlowers();

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
