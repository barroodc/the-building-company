package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

import java.util.HashMap;

public abstract class Masonry extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public Masonry(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract boolean chimneyInstallation();
    protected abstract HashMap<String, Boolean> materialsToBreak();
    protected abstract boolean mortarApplications();
    protected abstract boolean groutApplications();
    protected abstract boolean constructMasonryWalls();

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
