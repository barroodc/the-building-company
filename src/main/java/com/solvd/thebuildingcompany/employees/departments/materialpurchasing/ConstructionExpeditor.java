package com.solvd.thebuildingcompany.employees.departments.materialpurchasing;

import com.solvd.thebuildingcompany.PreConstructionPlanning;
import com.solvd.thebuildingcompany.employees.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

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

    public void setProposalSent(boolean proposalSent) {
        this.proposalSent = proposalSent;
    }

    public boolean isFeasible() {
        return feasible;
    }

    public void setFeasible(boolean feasible) {
        this.feasible = feasible;
    }

    public double getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(double maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public double getOperatingCosts() {
        return operatingCosts;
    }

    public void setOperatingCosts(double operatingCosts) {
        this.operatingCosts = operatingCosts;
    }

    public boolean isDeadlinesAreMade() {
        return deadlinesAreMade;
    }

    public void setDeadlinesAreMade(boolean deadlinesAreMade) {
        this.deadlinesAreMade = deadlinesAreMade;
    }

    public boolean isArrivedOnTime() {
        return arrivedOnTime;
    }

    public void setArrivedOnTime(boolean arrivedOnTime) {
        this.arrivedOnTime = arrivedOnTime;
    }

    public boolean isContractsHonored() {
        return contractsHonored;
    }

    public void setContractsHonored(boolean contractsHonored) {
        this.contractsHonored = contractsHonored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Logger logger = LogManager.getLogger(ConstructionExpeditor.class);

    public ConstructionExpeditor(String name) {
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

        for (Map.Entry<String, Boolean> set : onTimeOrders.entrySet()) {
            logger.info(set.getKey());
        }

        return onTimeOrders;
    }

    private HashMap<String, Boolean> itemDeadlines() {
        final ConstructionExpeditor violet = new ConstructionExpeditor("Violet");
        violet.setArrivedOnTime(true);

        final HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("Order for steel arrived on schedule: ", violet.isArrivedOnTime());

        for (Map.Entry<String, Boolean> set : onTimeOrders.entrySet()) {
            logger.info(set.getKey());
        }

        return onTimeOrders;
    }

    private String contractManagement() {
        final ConstructionExpeditor sunny = new ConstructionExpeditor("Sunny");

        logger.info("All contracts were honored: " + sunny.isContractsHonored());
        return "All contracts were honored: " + sunny.isContractsHonored();
    }

    public static void main(String[] args) {
        ConstructionExpeditor randy = new ConstructionExpeditor("Randy");
        randy.materialsOrdered();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
