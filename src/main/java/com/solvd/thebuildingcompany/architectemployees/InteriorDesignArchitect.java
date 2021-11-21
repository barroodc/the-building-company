package com.solvd.thebuildingcompany.architectemployees;

import com.solvd.thebuildingcompany.departments.Architecture;

import java.util.*;
import java.util.logging.Logger;

public class InteriorDesignArchitect extends Architecture {

    private final Logger logger = Logger.getLogger(InteriorDesignArchitect.class.getName());

    public InteriorDesignArchitect(String name) {
        this.setName(name);
    }

    @Override
    protected ArrayList<String> projectDiscussions() {
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

    @Override
    protected ArrayList<String> documentationAndDrawings() {
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

    @Override
    protected String costEstimation() {
        final InteriorDesignArchitect janice = new InteriorDesignArchitect("Janice");
        janice.setName("Janice");
        janice.setMaterialCost(35000.00);

        logger.info("The total cost of the materials was $" + janice.getMaterialCost());

        return "The total cost of the materials was $" + janice.getMaterialCost();
    }

    @Override
    protected String contracts() {
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

    @Override
    protected HashMap<String, Boolean> constructionStage() {
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
}
