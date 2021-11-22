package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ProjectManager extends Employees {

    private double heightOfBuilding;
    private double squareFootage;
    private double roomsNeeded;
    private boolean blueprintMade;
    private boolean isSiteCleared;
    private boolean positiveFeedback;
    private boolean passedSoilTesting;
    private boolean sitePlanMade;
    private boolean resourcesAcquired;
    private boolean itemsReturned;

    public double getHeightOfBuilding() {
        return heightOfBuilding;
    }

    public void setHeightOfBuilding(double heightOfBuilding) {
        this.heightOfBuilding = heightOfBuilding;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public double getRoomsNeeded() {
        return roomsNeeded;
    }

    public void setRoomsNeeded(double roomsNeeded) {
        this.roomsNeeded = roomsNeeded;
    }

    public boolean isBlueprintMade() {
        return blueprintMade;
    }

    public void setBlueprintMade(boolean blueprintMade) {
        this.blueprintMade = blueprintMade;
    }

    public boolean isSiteCleared() {
        return isSiteCleared;
    }

    public void setSiteCleared(boolean siteCleared) {
        isSiteCleared = siteCleared;
    }

    public boolean isPositiveFeedback() {
        return positiveFeedback;
    }

    public void setPositiveFeedback(boolean positiveFeedback) {
        this.positiveFeedback = positiveFeedback;
    }

    public boolean isPassedSoilTesting() {
        return passedSoilTesting;
    }

    public void setPassedSoilTesting(boolean passedSoilTesting) {
        this.passedSoilTesting = passedSoilTesting;
    }

    public boolean isSitePlanMade() {
        return sitePlanMade;
    }

    public void setSitePlanMade(boolean sitePlanMade) {
        this.sitePlanMade = sitePlanMade;
    }

    public boolean isResourcesAcquired() {
        return resourcesAcquired;
    }

    public void setResourcesAcquired(boolean resourcesAcquired) {
        this.resourcesAcquired = resourcesAcquired;
    }

    public boolean isItemsReturned() {
        return itemsReturned;
    }

    public void setItemsReturned(boolean itemsReturned) {
        this.itemsReturned = itemsReturned;
    }

    private final Logger logger = Logger.getLogger(ProjectManager.class.getName());

    final ProjectManager magnus = new ProjectManager();


    private HashMap<String, Double> programmingAndFeasibility() {
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

    private String schematicDesign() {
        magnus.setBlueprintMade(true);

        logger.info("First Blueprint Create: " + magnus.isBlueprintMade());

        return "First Blueprint Created: " + magnus.isBlueprintMade();
    }

    private String contractDocuments() {
        //figure out a way to work magnus into this method
        final boolean contractCreated = true;

        logger.info("Contract Created: " + contractCreated);

        return "Contract Created: " + contractCreated;
    }

    private HashMap<String, Boolean> constructionSitePreparations() {
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

    private HashMap<String, Boolean> procurementOfResources() {
        magnus.setResourcesAcquired(true);

        HashMap<String, Boolean> acquiredItems = new HashMap<>();
        acquiredItems.put("Resources obtained: ", magnus.isResourcesAcquired());

        for (Map.Entry<String, Boolean> set : acquiredItems.entrySet()) {
            logger.info(set.getKey());
        }

        return acquiredItems;
    }

    private String projectCloseOut() {
        magnus.setItemsReturned(true);

        logger.info("Resources are demobilized: " + magnus.isItemsReturned());

        return "Resources are demobilized: " + magnus.isItemsReturned();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
