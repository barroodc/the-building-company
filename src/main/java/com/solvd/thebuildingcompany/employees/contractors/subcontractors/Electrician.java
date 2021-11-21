package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.ElectricalWork;

import java.util.logging.Logger;

public class Electrician extends ElectricalWork implements IInstallable {

    private final Logger logger = Logger.getLogger(Electrician.class.getName());

    public Electrician(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean installElectricalComponents() {
        final Electrician brandon = new Electrician("Brandon", "DEF Group");
        return false;
    }

    @Override
    protected boolean electricalComponentInspection() {
        final Electrician bruce = new Electrician("Bruce", "DEF Group");
        //monitorable interface?
        return false;
    }

    @Override
    public void addComponents() {

    }
}
