package com.solvd.thebuildingcompany.employees.departments.businessdevelopment;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class BusinessDeveloper extends Employee {

    private String name;
    private double costOfMaterials;
    private double growthRate;
    private boolean sellersMarket;
    private boolean buyersMarket;
    private HashMap<String, String> developmentNumberOfHomes;
    private HashMap<String, String> developmentAndModel;
    private HashMap<String, String> projectsAssignedTo;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getCostOfMaterials() {
        return costOfMaterials;
    }

    public void setCostOfMaterials(final double costOfMaterials) {
        this.costOfMaterials = costOfMaterials;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(final double growthRate) {
        this.growthRate = growthRate;
    }

    public boolean isSellersMarket() {
        return sellersMarket;
    }

    public void setSellersMarket(final boolean setSellersMarket) {
        this.sellersMarket = setSellersMarket;
    }

    public boolean isBuyersMarket() {
        return buyersMarket;
    }

    public void setBuyersMarket(final boolean buyersMarket) {
        this.buyersMarket = buyersMarket;
    }

    public HashMap<String, String> getDevelopmentNumberOfHomes() {
        return developmentNumberOfHomes;
    }

    public void setDevelopmentNumberOfHomes(final HashMap<String, String> developmentNumberOfHomes) {
        this.developmentNumberOfHomes = developmentNumberOfHomes;
    }

    public HashMap<String, String> getDevelopmentAndModel() {
        return developmentAndModel;
    }

    public void setMakeAndModel(final HashMap<String, String> developmentAndModel) {
        this.developmentAndModel = developmentAndModel;
    }


    private final Logger logger = Logger.getLogger(BusinessDeveloper.class.getName());



    public BusinessDeveloper(final String name){
        this.setName(name);
    }

    private void developmentProjects() {
        final BusinessDeveloper ashley = new BusinessDeveloper("Ashley");
        final BusinessDeveloper alexander = new BusinessDeveloper("Alexander");
        final BusinessDeveloper marcus = new BusinessDeveloper("Marcus");

        developmentNumberOfHomes = new HashMap<>();
        developmentNumberOfHomes.put("Development: Chestnut Lake ", "200 homes are needed");
        developmentNumberOfHomes.put("Development: Victory Lakes", "100 homes are needed");
        developmentNumberOfHomes.put("Development: Sycamore Village", "50 homes are needed");

        developmentAndModel = new HashMap<>();
        developmentAndModel.put("Chestnut Lake", "Tudor");
        developmentAndModel.put("Victory Lakes", "Colonial");
        developmentAndModel.put("Sycamore Village", "Victorian");

        projectsAssignedTo = new HashMap<>();
        projectsAssignedTo.put("Chestnut Lake assigned to: ", ashley.getName());
        projectsAssignedTo.put("Victory Lakes assigned to: ", alexander.getName());
        projectsAssignedTo.put("Sycamore Village assigned to: ", marcus.getName());

        developmentNumberOfHomes.forEach((key, value) -> logger.info(key + " " + value));

        developmentAndModel.forEach((key, value) -> logger.info(key + " " + value));

        projectsAssignedTo.forEach((key, value) -> logger.info(key + value));
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
