package com.solvd.thebuildingcompany.employees.departments.architecture;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.*;
import java.util.logging.Logger;

public class IndustrialArchitect extends Employees {

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

    private final Logger logger = Logger.getLogger(IndustrialArchitect.class.getName());

    public IndustrialArchitect(String name) {
        this.setName(name);
    }

    private ArrayList<String> projectDiscussions() {
        final IndustrialArchitect gavin = new IndustrialArchitect("Gavin");
        final IndustrialArchitect ryan = new IndustrialArchitect("Ryan");
        final IndustrialArchitect tobey = new IndustrialArchitect("Tobey");
        final IndustrialArchitect aurora = new IndustrialArchitect("Aurora");

        gavin.setDiscussionHad(true);
        ryan.setContractHonored(true);
        tobey.setSafetyCheck(true);
        aurora.setRegulationsMet(true);

        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add(gavin.getName() + "" + ryan.getName() + " " + "met with the Engineering Team: " + gavin.isDiscussionHad());
        projectSetups.add("Met Client Requirements: " + ryan.isContractHonored());
        projectSetups.add("Estimated completion date: " + date.getTime());

        for (String setTime : projectSetups) {
            logger.info(setTime);
        }

        return projectSetups;
    }

    private ArrayList<String> documentationAndDrawings() {
        final IndustrialArchitect craig = new IndustrialArchitect("Craig");
        final IndustrialArchitect nelson = new IndustrialArchitect("Nelson");
        final IndustrialArchitect jimmy = new IndustrialArchitect("Jimmy");

        craig.setContractHonored(true);
        nelson.setDesignPlan("Please use AutoCad to complete blueprint.");
        jimmy.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Met Client Requirements: " + craig.isContractHonored());
        basicDesignNeeds.add("Instructions: " + nelson.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + jimmy.isRedrawingNeeded());

        for (String honored : basicDesignNeeds) {
            logger.info(honored);
        }

        return basicDesignNeeds;
    }

    private String costEstimation() {
        final IndustrialArchitect corey = new IndustrialArchitect("Corey");
        corey.setMaterialCost(20000.00);

        logger.info("The total cost of the materials was $" + corey.getMaterialCost());

        return "The total cost of the materials was $" + corey.getMaterialCost();
    }

    private String contracts() {
        final IndustrialArchitect eugene = new IndustrialArchitect("Eugene");
        eugene.setAnalysisReport("GHI is in good standing");
        final ArrayList<String> contractorsChosen = new ArrayList<>();
        contractorsChosen.add("Contractor GHI");

        for (String selection : contractorsChosen) {
            logger.info(selection);
        }
        logger.info("After conversing with " + contractorsChosen.get(0) + " the current contract " + eugene.getAnalysisReport());

        return "After conversing with " + contractorsChosen.get(0) + " the current contract " + eugene.getAnalysisReport();
    }

    private HashMap<String, Boolean> constructionStage() {
        final IndustrialArchitect kayla = new IndustrialArchitect("Kayla");
        final IndustrialArchitect alexis = new IndustrialArchitect("Alexis");
        final IndustrialArchitect rose = new IndustrialArchitect("Rose");

        kayla.setRenegotiation(true);
        alexis.setRenegotiation(false);
        rose.setRenegotiation(false);

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
