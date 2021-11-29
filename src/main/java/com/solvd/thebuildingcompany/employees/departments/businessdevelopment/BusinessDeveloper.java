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

    public void setName(String name) {
        this.name = name;
    }

    public double getCostOfMaterials() {
        return costOfMaterials;
    }

    public void setCostOfMaterials(double costOfMaterials) {
        this.costOfMaterials = costOfMaterials;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public boolean isSellersMarket() {
        return sellersMarket;
    }

    public void setSellersMarket(boolean setSellersMarket) {
        this.sellersMarket = setSellersMarket;
    }

    public boolean isBuyersMarket() {
        return buyersMarket;
    }

    public void setBuyersMarket(boolean buyersMarket) {
        this.buyersMarket = buyersMarket;
    }

    public HashMap<String, String> getDevelopmentNumberOfHomes() {
        return developmentNumberOfHomes;
    }

    public void setDevelopmentNumberOfHomes(HashMap<String, String> developmentNumberOfHomes) {
        this.developmentNumberOfHomes = developmentNumberOfHomes;
    }

    public HashMap<String, String> getDevelopmentAndModel() {
        return developmentAndModel;
    }

    public void setMakeAndModel(HashMap<String, String> developmentAndModel) {
        this.developmentAndModel = developmentAndModel;
    }


    private final Logger logger = Logger.getLogger(BusinessDeveloper.class.getName());



    public BusinessDeveloper(String name){
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

        for (Map.Entry<String, String> set : developmentNumberOfHomes.entrySet()) {
            logger.info(set.getKey() + " " + set.getValue());
        }

        for (Map.Entry<String, String> set : developmentAndModel.entrySet()) {
            logger.info(set.getKey() + " " + set.getValue());
        }

        for (Map.Entry<String, String> set: projectsAssignedTo.entrySet()) {
            logger.info(set.getKey() + set.getValue());
        }
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
