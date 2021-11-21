package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.WallPaper;

import java.util.HashMap;
import java.util.logging.Logger;

public class PaperHanger extends WallPaper implements IInstallable {

    private final Logger logger = Logger.getLogger(PaperHanger.class.getName());

    public PaperHanger(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected HashMap<String, String> roomAndWallPaper() {
        final PaperHanger sarah = new PaperHanger("Sarah", "AZB Group");
        return null;
    }

    @Override
    protected boolean wallPaperApplied() {
        final PaperHanger cassidy = new PaperHanger("Cassidy", "AZB Group");
        return false;
    }

    @Override
    public void addComponents() {

    }
}
