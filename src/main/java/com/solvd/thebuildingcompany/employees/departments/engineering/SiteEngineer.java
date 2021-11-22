package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SiteEngineer extends Employees {

    private String name;
    private String statusReport;
    private boolean inspectionPassed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }

    public boolean isInspectionPassed() {
        return inspectionPassed;
    }

    public void setInspectionPassed(boolean inspectionPassed) {
        this.inspectionPassed = inspectionPassed;
    }

    private final Logger logger = Logger.getLogger(SiteEngineer.class.getName());

    public SiteEngineer(String name) {
        this.setName(name);
    }

    private HashMap<String, Boolean> evaluationPerformed() {
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

    private HashMap<String, String> developmentStage() {
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

    private HashMap<String, Boolean> testType() {
        return null;
    }

    private HashMap<String, String> changesMade() {
        return null;
    }

    private HashMap<String, Boolean> installComplete() {
        return null;
    }

    private HashMap<String, Boolean> inspectionCheck() {
        return null;
    }

    private HashMap<String, Boolean> siteInspections() {
        final SiteEngineer brianna = new SiteEngineer("Brianna");
        brianna.setInspectionPassed(true);

        HashMap<String, Boolean> approvedSite = new HashMap<>();
        approvedSite.put("Brooklyn neighborhood is approved for construction", brianna.isInspectionPassed());

        for (Map.Entry<String, Boolean> set : approvedSite.entrySet()) {
            logger.info(set.getKey());
        }

        return approvedSite;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
