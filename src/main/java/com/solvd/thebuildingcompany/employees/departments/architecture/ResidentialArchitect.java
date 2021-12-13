package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.*;
import java.util.logging.Logger;

public class ResidentialArchitect extends Employee {

    private static final Logger logger = Logger.getLogger(ResidentialArchitect.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private String designPlan;
    private boolean redrawingNeeded;
    private ArrayList<String> projectSetups;

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

    //Optional example
    public Optional <ArrayList<String>> getProjectSetups() {
        return Optional.of(projectSetups);
    }

    public void setProjectSetups(ArrayList<String> projectSetups) {
        this.projectSetups = projectSetups;
    }

    public ResidentialArchitect(String name, String nameOfCompany){
        super(name, nameOfCompany);
    }

    public ResidentialArchitect(final String name) {
        this.setName(name);
    }

    //Optional example

    private ArrayList<String> projectDiscussions() {
        final ResidentialArchitect penny = new ResidentialArchitect("Penny","The Building Company");
        final ResidentialArchitect cooper = new ResidentialArchitect("Cooper", "The Building Company");
        final ResidentialArchitect preston = new ResidentialArchitect("Preston", "The Building Company");
        final ResidentialArchitect suzan = new ResidentialArchitect("Suzan", "The Building Company");

        penny.setDiscussionHad(true);
        cooper.setContractHonored(true);
        preston.setSafetyCheck(true);
        suzan.setRegulationsMet(true);

        //projectSetups is the optional example. Reference getters/setters to further understand implementation.
        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Residential Architects " + penny.getName() + " " +  "and" + " " + cooper.getName() + " " + "met with the Engineering Team: " + penny.isDiscussionHad());
        projectSetups.add("Met with clients and met their requirements: " + cooper.isContractHonored());

        projectSetups.forEach(logger::info);

        if (getProjectSetups().isPresent()){
            logger.info("All required meetings for preconstruction are completed for Residential Architects.");
        } else {
            logger.info("Please perform required meetings before beginning any project related work.");
        }

        return projectSetups;
    }

    private ArrayList<String> documentationAndDrawings() {
        final ResidentialArchitect collin = new ResidentialArchitect("Collin", "The Building Company");
        final ResidentialArchitect jay = new ResidentialArchitect("Jay", "The Building Company");
        final ResidentialArchitect bradly = new ResidentialArchitect("Bradly", "The Building Company");
        logger.info("Entering blueprint drawing stage for Sycamore Village.");
        logger.info("documentation of blueprints stage: ");
        collin.setContractHonored(true);
        jay.setDesignPlan("Using AutoCad to complete exterior blueprint.");
        bradly.setRedrawingNeeded(true);

        final ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Instructions: " + jay.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + !bradly.isRedrawingNeeded());

        basicDesignNeeds.forEach(logger::info);

        return basicDesignNeeds;
    }


}
