package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IMonitorable;
import com.solvd.thebuildingcompany.subcontractordepartments.GlassAndGlazing;

import java.util.logging.Logger;

public class GlassAndGlazier extends GlassAndGlazing implements IMonitorable, IMeasurable {

    private final Logger logger = Logger.getLogger(GlassAndGlazier.class.getName());

    public GlassAndGlazier(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean riskAssessmentPerformed() {
        final GlassAndGlazier tyrone = new GlassAndGlazier("Tyrone", "JKL Group");
        return false;
    }

    @Override
    protected boolean glassApproval() {
        final GlassAndGlazier jeremy = new GlassAndGlazier("Jeremy", "JKL Group");
        return false;
    }

    @Override
    protected double glassFitting() {
        final GlassAndGlazier harry = new GlassAndGlazier("Harry", "JKL Group");
        return 0;
    }

    @Override
    protected boolean waterTightCheck() {
        final GlassAndGlazier dwayne = new GlassAndGlazier("Dwayne", "JKL Group");
        return false;
    }

    @Override
    protected boolean liftGlassIntoPlace() {
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
