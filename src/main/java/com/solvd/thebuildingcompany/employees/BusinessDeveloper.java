package com.solvd.thebuildingcompany.employees;

import com.solvd.thebuildingcompany.departments.BusinessDevelopment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class BusinessDeveloper extends BusinessDevelopment {

    private final Logger logger = Logger.getLogger(BusinessDeveloper.class.getName());



    public BusinessDeveloper(String name){
        this.setName(name);
    }

    @Override
    protected HashMap<String, String> prospectLog() {
        final BusinessDeveloper kevin = new BusinessDeveloper("Kevin");
        final BusinessDeveloper casey = new BusinessDeveloper("Casey");
        final BusinessDeveloper bruce = new BusinessDeveloper("Bruce");

        final HashMap<String, String> prospectAssignedTo = new HashMap<>();
        prospectAssignedTo.put(kevin.getName(), "Jack Morrison");
        prospectAssignedTo.put(casey.getName(), "Casey Slater");
        prospectAssignedTo.put(bruce.getName(), "Rachel Newman");

        for (Map.Entry<String, String> set : prospectAssignedTo.entrySet()) {
            logger.info(set.getKey());
        }

        return prospectAssignedTo;
    }

    @Override
    protected String quarterlyBusinessGrowth() {
        final BusinessDeveloper chris = new BusinessDeveloper("Chris");
        chris.setGrowthRate(20.34);

        logger.info("The percentage growth from quarter one has %" + chris.getGrowthRate());
        return "The percentage growth from quarter one has %" + chris.getGrowthRate();
    }

    @Override
    protected HashMap<String, String> currentBusiness() {
        BusinessDeveloper icarus = new BusinessDeveloper("Icarus");
        BusinessDeveloper paul = new BusinessDeveloper("Paul");
        BusinessDeveloper liam = new BusinessDeveloper("Liam");

        HashMap<String, String> customerAssignedTo = new HashMap<>();
        customerAssignedTo.put(icarus.getName(), "Nina Cruz");
        customerAssignedTo.put(paul.getName(), "Robert Black");
        customerAssignedTo.put(liam.getName(), "Marco Polo");

        for (Map.Entry<String, String> set : customerAssignedTo.entrySet()) {
            logger.info(set.getKey());
        }

        return customerAssignedTo;
    }

    @Override
    protected String marketResearch() {
        //Figure out how to incorporate BusinessDeveloper
        final BusinessDeveloper mateo = new BusinessDeveloper("Mateo");
        final BusinessDeveloper charlotte = new BusinessDeveloper("Charlotte");

        mateo.setSellersMarket(true);
        charlotte.setBuyersMarket(false);

        if (isSellersMarket()) {
            logger.info("The current market is a sellers market: " + mateo.isSellersMarket());
            return "The current market is a sellers market: " + mateo.isSellersMarket();
        } else {
            logger.info("The current market is a buyers market: " + charlotte.isBuyersMarket());
            return "The current market is a buyers market: " + charlotte.isBuyersMarket();
        }
    }

    @Override
    protected HashMap<String, Double> businessContacts() {
        final BusinessDeveloper madison = new BusinessDeveloper("Madison");
        final BusinessDeveloper sophia = new BusinessDeveloper("Sophia");
        final BusinessDevelopment isabella = new BusinessDeveloper("Isabella");

        madison.setCostOfMaterials(20159.59);
        sophia.setCostOfMaterials(54981.76);
        isabella.setCostOfMaterials(15421.05);


        final HashMap<String, Double> contractorCosts = new HashMap<>();
        contractorCosts.put("Contractors AYR individual expenses: ", madison.getCostOfMaterials() / 3);
        contractorCosts.put("Contractors NXE individual expenses: ", sophia.getCostOfMaterials() / 3);
        contractorCosts.put("Contractors YZW individual expenses: ", isabella.getCostOfMaterials() / 3);

        for (Map.Entry<String, Double> set : contractorCosts.entrySet()) {
            logger.info(set.getKey());
        }

        return contractorCosts;
    }
}
