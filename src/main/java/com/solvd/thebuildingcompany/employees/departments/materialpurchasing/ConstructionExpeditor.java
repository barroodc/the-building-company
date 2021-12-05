package com.solvd.thebuildingcompany.employees.departments.materialpurchasing;

import com.solvd.thebuildingcompany.employees.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class ConstructionExpeditor extends Employee {

    private static final Logger logger = LogManager.getLogger(ConstructionExpeditor.class);

    private boolean deadlinesAreMade;
    private boolean arrivedOnTime;
    private boolean contractsHonored;


    //optional example
    public Optional<Boolean> isDeadlinesAreMade() {
        return Optional.of(deadlinesAreMade);
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

    public ConstructionExpeditor(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }


    private void materialsOrdered() {

        final ConstructionExpeditor jasmine = new ConstructionExpeditor("Jasmine", "The Building Company");
        final StringBuilder listBuilding = new StringBuilder();
        final InputStream readingListOfItems = jasmine.getClass().getClassLoader().getResourceAsStream("NewJerseyProjectItems.txt");

        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(readingListOfItems));
            String line;

             while ((line = reader.readLine()) != null) {
                listBuilding.append(line).append(System.lineSeparator());
            }

            logger.info(listBuilding.toString());
        } catch (IOException e) {
            logger.error(e);
        }


    }

    private void resourceManagement() {
        final ConstructionExpeditor eleanor = new ConstructionExpeditor("Eleanor", "The Building Company");
        eleanor.setDeadlinesAreMade(true);

        final HashMap<String, Optional<Boolean>> onTimeOrders = new HashMap<>();
        onTimeOrders.put("The resource arrived on time ", eleanor.isDeadlinesAreMade());

        //Optional example
        if (eleanor.isDeadlinesAreMade().isPresent()){
            logger.info("On time arrival reconfirmed");
        } else {
            logger.info("On time arrival not reconfirmed");
        }

        onTimeOrders.forEach((key, value) -> logger.info(key));

    }

    private HashMap<String, Boolean> itemDeadlines() {
        final ConstructionExpeditor violet = new ConstructionExpeditor("Violet", "The Building Company");
        violet.setArrivedOnTime(true);

        final HashMap<String, Boolean> onTimeOrders = new HashMap<>();
        onTimeOrders.put("Order for steel arrived on schedule ", violet.isArrivedOnTime());

        onTimeOrders.forEach((key, value) -> logger.info(key));

        return onTimeOrders;
    }

    private String contractManagement() {
        final ConstructionExpeditor sunny = new ConstructionExpeditor("Sunny", "The Building Company");

        logger.info("All contracts were honored: " + sunny.isContractsHonored());
        return "All contracts were honored: " + sunny.isContractsHonored();
    }
}
