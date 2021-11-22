package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PlumbingEngineer extends Employees {

    private String name;
    private String statusReport;
    private boolean inspectionDone;
    private boolean correctSystem;
    private boolean correctEquipment;
    private boolean designDeveloped;
    private boolean plumbingActive;

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

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isCorrectSystem() {
        return correctSystem;
    }

    public void setCorrectSystem(boolean correctSystem) {
        this.correctSystem = correctSystem;
    }

    public boolean isCorrectEquipment() {
        return correctEquipment;
    }

    public void setCorrectEquipment(boolean correctEquipment) {
        this.correctEquipment = correctEquipment;
    }

    public boolean isDesignDeveloped() {
        return designDeveloped;
    }

    public void setDesignDeveloped(boolean designDeveloped) {
        this.designDeveloped = designDeveloped;
    }

    public boolean isPlumbingActive() {
        return plumbingActive;
    }

    public void setPlumbingActive(boolean plumbingActive) {
        this.plumbingActive = plumbingActive;
    }

    private final Logger logger = Logger.getLogger(PlumbingEngineer.class.getName());

    public PlumbingEngineer(String name) {
        this.setName(name);
    }

    private HashMap<String, Boolean> evaluationPerformed() {
        final PlumbingEngineer charles = new PlumbingEngineer("Charles");
        HashMap<String, Boolean> projectEvaluation = new HashMap<>();
        projectEvaluation.put("Holistic Plumbing Evaluation Check", true);
        if (projectEvaluation.containsValue(true)){
            charles.setStatusReport("I give my approval that this evaluation was performed honestly");
        }
        HashMap<String, Boolean> projectComments = new HashMap<>();
        projectComments.put(charles.getStatusReport(), true);

        for (Map.Entry<String, Boolean> set : projectComments.entrySet()) {
            logger.info(set.getKey());
        }

        return projectComments;
    }

    private HashMap<String, String> developmentStage() {
        final PlumbingEngineer dennis = new PlumbingEngineer("Dennis");
        final PlumbingEngineer kevin = new PlumbingEngineer("Kevin");
        final PlumbingEngineer thomas = new PlumbingEngineer("Thomas");

        HashMap<String, String> nameAndJob = new HashMap<>();
        nameAndJob.put(dennis.getName() , "Design");
        nameAndJob.put(kevin.getName() , "Planning");
        nameAndJob.put(thomas.getName() , "Implementation");

        for (Map.Entry<String, String> set : nameAndJob.entrySet()) {
            logger.info(set.getKey());
        }

        return nameAndJob;
    }
    private HashMap<String, Boolean> testType() {
        final PlumbingEngineer jasmin = new PlumbingEngineer("Jasmin");
        final PlumbingEngineer terry = new PlumbingEngineer("Terry");
        final PlumbingEngineer velma = new PlumbingEngineer("Velma");

        HashMap<String, Boolean> testingPerformed = new HashMap<>();
        testingPerformed.put("Water line test in east wing performed by " + jasmin.getName(), true);
        testingPerformed.put("Water line test in south wing performed by " + terry.getName(), true);
        testingPerformed.put("Sewage line test in east wing performed by " + velma.getName(), true);

        for (Map.Entry<String, Boolean> set : testingPerformed.entrySet()) {
            logger.info(set.getKey());
        }

        return testingPerformed;
    }

    private HashMap<String, String> changesMade() {
        final PlumbingEngineer richard = new PlumbingEngineer("Richard");
        final PlumbingEngineer scott = new PlumbingEngineer("Scott");

        HashMap<String, String> changedBy = new HashMap<>();
        changedBy.put("Changes made based of drawing submittals performed by ", richard.getName());

        changedBy.put("New plumbing system implementations based off updated blue print performed by", scott.getName());

        for (Map.Entry<String, String> set : changedBy.entrySet()) {
            logger.info(set.getKey());
        }

        return changedBy;
    }

    private HashMap<String, Boolean> installComplete() {
        final PlumbingEngineer patrice = new PlumbingEngineer("Patrice");
        final PlumbingEngineer bianca = new PlumbingEngineer("Bianca");

        HashMap<String, Boolean> plumbingInstallations = new HashMap<>();
        plumbingInstallations.put(patrice.getName() + " installation of pipes done", true);
        plumbingInstallations.put(bianca.getName() + "installation of fixtures done", true);

        for (Map.Entry<String, Boolean> set : plumbingInstallations.entrySet()) {
            logger.info(set.getKey());
        }

        return plumbingInstallations;
    }

    private HashMap<String, Boolean> inspectionCheck() {
        final PlumbingEngineer henry = new PlumbingEngineer("Henry");
        final PlumbingEngineer tommy = new PlumbingEngineer("Tommy");

        HashMap<String, Boolean> inspectionComplete = new HashMap<>();
        inspectionComplete.put(henry.getName() + "inspection of pumps and boiler system checked: ", henry.isInspectionDone());
        inspectionComplete.put(tommy.getName() + "inspection of valves checked: ", tommy.isInspectionDone());

        for (Map.Entry<String, Boolean> set : inspectionComplete.entrySet()) {
            logger.info(set.getKey());
        }

        return inspectionComplete;
    }

    private HashMap<String, Boolean> plumbingSystemDesign() {
        final PlumbingEngineer diane = new PlumbingEngineer("Diane");
        diane.setCorrectSystem(true);
        diane.setCorrectEquipment(true);
        diane.setDesignDeveloped(true);

        HashMap<String, Boolean> designProgress = new HashMap<>();
        designProgress.put("Appropriate System Selected: ", diane.isCorrectSystem());
        designProgress.put("Appropriate Equipment Selected: ", diane.isCorrectEquipment());
        designProgress.put("Design Developed Successfully ", diane.isDesignDeveloped());

        for (Map.Entry<String, Boolean> set : designProgress.entrySet()) {
            logger.info(set.getKey());
        }

        return designProgress;
    }

    private String plumbingSystemStatus() {
        final PlumbingEngineer casey = new PlumbingEngineer("Casey");
        casey.setPlumbingActive(true);

        logger.info("Plumbing System Active: " + casey.isPlumbingActive());

        return "Plumbing System Active: " + casey.isPlumbingActive();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
