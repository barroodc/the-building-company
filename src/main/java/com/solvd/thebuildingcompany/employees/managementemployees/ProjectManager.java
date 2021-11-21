package com.solvd.thebuildingcompany.employees.managementemployees;

import com.solvd.thebuildingcompany.departments.ProjectManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ProjectManager extends ProjectManagement {

    private final Logger logger = Logger.getLogger(ProjectManager.class.getName());

    final ProjectManager magnus = new ProjectManager();

    @Override
    protected HashMap<String, Double> programmingAndFeasibility() {
        magnus.setHeightOfBuilding(20);
        magnus.setSquareFootage(1740);
        magnus.setRoomsNeeded(5);

        HashMap<String, Double> schematicHomes = new HashMap<>();
        schematicHomes.put("Height of home in ft: ", magnus.getHeightOfBuilding());
        schematicHomes.put("Square Footage: ", magnus.getSquareFootage());
        schematicHomes.put("Number of rooms needed: ", magnus.getRoomsNeeded());

        for (Map.Entry<String, Double> set : schematicHomes.entrySet()) {
            logger.info(set.getKey());
        }

        return schematicHomes;
    }

    @Override
    protected String schematicDesign() {
        magnus.setBlueprintMade(true);

        logger.info("First Blueprint Create: " + magnus.isBlueprintMade());

        return "First Blueprint Created: " + magnus.isBlueprintMade();
    }

    @Override
    protected String contractDocuments() {
        //figure out a way to work magnus into this method
        final boolean contractCreated = true;

        logger.info("Contract Created: " + contractCreated);

        return "Contract Created: " + contractCreated;
    }

    @Override
    protected HashMap<String, Boolean> constructionSitePreparations() {
        magnus.setSiteCleared(true);
        magnus.setPositiveFeedback(true);
        magnus.setPassedSoilTesting(true);
        magnus.setSitePlanMade(true);

        HashMap<String, Boolean> checkpoints = new HashMap<>();
        checkpoints.put("Construction Site Cleared: ", magnus.isSiteCleared());
        checkpoints.put("Positive Survey Result Achieved, ", magnus.isPositiveFeedback());
        checkpoints.put("Soil Testing Passed: ", magnus.isPassedSoilTesting());
        checkpoints.put("Site Plan Created: ", magnus.isSitePlanMade());

        for (Map.Entry<String, Boolean> set : checkpoints.entrySet()) {
            logger.info(set.getKey());
        }

        return checkpoints;
    }

    @Override
    protected HashMap<String, Boolean> procurementOfResources() {
        magnus.setResourcesAcquired(true);

        HashMap<String, Boolean> acquiredItems = new HashMap<>();
        acquiredItems.put("Resources obtained: ", magnus.isResourcesAcquired());

        for (Map.Entry<String, Boolean> set : acquiredItems.entrySet()) {
            logger.info(set.getKey());
        }

        return acquiredItems;
    }

    @Override
    protected String projectCloseOut() {
        magnus.setItemsReturned(true);

        logger.info("Resources are demobilized: " + magnus.isItemsReturned());

        return "Resources are demobilized: " + magnus.isItemsReturned();
    }
}
