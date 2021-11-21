package com.solvd.thebuildingcompany.departments;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class BusinessDevelopment {

    private double growthRate;
    private boolean sellersMarket;
    private boolean buyersMarket;
    private double costOfMaterials;
    private String name;

    protected abstract HashMap<String,String> prospectLog();
    protected abstract String quarterlyBusinessGrowth();
    protected abstract HashMap<String,String> currentBusiness();
    protected abstract String marketResearch();
    protected abstract HashMap<String, Double> businessContacts();


    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public boolean isSellersMarket() {
        return sellersMarket;
    }

    public void setSellersMarket(boolean sellersMarket) {
        this.sellersMarket = sellersMarket;
    }

    public boolean isBuyersMarket() {
        return buyersMarket;
    }

    public void setBuyersMarket(boolean buyersMarket) {
        this.buyersMarket = buyersMarket;
    }

    public double getCostOfMaterials() {
        return costOfMaterials;
    }

    public void setCostOfMaterials(double costOfMaterials) {
        this.costOfMaterials = costOfMaterials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
