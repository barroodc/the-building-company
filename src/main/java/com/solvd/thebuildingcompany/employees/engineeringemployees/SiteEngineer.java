package com.solvd.thebuildingcompany.employees.engineeringemployees;

import com.solvd.thebuildingcompany.departments.Engineering;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SiteEngineer extends Engineering {

    private final Logger logger = Logger.getLogger(SiteEngineer.class.getName());

    public SiteEngineer(String name) {
        this.setName(name);
    }

    @Override
    protected HashMap<String, Boolean> evaluationPerformed() {
        final SiteEngineer christoph = new SiteEngineer("Christoph");
        HashMap<String, Boolean> projectEvaluation = new HashMap<>();
        projectEvaluation.put("Holistic Site Evaluation Check", true);
        if (projectEvaluation.containsValue(true)){
            christoph.setStatusReport("I give my approval that this evaluation was performed honestly");
        }

        for (Map.Entry<String, Boolean> set : projectEvaluation.entrySet()) {
            logger.info(set.getKey());
        }

        HashMap<String, Boolean> projectComments = new HashMap<>();
        projectComments.put(christoph.getStatusReport(), true);

        for (Map.Entry<String, Boolean> set : projectComments.entrySet()) {
            logger.info(set.getKey());
        }

        return projectComments;
    }

    @Override
    protected HashMap<String, String> developmentStage() {
        final SiteEngineer zachary = new SiteEngineer("Zachary");
        final SiteEngineer trevor = new SiteEngineer("Trevor");
        final SiteEngineer dimitri = new SiteEngineer("Dimitri");

        HashMap<String, String> nameAndJob = new HashMap<>();
        nameAndJob.put(zachary.getName() , "Design");
        nameAndJob.put(trevor.getName() , "Planning");
        nameAndJob.put(dimitri.getName() , "Implementation");

        for (Map.Entry<String, String> set : nameAndJob.entrySet()) {
            logger.info(set.getKey());
        }

        return nameAndJob;
    }

    @Override
    protected HashMap<String, Boolean> testType() {
        return null;
    }

    @Override
    protected HashMap<String, String> changesMade() {
        return null;
    }

    @Override
    protected HashMap<String, Boolean> installComplete() {
        return null;
    }

    @Override
    protected HashMap<String, Boolean> inspectionCheck() {
        return null;
    }

    protected HashMap<String, Boolean> siteInspections() {
        final SiteEngineer brianna = new SiteEngineer("Brianna");
        brianna.setInspectionPassed(true);

        HashMap<String, Boolean> approvedSite = new HashMap<>();
        approvedSite.put("Brooklyn neighborhood is approved for construction", brianna.isInspectionPassed());

        for (Map.Entry<String, Boolean> set : approvedSite.entrySet()) {
            logger.info(set.getKey());
        }

        return approvedSite;
    }
}
