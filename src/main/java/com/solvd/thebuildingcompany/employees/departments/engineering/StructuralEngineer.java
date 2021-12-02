package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.*;
import java.util.logging.Logger;

public class StructuralEngineer extends Employee {

    private String name;
    private boolean materialTested;
    private boolean passingTestResult;
    private boolean testingPerformed;
    private boolean areaBuildReady;
    private boolean timelyDelivery;
    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isMaterialTested() {
        return materialTested;
    }

    public void setMaterialTested(final boolean materialTested) {
        this.materialTested = materialTested;
    }

    public boolean isPassingTestResult() {
        return passingTestResult;
    }

    public void setPassingTestResult(final boolean passingTestResult) {
        this.passingTestResult = passingTestResult;
    }

    public boolean isTestingPerformed() {
        return testingPerformed;
    }

    public void setTestingPerformed(final boolean testingPerformed) {
        this.testingPerformed = testingPerformed;
    }

    public boolean isAreaBuildReady() {
        return areaBuildReady;
    }

    public void setAreaBuildReady(final boolean areaBuildReady) {
        this.areaBuildReady = areaBuildReady;
    }

    public boolean isTimelyDelivery() {
        return timelyDelivery;
    }

    public void setTimelyDelivery(final boolean timelyDelivery) {
        this.timelyDelivery = timelyDelivery;
    }

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

    public boolean isSafetyCheck() {
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

    private final Logger logger = Logger.getLogger(StructuralEngineer.class.getName());

    public StructuralEngineer(final String name) {
        this.setName(name);
    }

    private HashMap<String, Boolean> evaluationPerformed() {
        return null;
    }

    private HashMap<String, String> developmentStage() {
        return null;
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


    private ArrayList<String> projectDiscussions(){

        final StructuralEngineer andrew = new StructuralEngineer("Andrew");
        final StructuralEngineer naomi = new StructuralEngineer("Naomi");
        final StructuralEngineer kelsey = new StructuralEngineer("Kelsey");
        final StructuralEngineer brianna = new StructuralEngineer("Brianna");

        andrew.setDiscussionHad(true);
        naomi.setContractHonored(true);
        kelsey.setSafetyCheck(true);
        brianna.setRegulationsMet(true);

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Structural Engineers " + andrew.getName() + " " +  "and" + " " + naomi.getName() + " " + "met with the Engineering Team: " + andrew.isDiscussionHad());

        projectSetups.forEach(logger::info);

        return projectSetups;

    }

    private HashMap<String, Boolean> buildingMaterialTesting() {
        final StructuralEngineer clarissa = new StructuralEngineer("Clarissa");
        clarissa.setMaterialTested(true);
        clarissa.setPassingTestResult(true);

        HashMap<String, Boolean> materials = new HashMap<>();
        materials.put("Stone tested: ", clarissa.isMaterialTested());
        materials.put("Stone received a passing score: ", clarissa.isPassingTestResult());

        materials.forEach((key, value) -> logger.info(key));

        return materials;
    }

    private void structureStressTest() {
        final StructuralEngineer tyler = new StructuralEngineer("Tyler");
        tyler.setTestingPerformed(true);
        tyler.setPassingTestResult(true);

        logger.info("Structure Stress Test Performed: " + tyler.isTestingPerformed());
        logger.info("Structure Stress Test Passed: " + tyler.isPassingTestResult());
    }

    private void landSuitability() {
        final StructuralEngineer rachel = new StructuralEngineer("Rachel");
        rachel.setAreaBuildReady(false);

        final ArrayList<String> issuesWithLand = new ArrayList<>();
        issuesWithLand.add("In an area known for fracking.");
        issuesWithLand.add("Locals are not happy about construction endeavors.");

        logger.info("Land is suitable for project: " + rachel.isAreaBuildReady());
        logger.info("Current issues with land: " + issuesWithLand);
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
