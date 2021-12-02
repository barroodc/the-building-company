package com.solvd.thebuildingcompany.employees.departments.materialpurchasing;

import com.solvd.thebuildingcompany.employees.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class ConstructionExpeditor extends Employee {

    private boolean proposalSent;
    private boolean feasible;
    private double maintenanceCosts;
    private double operatingCosts;
    private boolean deadlinesAreMade;
    private boolean arrivedOnTime;
    private boolean contractsHonored;
    private String name;

    public boolean isProposalSent() {
        return proposalSent;
    }

    public void setProposalSent(final boolean proposalSent) {
        this.proposalSent = proposalSent;
    }

    public boolean isFeasible() {
        return feasible;
    }

    public void setFeasible(final boolean feasible) {
        this.feasible = feasible;
    }

    public double getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(final double maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public double getOperatingCosts() {
        return operatingCosts;
    }

    public void setOperatingCosts(final double operatingCosts) {
        this.operatingCosts = operatingCosts;
    }

    public boolean isDeadlinesAreMade() {
        return deadlinesAreMade;
    }

    public void setDeadlinesAreMade(final boolean deadlinesAreMade) {
        this.deadlinesAreMade = deadlinesAreMade;
    }

    public boolean isArrivedOnTime() {
        return arrivedOnTime;
    }

    public void setArrivedOnTime(final boolean arrivedOnTime) {
        this.arrivedOnTime = arrivedOnTime;
    }

    public boolean isContractsHonored() {
        return contractsHonored;
    }

    public void setContractsHonored(final boolean contractsHonored) {
        this.contractsHonored = contractsHonored;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    private static Logger logger = LogManager.getLogger(ConstructionExpeditor.class);

    public ConstructionExpeditor(final String name) {
        this.setName(name);
    }


    private void materialsOrdered() {

        ConstructionExpeditor jasmine = new ConstructionExpeditor("Jasmine");
        StringBuilder listBuilding = new StringBuilder();
        InputStream readingListOfItems = jasmine.getClass().getClassLoader().getResourceAsStream("NewJerseyProjectItems.txt");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(readingListOfItems));
            String line;

             while ((line = reader.readLine()) != null) {
                listBuilding.append(line).append(System.lineSeparator());
            }

            logger.info(listBuilding.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private HashMap<String, Boolean> resourceManagement() {
        final ConstructionExpeditor eleanor = new ConstructionExpeditor("Eleanor");
        eleanor.setDeadlinesAreMade(true);

        HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("The resource arrived on time: ", eleanor.isDeadlinesAreMade());

        onTimeOrders.forEach((key, value) -> logger.info(key));

        return onTimeOrders;
    }

    private HashMap<String, Boolean> itemDeadlines() {
        final ConstructionExpeditor violet = new ConstructionExpeditor("Violet");
        violet.setArrivedOnTime(true);

        final HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("Order for steel arrived on schedule: ", violet.isArrivedOnTime());

        onTimeOrders.forEach((key, value) -> logger.info(key));

        return onTimeOrders;
    }

    private String contractManagement() {
        final ConstructionExpeditor sunny = new ConstructionExpeditor("Sunny");

        logger.info("All contracts were honored: " + sunny.isContractsHonored());
        return "All contracts were honored: " + sunny.isContractsHonored();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
