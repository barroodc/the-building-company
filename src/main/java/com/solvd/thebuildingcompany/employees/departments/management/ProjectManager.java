package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Optional;
import java.util.logging.Logger;

public class ProjectManager extends Employee {

    private static final Logger logger = Logger.getLogger(ProjectManager.class.getName());

    private boolean positiveFeedback;
    private boolean passedSoilTesting;
    private boolean sitePlanMade;
    private boolean itemsReturned;


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

    public boolean isItemsReturned() {
        return itemsReturned;
    }

    public void setItemsReturned(final boolean itemsReturned) {
        this.itemsReturned = itemsReturned;
    }

    public ProjectManager(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private HashMap<String, Boolean> constructionSitePreparations() {
        final ProjectManager magnus = new ProjectManager("Magnus", "The Building Company");
        magnus.setPositiveFeedback(true);
        magnus.setPassedSoilTesting(true);
        magnus.setSitePlanMade(true);

        logger.info("Project Manager Checks:");

        final HashMap<String, Boolean> checkpoints = new HashMap<>();
        checkpoints.put("Positive Survey Result Achieved, ", magnus.isPositiveFeedback());
        checkpoints.put("Soil Testing Passed: ", magnus.isPassedSoilTesting());
        checkpoints.put("Site Plan Created: ", magnus.isSitePlanMade());

        checkpoints.forEach((key, value) -> logger.info(key + " " + value));

        return checkpoints;
    }

    private String projectCloseOut() {
        final ProjectManager ralph = new ProjectManager("Ralph", "The Building Company");
        ralph.setItemsReturned(true);

        logger.info("Resources are demobilized: " + ralph.isItemsReturned());

        return "Resources are demobilized: " + ralph.isItemsReturned();
    }
}
