package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CivilEngineer extends Employees {

    private String statusReport;
    private String name;
    private Double projectCompleted; // need to rename this variable to something with a percentage.
    private boolean inspectionDone;
    private boolean permitSent;
    private boolean setPermitAccepted;
    private boolean softwareInstalled;

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProjectCompleted() {
        return projectCompleted;
    }

    public void setProjectCompleted(double projectCompleted) {
        this.projectCompleted = projectCompleted;
    }

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isPermitSent() {
        return permitSent;
    }

    public void setPermitSent(boolean permitSent) {
        this.permitSent = permitSent;
    }

    public boolean isSetPermitAccepted() {
        return setPermitAccepted;
    }

    public void setSetPermitAccepted(boolean setPermitAccepted) {
        this.setPermitAccepted = setPermitAccepted;
    }

    public boolean isSoftwareInstalled() {
        return softwareInstalled;
    }

    public void setSoftwareInstalled(boolean softwareInstalled) {
        this.softwareInstalled = softwareInstalled;
    }

    private final Logger logger = Logger.getLogger(CivilEngineer.class.getName());

    public CivilEngineer(String name) {
        this.setName(name);
    }

    private HashMap<String, Boolean> evaluationPerformed() {
        final CivilEngineer einstein = new CivilEngineer("Einstein");
        HashMap<String, Boolean> projectEvaluation = new HashMap<>();
        projectEvaluation.put("Project Evaluation", true);
        if (projectEvaluation.containsValue(true)){
            einstein.setStatusReport("I give my approval that this evaluation was performed honestly");
        }
        HashMap<String, Boolean> projectComments = new HashMap<>();
        projectComments.put(einstein.getStatusReport(), true);

        for (Map.Entry<String, Boolean> set : projectEvaluation.entrySet()) {
            logger.info(set.getKey());
        }
        return projectComments;
    }

    private HashMap<String, String> developmentStage() {
        final CivilEngineer randy = new CivilEngineer("Randy");
        final CivilEngineer greggory = new CivilEngineer("Greggory");
        final CivilEngineer harry = new CivilEngineer("Harry");

        HashMap<String, String> nameAndJob = new HashMap<>();
        nameAndJob.put(randy.getName() , "Design");
        nameAndJob.put(greggory.getName() , "Planning");
        nameAndJob.put(harry.getName() , "Implementation");

        for (Map.Entry<String, String> set : nameAndJob.entrySet()) {
            logger.info(set.getKey());
        }
        return nameAndJob;
    }

    private HashMap<String, Boolean> testType() {
        final CivilEngineer tony = new CivilEngineer("Tony");
        final CivilEngineer nancy = new CivilEngineer("Nancy");
        final CivilEngineer steven = new CivilEngineer("Steven");

        HashMap<String, Boolean> testingPerformed = new HashMap<>();
        testingPerformed.put("Cement Testing was performed by " + tony.getName(), true);
        testingPerformed.put("Unconfined Compression Test was performed by " + nancy.getName(), true);
        testingPerformed.put("Elongation Index Test For Aggregates was performed by " + steven.getName(), true);

        for (Map.Entry<String, Boolean> set : testingPerformed.entrySet()) {
            logger.info(set.getKey());
        }
        return testingPerformed;
    }

    private HashMap<String, String> changesMade() {
        final CivilEngineer chris = new CivilEngineer("Chris");
        final CivilEngineer marshall = new CivilEngineer("Marshall");

        HashMap<String, String> changedBy = new HashMap<>();
        changedBy.put("Corrections to the cement testing was performed by", chris.getName());
        changedBy.put("Corrections to the unconfined compression testing was performed by", marshall.getName());

        for (Map.Entry<String, String> set : changedBy.entrySet()) {
            logger.info(set.getKey());
        }
        return changedBy;
    }

    private HashMap<String, Boolean> installComplete() {
        final CivilEngineer garry = new CivilEngineer("Garry");
        final CivilEngineer antonio = new CivilEngineer("Antonio");

        HashMap<String, Boolean> structuralSoundness = new HashMap<>();
        structuralSoundness.put(garry.getName() + " floorOne done", true);
        structuralSoundness.put(antonio.getName() + "floor two done", true);

        for (Map.Entry<String, Boolean> set : structuralSoundness.entrySet()) {
            logger.info(set.getKey());
        }
        return structuralSoundness;
    }

    private HashMap<String, Boolean> inspectionCheck() {
        final CivilEngineer tracy = new CivilEngineer("Tracy");
        final CivilEngineer brian = new CivilEngineer("Brian");

        HashMap<String, Boolean> inspectionComplete = new HashMap<>();
        inspectionComplete.put(tracy.getName() + "power supply checked: ", tracy.isInspectionDone());
        inspectionComplete.put(brian.getName() + "sensors checked: ", brian.isInspectionDone());

        for (Map.Entry<String, Boolean> set : inspectionComplete.entrySet()) {
            logger.info(set.getKey());
        }

        return inspectionComplete;
    }

    protected HashMap<String, Double> infrastructureProgress() throws IOException {
        final CivilEngineer chelsea = new CivilEngineer("Chelsea");
        chelsea.setProjectCompleted(24.8);

        HashMap<String, Double> projectProgress = new HashMap<>();
        projectProgress.put("Brooklyn Project Percentage Completed: ",chelsea.getProjectCompleted());

        for (Map.Entry<String, Double> set : projectProgress.entrySet()) {
            logger.info(set.getKey());
        }
        return projectProgress;
    }

    protected HashMap<String, Boolean> permitApplications() {
        final CivilEngineer ilissa = new CivilEngineer("Ilissa");
        ilissa.setPermitSent(true);

        HashMap<String, Boolean> newYorkPermit = new HashMap<>();
        newYorkPermit.put("Construction permit request submitted:", ilissa.isPermitSent());
        newYorkPermit.put("Construction permit obtained: ", ilissa.isSetPermitAccepted());

        for (Map.Entry<String, Boolean> set : newYorkPermit.entrySet()) {
            logger.info(set.getKey());
        }

        return newYorkPermit;
    }

    protected String vendorSoftwareImplementation() {
        final CivilEngineer nate = new CivilEngineer("Nate");
        nate.setSoftwareInstalled(true);

        logger.info("All required software is installed: " + nate.isSoftwareInstalled());

        return "All required software is installed: " + nate.isSoftwareInstalled();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
