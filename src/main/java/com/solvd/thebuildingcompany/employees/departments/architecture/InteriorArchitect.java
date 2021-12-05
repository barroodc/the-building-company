package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.ArrayList;
import java.util.logging.Logger;

public class InteriorArchitect extends Employee {

    private static final Logger logger = Logger.getLogger(InteriorArchitect.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private String designPlan;
    private boolean redrawingNeeded;


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

    public InteriorArchitect(String name, String nameOfCompany){
        super(name,nameOfCompany);
    }

    private ArrayList<String> projectDiscussions() {
        final InteriorArchitect michael = new InteriorArchitect("Michael", "The Building Company");
        final InteriorArchitect stacy = new InteriorArchitect("Stacy", "The Building Company");
        final InteriorArchitect jessica = new InteriorArchitect("Jessica", "The Building Company");
        final InteriorArchitect jonathan = new InteriorArchitect("Jonathan", "The Building Company");
        michael.setDiscussionHad(true);
        stacy.setContractHonored(true);
        jessica.setSafetyCheck(true);
        jonathan.setRegulationsMet(true);


        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Interior Architects " + michael.getName() + " " +  "and" + " " + stacy.getName() + " " + "met with the Engineering Team: " + michael.isDiscussionHad());
        projectSetups.add("Met with clients and met their requirements: " + stacy.isContractHonored());

        projectSetups.forEach(logger::info);

        return projectSetups;

    }

    private ArrayList<String> documentationAndDrawings() {
        final InteriorArchitect sarah = new InteriorArchitect("Sarah", "The Building Company");
        final InteriorArchitect francis = new InteriorArchitect("Francis", "The Building Company");
        final InteriorArchitect wade = new InteriorArchitect("Wade", "The Building Company");
        sarah.setContractHonored(true);
        francis.setDesignPlan("Using AutoCad to complete interior blueprint.");
        wade.setRedrawingNeeded(true);

        final ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Instructions: " + francis.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + !wade.isRedrawingNeeded());

        basicDesignNeeds.forEach(logger::info);

        return basicDesignNeeds;
    }

}
