package com.solvd.thebuildingcompany.architectemployees;

import com.solvd.thebuildingcompany.departments.Architecture;

import java.util.*;
import java.util.logging.Logger;

public class Architect extends Architecture {

    private final Logger logger = Logger.getLogger(Architect.class.getName());

    public Architect(String name){
        this.setName(name);
    }


    @Override
    protected ArrayList<String> projectDiscussions() {
        final Architect martin = new Architect("Martin");
        final Architect alexandra = new Architect("Alexandra");
        final Architect jeremy = new Architect("Jeremy");
        final Architect julia = new Architect("Julia");


        martin.setDiscussionHad(true);
        alexandra.setContractHonored(true);
        jeremy.setSafetyCheck(true);
        julia.setRegulationsMet(true);

        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add(martin.getName() + "" + alexandra.getName() + " " + "met with the Engineering Team: " + alexandra.isDiscussionHad());
        projectSetups.add("Met Client Requirements: " + alexandra.isContractHonored());
        projectSetups.add("Estimated completion date: " + date.getTime());

        logger.info(projectSetups.get(0));
        logger.info(projectSetups.get(1));
        logger.info(projectSetups.get(2)); //Couldnt get it to convert properly

        return projectSetups;
    }

    @Override
    protected ArrayList<String> documentationAndDrawings() {
        final Architect lilly = new Architect("Lilly");
        final Architect debra = new Architect("Debra");
        final Architect dexter = new Architect("Dexter");

        lilly.setContractHonored(true);
        debra.setDesignPlan("Please use AutoCad to complete blueprint.");
        dexter.setRedrawingNeeded(true);

        ArrayList<String> basicDesignNeeds = new ArrayList<>();
        basicDesignNeeds.add("Met Client Requirements: " + lilly.isContractHonored());
        basicDesignNeeds.add("Instructions: " + debra.getDesignPlan());
        basicDesignNeeds.add("Blueprint Redrawing Required: " + dexter.isRedrawingNeeded());

        logger.info(basicDesignNeeds.get(0));
        logger.info(basicDesignNeeds.get(1));
        logger.info(basicDesignNeeds.get(2));

        return basicDesignNeeds;
    }

    @Override
    protected String costEstimation() {
        final Architect marcus = new Architect("Marcus");
        marcus.setName("Marcus");
        marcus.setMaterialCost(50000.00);

        logger.info("The total cost of the materials was $" + marcus.getMaterialCost());

        return "The total cost of the materials was $" + marcus.getMaterialCost();
    }

    @Override
    protected String contracts() {
        final Architect daria = new Architect("Daria");
        daria.setAnalysisReport("XYZ is in good standing");
        final ArrayList<String> contractorsChosen = new ArrayList<>();
        contractorsChosen.add("Contractor XYZ");

        logger.info("After conversing with " + contractorsChosen + " the current contract " + daria.getAnalysisReport());

        return "After conversing with " + contractorsChosen + " the current contract " + daria.getAnalysisReport();
    }

    @Override
    protected HashMap<String, Boolean> constructionStage() {
        final Architect jackie = new Architect("Jackie");
        final Architect robert = new Architect("Robert");
        final Architect edward = new Architect("Edward");

        jackie.setRenegotiation(true);
        robert.setRenegotiation(false);
        edward.setRenegotiation(false);

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
