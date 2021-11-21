package com.solvd.thebuildingcompany.architectemployees;

import com.solvd.thebuildingcompany.departments.Architecture;

import java.util.*;
import java.util.logging.Logger;

public class ResidentialArchitect extends Architecture {

    private final Logger logger = Logger.getLogger(ResidentialArchitect.class.getName());

    public ResidentialArchitect(String name) {
        this.setName(name);
    }

    @Override
    protected ArrayList<String> projectDiscussions() {
        final ResidentialArchitect penny = new ResidentialArchitect("Penny");
        final ResidentialArchitect cooper = new ResidentialArchitect("Cooper");
        final ResidentialArchitect preston = new ResidentialArchitect("Preston");
        final ResidentialArchitect suzan = new ResidentialArchitect("Suzan");

        penny.setDiscussionHad(true);
        cooper.setContractHonored(true);
        preston.setSafetyCheck(true);
        suzan.setRegulationsMet(true);

        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add(penny.getName() + "" + cooper.getName() + " " + "met with the Engineering Team: " + penny.isDiscussionHad());
        projectSetups.add("Met Client Requirements: " + cooper.isContractHonored());
        projectSetups.add("Estimated completion date: " + date.getTime());

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

        return projectSetups;
    }

    @Override
    protected ArrayList<String> documentationAndDrawings() {
        final ResidentialArchitect collin = new ResidentialArchitect("Collin");
        final ResidentialArchitect jay = new ResidentialArchitect("Jay");
        final ResidentialArchitect bradly = new ResidentialArchitect("Bradly");

        collin.setContractHonored(true);
        jay.setDesignPlan("Please use AutoCad to complete blueprint.");
        bradly.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Met Client Requirements: " + collin.isContractHonored());
        basicDesignNeeds.add("Instructions: " + jay.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + bradly.isRedrawingNeeded());

        for (String requirements : basicDesignNeeds) {
            logger.info(requirements);
        }

        return basicDesignNeeds;
    }

    @Override
    protected String costEstimation() {
        final ResidentialArchitect shelly = new ResidentialArchitect("Shelly");

        shelly.setMaterialCost(72000.00);

        logger.info("The total cost of the materials was $" + shelly.getMaterialCost());

        return "The total cost of the materials was $" + shelly.getMaterialCost();
    }

    @Override
    protected String contracts() {
        final ResidentialArchitect greggory = new ResidentialArchitect("Greggory");
        greggory.setAnalysisReport("PQR is in good standing");
        final ArrayList<String> contractorsChosen = new ArrayList<>();
        contractorsChosen.add("Contractor PQR");

        logger.info("After conversing with " + contractorsChosen + " the current contract " + greggory.getAnalysisReport());

        return "After conversing with " + contractorsChosen + " the current contract " + greggory.getAnalysisReport();
    }

    @Override
    protected HashMap<String, Boolean> constructionStage() {
        final Architect megan = new Architect("Megan");
        final Architect andrea = new Architect("Andrea");
        final Architect hannah = new Architect("Hannah");

        megan.setRenegotiation(true);
        andrea.setRenegotiation(false);
        hannah.setRenegotiation(false);

        final ArrayList<String> siteInspections = new ArrayList<>();
        siteInspections.add("New Jersey");
        siteInspections.add("New York");
        siteInspections.add("California");

        for (String placesToVisit : siteInspections) {
            logger.info(placesToVisit);
        }

        final HashMap<String, String> siteInspect = new HashMap<>();
        siteInspect.put("Princeton", "New Jersey");
        siteInspect.put("Brooklyn", "New York");
        siteInspect.put("Los Angeles", "California");

        for (Map.Entry<String, String> set : siteInspect.entrySet()) {
            logger.info(set.getKey());
        }

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
