package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.*;
import java.util.logging.Logger;

public class StructuralEngineer extends Employees {

    private String name;
    private boolean materialTested;
    private boolean passingTestResult;
    private boolean testingPerformed;
    private boolean areaBuildReady;
    private boolean timelyDelivery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaterialTested() {
        return materialTested;
    }

    public void setMaterialTested(boolean materialTested) {
        this.materialTested = materialTested;
    }

    public boolean isPassingTestResult() {
        return passingTestResult;
    }

    public void setPassingTestResult(boolean passingTestResult) {
        this.passingTestResult = passingTestResult;
    }

    public boolean isTestingPerformed() {
        return testingPerformed;
    }

    public void setTestingPerformed(boolean testingPerformed) {
        this.testingPerformed = testingPerformed;
    }

    public boolean isAreaBuildReady() {
        return areaBuildReady;
    }

    public void setAreaBuildReady(boolean areaBuildReady) {
        this.areaBuildReady = areaBuildReady;
    }

    public boolean isTimelyDelivery() {
        return timelyDelivery;
    }

    public void setTimelyDelivery(boolean timelyDelivery) {
        this.timelyDelivery = timelyDelivery;
    }

    private final Logger logger = Logger.getLogger(StructuralEngineer.class.getName());

    public StructuralEngineer(String name) {
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

    private HashMap<String, Boolean> buildingMaterialTesting() {
        final StructuralEngineer clarissa = new StructuralEngineer("Clarissa");
        clarissa.setMaterialTested(true);
        clarissa.setPassingTestResult(true);

        HashMap<String, Boolean> materials = new HashMap<>();
        materials.put("Stone tested: ", clarissa.isMaterialTested());
        materials.put("Stone received a passing score: ", clarissa.isPassingTestResult());

        for (Map.Entry<String, Boolean> set : materials.entrySet()) {
            logger.info(set.getKey());
        }

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

    private void deliveryOfMaterials() {
        final StructuralEngineer kelly = new StructuralEngineer("Kelly");
        kelly.setTimelyDelivery(true);

        final Calendar dateReceived = Calendar.getInstance();
        dateReceived.set(Calendar.YEAR, 2021);
        dateReceived.set(Calendar.MONTH, Calendar.OCTOBER);
        dateReceived.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = dateReceived.getTime();

        logger.info("Materials Delivered On Time: " + kelly.isTimelyDelivery());
        logger.info("Calendar date materials were received: " + date.getTime());

    }

    @Override
    protected Double earnings() {
        return null;
    }
}
