package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;

import java.util.logging.Logger;

public class SteelWorker implements IMeasurable, IInstallable {

    private String name;
    private String nameOfCompany;


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

    private final Logger logger = Logger.getLogger(SteelWorker.class.getName());

    public SteelWorker(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private double steelSupportMeasurements() {
        final SteelWorker jensen = new SteelWorker("Jensen", "SAB Group");
        return 0;
    }

    private boolean constructSteelSupports() {
        final SteelWorker jared = new SteelWorker("Jared", "SAB Group");
        return false;
    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void addComponents() {

    }
}
