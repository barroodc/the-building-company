package com.solvd.thebuildingcompany.employees.departments.riskmanagement;

import com.solvd.thebuildingcompany.employees.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

public class SafetyOfficer extends Employee {

    private double costRiskAnalysis;
    private boolean mitigationExists;
    private boolean riskListUpdated;
    private String name;

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

    private final Logger logger = Logger.getLogger(SafetyOfficer.class.getName());

    public SafetyOfficer(String name) {
        this.setName(name);
    }

    private String riskIdentification() {
        final SafetyOfficer evelyn = new SafetyOfficer("Evelyn");
        final ArrayList<String> risksIdentified = new ArrayList<>();
        risksIdentified.add("Labor shortages");
        risksIdentified.add("Health and safety hazards");
        risksIdentified.add("Change orders");

        for (String risks : risksIdentified) {
            logger.info(risks);
        }

        logger.info(evelyn.getName() + "'s list of current potential risks: " + risksIdentified);

        return evelyn.getName() + "'s list of current potential risks: " + risksIdentified;
    }

    private String riskAssessment() throws IOException {
        final SafetyOfficer rick = new SafetyOfficer("Rick");
        rick.setCostRiskAnalysis(500000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double cost = Integer.parseInt(reader.readLine());
        //need to fix this and implement cost.

        logger.info("We always have the potential at a minimum of losing at least: $" + rick.getCostRiskAnalysis());

        return "We always have the potential at a minimum of losing at least: $" + rick.getCostRiskAnalysis();
    }

    private String riskMitigation() {
        final SafetyOfficer irma = new SafetyOfficer("Irma");
        irma.setMitigationExists(true);

        logger.info("Mitigation plan exists: " + irma.isMitigationExists());

        return "Mitigation plan exists: " + irma.isMitigationExists();
    }

    private String riskMonitoring() {
        final SafetyOfficer benjamin = new SafetyOfficer("Benjamin");
        benjamin.setRiskListUpdated(true);

        logger.info("Risk list has been updated: " + benjamin.isRiskListUpdated());

        return "Risk list has been updated: " + benjamin.isRiskListUpdated();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
