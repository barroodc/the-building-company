package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.*;
import java.util.logging.Logger;

public class ResidentialArchitect extends Employee {

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private String designPlan;
    private boolean redrawingNeeded;
    private double materialCost;
    private String analysisReport;
    private boolean renegotiation;
    private String name;

    public boolean isDiscussionHad() {
        return discussionHad;
    }

    public void setDiscussionHad(final boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public void setContractHonored(final boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public boolean isSafetyCheckt() {
        return safetyCheck;
    }

    public void setSafetyCheck(final boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(final boolean regulationsMet) {
        this.regulationsMet = regulationsMet;
    }

    public String getDesignPlan() {
        return designPlan;
    }

    public void setDesignPlan(final String designPlan) {
        this.designPlan = designPlan;
    }

    public boolean isRedrawingNeeded() {
        return redrawingNeeded;
    }

    public void setRedrawingNeeded(final boolean redrawingNeeded) {
        this.redrawingNeeded = redrawingNeeded;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(final double materialCost) {
        this.materialCost = materialCost;
    }

    public String getAnalysisReport() {
        return analysisReport;
    }

    public void setAnalysisReport(final String analysisReport) {
        this.analysisReport = analysisReport;
    }

    public boolean isRenegotiation() {
        return renegotiation;
    }

    public void setRenegotiation(final boolean renegotiation) {
        this.renegotiation = renegotiation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(ResidentialArchitect.class.getName());

    public ResidentialArchitect(final String name) {
        this.setName(name);
    }

    private ArrayList<String> projectDiscussions() {
        final ResidentialArchitect penny = new ResidentialArchitect("Penny");
        final ResidentialArchitect cooper = new ResidentialArchitect("Cooper");
        final ResidentialArchitect preston = new ResidentialArchitect("Preston");
        final ResidentialArchitect suzan = new ResidentialArchitect("Suzan");

        penny.setDiscussionHad(true);
        cooper.setContractHonored(true);
        preston.setSafetyCheck(true);
        suzan.setRegulationsMet(true);


        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Residential Architects " + penny.getName() + " " +  "and" + " " + cooper.getName() + " " + "met with the Engineering Team: " + penny.isDiscussionHad());
        projectSetups.add("Met with clients and met their requirements: " + cooper.isContractHonored());

        projectSetups.forEach(logger::info);

        return projectSetups;
    }

    private ArrayList<String> documentationAndDrawings() {
        final ResidentialArchitect collin = new ResidentialArchitect("Collin");
        final ResidentialArchitect jay = new ResidentialArchitect("Jay");
        final ResidentialArchitect bradly = new ResidentialArchitect("Bradly");
        logger.info("Entering blueprint drawing stage for Sycamore Village.");
        logger.info("documentation of blueprints stage: ");
        collin.setContractHonored(true);
        jay.setDesignPlan("Using AutoCad to complete exterior blueprint.");
        bradly.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Instructions: " + jay.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + !bradly.isRedrawingNeeded());

        basicDesignNeeds.forEach(logger::info);

        return basicDesignNeeds;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
