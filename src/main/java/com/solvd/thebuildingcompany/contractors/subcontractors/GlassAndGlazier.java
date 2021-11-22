package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IMonitorable;

import java.util.logging.Logger;

public class GlassAndGlazier implements IMonitorable, IMeasurable {

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

    private final Logger logger = Logger.getLogger(GlassAndGlazier.class.getName());

    public GlassAndGlazier(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean riskAssessmentPerformed() {
        final GlassAndGlazier tyrone = new GlassAndGlazier("Tyrone", "JKL Group");
        return false;
    }

    private boolean glassApproval() {
        final GlassAndGlazier jeremy = new GlassAndGlazier("Jeremy", "JKL Group");
        return false;
    }

    private double glassFitting() {
        final GlassAndGlazier harry = new GlassAndGlazier("Harry", "JKL Group");
        return 0;
    }

    private boolean waterTightCheck() {
        final GlassAndGlazier dwayne = new GlassAndGlazier("Dwayne", "JKL Group");
        return false;
    }

    private boolean liftGlassIntoPlace() {
        final GlassAndGlazier david = new GlassAndGlazier("David", "JKL Group");
        return false;
    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void monitorProcess() {

    }
}
