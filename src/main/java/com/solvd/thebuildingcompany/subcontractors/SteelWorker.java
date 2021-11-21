package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.subcontractordepartments.SteelWork;

import java.util.logging.Logger;

public class SteelWorker extends SteelWork implements IMeasurable, IInstallable {

    private final Logger logger = Logger.getLogger(SteelWorker.class.getName());

    public SteelWorker(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected double steelSupportMeasurements() {
        final SteelWork jensen = new SteelWorker("Jensen", "SAB Group");
        return 0;
    }

    @Override
    protected boolean constructSteelSupports() {
        final SteelWork jared = new SteelWorker("Jared", "SAB Group");
        return false;
    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void addComponents() {

    }
}
