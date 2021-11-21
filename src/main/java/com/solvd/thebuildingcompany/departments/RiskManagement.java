package com.solvd.thebuildingcompany.departments;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class RiskManagement {

    private double costRiskAnalysis;
    private boolean mitigationExists;
    private boolean riskListUpdated;
    private String name;

    protected abstract String riskIdentification();
    protected abstract String riskAssessment() throws FileNotFoundException, IOException;
    protected abstract String riskMitigation();
    protected abstract String riskMonitoring();



    public double getCostRiskAnalysis() {
        return costRiskAnalysis;
    }

    public void setCostRiskAnalysis(double costRiskAnalysis) {
        this.costRiskAnalysis = costRiskAnalysis;
    }

    public boolean isMitigationExists() {
        return mitigationExists;
    }

    public void setMitigationExists(boolean mitigationExists) {
        this.mitigationExists = mitigationExists;
    }

    public boolean isRiskListUpdated() {
        return riskListUpdated;
    }

    public void setRiskListUpdated(boolean riskListUpdated) {
        this.riskListUpdated = riskListUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
