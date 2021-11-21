package com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.contractors.ResidentialContractor;

import java.util.HashMap;

public abstract class WallPaper extends ResidentialContractor {

    private String name;
    private String nameOfCompany;

    public WallPaper(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract HashMap<String, String> roomAndWallPaper();
    protected abstract boolean wallPaperApplied(); //adhesives and all/trimming of rough edges

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
