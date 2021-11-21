package com.solvd.thebuildingcompany.employees.engineeringemployees;

import com.solvd.thebuildingcompany.departments.Engineering;

import java.util.*;
import java.util.logging.Logger;

public class StructuralEngineer extends Engineering {

    private final Logger logger = Logger.getLogger(StructuralEngineer.class.getName());

    public StructuralEngineer(String name) {
        this.setName(name);
    }

    @Override
    protected HashMap<String, Boolean> evaluationPerformed() {
        return null;
    }

    @Override
    protected HashMap<String, String> developmentStage() {
        return null;
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

    protected HashMap<String, Boolean> buildingMaterialTesting() {
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

    protected void structureStressTest() {
        final StructuralEngineer tyler = new StructuralEngineer("Tyler");
        tyler.setTestingPerformed(true);
        tyler.setPassingTestResult(true);

        logger.info("Structure Stress Test Performed: " + tyler.isTestingPerformed());
        logger.info("Structure Stress Test Passed: " + tyler.isPassingTestResult());
    }

    protected void landSuitability() {
        final StructuralEngineer rachel = new StructuralEngineer("Rachel");
        rachel.setAreaBuildReady(false);

        final ArrayList<String> issuesWithLand = new ArrayList<>();
        issuesWithLand.add("In an area known for fracking.");
        issuesWithLand.add("Locals are not happy about construction endeavors.");

        logger.info("Land is suitable for project: " + rachel.isAreaBuildReady());
        logger.info("Current issues with land: " + issuesWithLand);
    }

    protected void deliveryOfMaterials() {
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
}
