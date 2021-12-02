package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class EngineerManager extends Employee {

    private double costEstimates;
    private boolean riskAverse;
    private double laborCalculation;
    private double costEstimate;
    private boolean agreementSigned;
    private String name;

    public double getCostEstimates() {
        return costEstimates;
    }

    public double setCostEstimates(final double costEstimates) {
        this.costEstimates = costEstimates;
        return costEstimates;
    }

    public boolean isRiskAverse() {
        return riskAverse;
    }

    public void setRiskAverse(final boolean riskAverse) {
        this.riskAverse = riskAverse;
    }

    public double getLaborCalculation() {
        return laborCalculation;
    }

    public void setLaborCalculation(final double laborCalculation) {
        this.laborCalculation = laborCalculation;
    }

    public double getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(final double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public boolean isAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(final boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(EngineerManager.class.getName());

    public EngineerManager(final String name) {
        this.setName(name);
    }

    private HashMap<String, Boolean> riskAnalysis() {
        final EngineerManager chris = new EngineerManager("Chris");
        chris.setCostEstimates(20000000.00);
        chris.setRiskAverse(true);

        HashMap<String, Double> rebuildCost = new HashMap<>();
        rebuildCost.put("Estimated cost to rebuild any of the projects: ", chris.getCostEstimates());

        for (Map.Entry<String, Double> set : rebuildCost.entrySet()) {
            logger.info(set.getKey() + set.getValue());
        }

        HashMap<String, Boolean> riskLevel = new HashMap<>();
        riskLevel.put("Risk averse if the deal loses money?: ", chris.isRiskAverse());

        for (Map.Entry<String, Boolean> set : riskLevel.entrySet()) {
            logger.info(set.getKey() + set.getValue());
        }

        return riskLevel;
    }

    private String laborEstimate() {
        final EngineerManager jessica = new EngineerManager("Jessica");
        jessica.setLaborCalculation(5000000);

        logger.info("Total amount required to compensate new hired crew: $" + jessica.getLaborCalculation());

        return "Total amount required to compensate new hired crew: $" + jessica.getLaborCalculation();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
