package com.solvd.thebuildingcompany.subcontractordepartments;

import com.solvd.thebuildingcompany.employees.ResidentialContractor;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public abstract class ConcreteWork extends ResidentialContractor {

    private String name;
    private String nameOfCompany;
    private double measurements;
    private boolean correctAmountGathered;

    public ConcreteWork(String name, String contractorCompany) {
        super(name, contractorCompany);
    }

    protected abstract void planConcreteMeasurements();
    protected abstract void mixAndPourConcrete() throws IOException;
    protected abstract void spreadConcrete();
    protected abstract void shapeConcrete();
    protected abstract HashMap<String, Date> monitorDryingProcess();

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
        this.nameOfCompany= nameOfCompany;
    }

    public double getMeasurements() {
        return measurements;
    }

    public void setMeasurements(double measurements) {
        this.measurements = measurements;
    }

    public boolean isCorrectAmountGathered() {
        return correctAmountGathered;
    }

    public void setCorrectAmountGathered(boolean correctAmountGathered) {
        this.correctAmountGathered = correctAmountGathered;
    }
}
