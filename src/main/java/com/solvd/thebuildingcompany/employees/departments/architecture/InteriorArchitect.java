package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class InteriorArchitect extends Employee {

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

    public void setDiscussionHad(boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public void setContractHonored(boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public boolean isSafetyCheckt() {
        return safetyCheck;
    }

    public void setSafetyCheck(boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(boolean regulationsMet) {
        this.regulationsMet = regulationsMet;
    }

    public String getDesignPlan() {
        return designPlan;
    }

    public void setDesignPlan(String designPlan) {
        this.designPlan = designPlan;
    }

    public boolean isRedrawingNeeded() {
        return redrawingNeeded;
    }

    public void setRedrawingNeeded(boolean redrawingNeeded) {
        this.redrawingNeeded = redrawingNeeded;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public String getAnalysisReport() {
        return analysisReport;
    }

    public void setAnalysisReport(String analysisReport) {
        this.analysisReport = analysisReport;
    }

    public boolean isRenegotiation() {
        return renegotiation;
    }

    public void setRenegotiation(boolean renegotiation) {
        this.renegotiation = renegotiation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(InteriorArchitect.class.getName());

    public InteriorArchitect(String name) {
        this.setName(name);
    }


    private ArrayList<String> projectDiscussions() {
        final InteriorArchitect michael = new InteriorArchitect("Michael");
        final InteriorArchitect stacy = new InteriorArchitect("Stacy");
        final InteriorArchitect jessica = new InteriorArchitect("Jessica");
        final InteriorArchitect jonathan = new InteriorArchitect("Jonathan");
        michael.setDiscussionHad(true);
        stacy.setContractHonored(true);
        jessica.setSafetyCheck(true);
        jonathan.setRegulationsMet(true);


        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Interior Architects " + michael.getName() + " " +  "and" + " " + stacy.getName() + " " + "met with the Engineering Team: " + michael.isDiscussionHad());
        projectSetups.add("Met with clients and met their requirements: " + stacy.isContractHonored());

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

        return projectSetups;

    }

    private ArrayList<String> documentationAndDrawings() {
        final InteriorArchitect sarah = new InteriorArchitect("Sarah");
        final InteriorArchitect francis = new InteriorArchitect("Francis");
        final InteriorArchitect wade = new InteriorArchitect("Wade");
        sarah.setContractHonored(true);
        francis.setDesignPlan("Using AutoCad to complete interior blueprint.");
        wade.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Instructions: " + francis.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + !wade.isRedrawingNeeded());

        for (String requirements : basicDesignNeeds) {
            logger.info(requirements);
        }

        return basicDesignNeeds;
    }


    @Override
    protected Double earnings() {
        return null;
    }
}