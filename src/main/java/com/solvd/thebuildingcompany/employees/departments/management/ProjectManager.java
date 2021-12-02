package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ProjectManager extends Employee {

    private boolean positiveFeedback;
    private boolean passedSoilTesting;
    private boolean sitePlanMade;
    private boolean resourcesAcquired;
    private boolean itemsReturned;
    private String name;



    public boolean isPositiveFeedback() {
        return positiveFeedback;
    }

    public void setPositiveFeedback(final boolean positiveFeedback) {
        this.positiveFeedback = positiveFeedback;
    }

    public boolean isPassedSoilTesting() {
        return passedSoilTesting;
    }

    public void setPassedSoilTesting(final boolean passedSoilTesting) {
        this.passedSoilTesting = passedSoilTesting;
    }

    public boolean isSitePlanMade() {
        return sitePlanMade;
    }

    public void setSitePlanMade(final boolean sitePlanMade) {
        this.sitePlanMade = sitePlanMade;
    }

    public boolean isResourcesAcquired() {
        return resourcesAcquired;
    }

    public void setResourcesAcquired(final boolean resourcesAcquired) {
        this.resourcesAcquired = resourcesAcquired;
    }

    public boolean isItemsReturned() {
        return itemsReturned;
    }

    public void setItemsReturned(final boolean itemsReturned) {
        this.itemsReturned = itemsReturned;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(ProjectManager.class.getName());

    public ProjectManager(final String name) {
        this.name = name;
    }


    private HashMap<String, Boolean> constructionSitePreparations() {
        final ProjectManager magnus = new ProjectManager("Magnus");
        magnus.setPositiveFeedback(true);
        magnus.setPassedSoilTesting(true);
        magnus.setSitePlanMade(true);

        logger.info("Project Manager Checks:");

        HashMap<String, Boolean> checkpoints = new HashMap<>();
        checkpoints.put("Positive Survey Result Achieved, ", magnus.isPositiveFeedback());
        checkpoints.put("Soil Testing Passed: ", magnus.isPassedSoilTesting());
        checkpoints.put("Site Plan Created: ", magnus.isSitePlanMade());

        checkpoints.forEach((key, value) -> logger.info(key + " " + value));

        return checkpoints;
    }

    private String projectCloseOut() {
        final ProjectManager ralph = new ProjectManager("Ralph");
        ralph.setItemsReturned(true);

        logger.info("Resources are demobilized: " + ralph.isItemsReturned());

        return "Resources are demobilized: " + ralph.isItemsReturned();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
