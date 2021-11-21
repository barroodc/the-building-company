package com.solvd.thebuildingcompany.departments;

import java.util.HashMap;

public abstract class ProjectManagement {

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

    protected abstract HashMap<String, Double> programmingAndFeasibility();
    protected abstract String schematicDesign();
    protected abstract String contractDocuments();
    protected abstract HashMap<String, Boolean> constructionSitePreparations();
    protected abstract HashMap<String, Boolean> procurementOfResources();
    protected abstract String projectCloseOut();

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


    /*private HashMap<String, Double> programmingAndFeasibility() {
        final ProjectManagement feasibilityTest = new ProjectManagement();
        feasibilityTest.setHeightOfBuilding(20);
        feasibilityTest.setSquareFootage(1740);
        feasibilityTest.setRoomsNeeded(5);

        HashMap<String, Double> schematicHomes = new HashMap<>();
        schematicHomes.put("Height of home in ft: ", feasibilityTest.getHeightOfBuilding());
        schematicHomes.put("Square Footage: ", feasibilityTest.getSquareFootage());
        schematicHomes.put("Number of rooms needed: ", feasibilityTest.getRoomsNeeded());

        return schematicHomes;
    }

    private String schematicDesign() {
        final ProjectManagement bluePrint = new ProjectManagement();
        bluePrint.setBlueprintMade(true);

        return "First Blueprint Created: " + bluePrint.blueprintMade;
    }

    private String contractDocuments() {
       final boolean contractCreated = true;

       return "Contract Created: " + contractCreated;
    }

    private HashMap<String, Boolean> constructionSitePreparations() {
       final ProjectManagement preparation = new ProjectManagement();
       preparation.setSiteCleared(true);
       preparation.setPositiveFeedback(true);
       preparation.setPassedSoilTesting(true);
       preparation.setSitePlanMade(true);

       HashMap<String, Boolean> checkpoints = new HashMap<>();
       checkpoints.put("Construction Site Cleared: ", preparation.isSiteCleared);
       checkpoints.put("Positive Survey Result Achieved, ", preparation.positiveFeedback);
       checkpoints.put("Soil Testing Passed: ", preparation.passedSoilTesting);
       checkpoints.put("Site Plan Created: ", preparation.sitePlanMade);

       return checkpoints;
    }

    private HashMap<String, Boolean> procurementOfResources() {
       final ProjectManagement resourcesObtained = new ProjectManagement();
       resourcesObtained.setResourcesAcquired(true);

       HashMap<String, Boolean> acquiredItems = new HashMap<>();
       acquiredItems.put("Resources obtained: ", resourcesObtained.resourcesAcquired);

       return acquiredItems;
    }

    private String projectCloseOut() {
        final ProjectManagement projectCleanUp = new ProjectManagement();
        projectCleanUp.setItemsReturned(true);

        return "Resources are demobilized: " + projectCleanUp.itemsReturned;
    }

     */
}
