package com.solvd.thebuildingcompany.departments;

import java.util.HashMap;

public abstract class EngineeringManagement {

    //unsure of how to connect this to Engineering class
    //This is a unique position.
    //Engineers don't have these privileges. So how do I connect them?
    //Not exactly an engineer. They just really manage the engineers.

    private double costEstimates;
    private boolean riskAverse;
    private double laborCalculation;
    private double costEstimate;
    private boolean agreementSigned;
    private String name;

    protected abstract HashMap<String, Boolean> riskAnalysis();
    protected abstract String laborEstimate();
    protected abstract String costEstimate();
    protected abstract HashMap<String, Boolean> negotiateServiceAgreements();

    public double getCostEstimates() {
        return costEstimates;
    }

    public void setCostEstimates(double costEstimates) {
        this.costEstimates = costEstimates;
    }

    public boolean isRiskAverse() {
        return riskAverse;
    }

    public void setRiskAverse(boolean riskAverse) {
        this.riskAverse = riskAverse;
    }

    public double getLaborCalculation() {
        return laborCalculation;
    }

    public void setLaborCalculation(double laborCalculation) {
        this.laborCalculation = laborCalculation;
    }

    public double getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public boolean isAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
