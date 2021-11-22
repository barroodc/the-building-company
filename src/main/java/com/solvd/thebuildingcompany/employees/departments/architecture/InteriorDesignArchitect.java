package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.*;
import java.util.logging.Logger;

public class InteriorDesignArchitect extends Employees {

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

    private final Logger logger = Logger.getLogger(InteriorDesignArchitect.class.getName());

    public InteriorDesignArchitect(String name) {
        this.setName(name);
    }

    private ArrayList<String> projectDiscussions() {
        final InteriorDesignArchitect baxter = new InteriorDesignArchitect("Baxter");
        final InteriorDesignArchitect jack = new InteriorDesignArchitect("Jack");
        final InteriorDesignArchitect carter = new InteriorDesignArchitect("Carter");
        final InteriorDesignArchitect scarlett = new InteriorDesignArchitect("Scarlett");

        baxter.setDiscussionHad(true);
        jack.setContractHonored(true);
        carter.setSafetyCheck(true);
        scarlett.setRegulationsMet(true);

        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();

        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add(baxter.getName() + "" + jack.getName() + " " + "met with the Engineering Team: " + baxter.isDiscussionHad());
        projectSetups.add("Met Client Requirements: " + jack.isContractHonored());
        projectSetups.add("Estimated completion date: " + date.getTime());

        for (String project : projectSetups) {
            logger.info(project);
        }
        return projectSetups;
    }

    private ArrayList<String> documentationAndDrawings() {
        final InteriorDesignArchitect andre = new InteriorDesignArchitect("Andre");
        final InteriorDesignArchitect claude = new InteriorDesignArchitect("Claude");
        final InteriorDesignArchitect nicholas = new InteriorDesignArchitect("Nicholas");

        andre.setContractHonored(true);
        claude.setDesignPlan("Please use AutoCad to complete blueprint.");
        nicholas.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Met Client Requirements: " + andre.isContractHonored());
        basicDesignNeeds.add("Instructions: " + claude.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + nicholas.isRedrawingNeeded());

        for (String design : basicDesignNeeds) {
            logger.info(design);
        }

        return basicDesignNeeds;
    }

    private String costEstimation() {
        final InteriorDesignArchitect janice = new InteriorDesignArchitect("Janice");
        janice.setName("Janice");
        janice.setMaterialCost(35000.00);

        logger.info("The total cost of the materials was $" + janice.getMaterialCost());

        return "The total cost of the materials was $" + janice.getMaterialCost();
    }

    private String contracts() {
        final InteriorDesignArchitect christopher = new InteriorDesignArchitect("Christopher");
        christopher.setAnalysisReport("JKL is in good standing");
        final ArrayList<String> contractorsChosen = new ArrayList<>();
        contractorsChosen.add("Contractor JKL");

        for (String contractors : contractorsChosen) {
            logger.info(contractors);
        }

        logger.info("After conversing with " + contractorsChosen.get(0) + " the current contract " + christopher.getAnalysisReport());

        return "After conversing with " + contractorsChosen.get(0) + " the current contract " + christopher.getAnalysisReport();
    }

    private HashMap<String, Boolean> constructionStage() {
        final InteriorDesignArchitect jessica = new InteriorDesignArchitect("Jessica");
        final InteriorDesignArchitect betty = new InteriorDesignArchitect("Betty");
        final InteriorDesignArchitect margaret = new InteriorDesignArchitect("Margaret");

        jessica.setRenegotiation(true);
        betty.setRenegotiation(false);
        margaret.setRenegotiation(false);

        final ArrayList<String> siteInspections = new ArrayList<>();
        siteInspections.add("New Jersey");
        siteInspections.add("New York");
        siteInspections.add("California");

        final HashMap<String, String> siteInspect = new HashMap<>();
        siteInspect.put("Princeton", "New Jersey");
        siteInspect.put("Brooklyn", "New York");
        siteInspect.put("Los Angeles", "California");

        final HashMap<String, Boolean> feedBack = new HashMap<>();
        feedBack.put("Princeton Property Inspected: ", false);
        feedBack.put("Brooklyn Property Inspected ", false);
        feedBack.put("Los Angeles Property Inspected ", false);

        for (Map.Entry<String, Boolean> set : feedBack.entrySet()) {
            logger.info(set.getKey());
        }

        return feedBack;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
