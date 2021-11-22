package com.solvd.thebuildingcompany.employees.departments.marketing;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class MarketingDirector extends Employees {

    private double brandGrowth;
    private int marketingBudget;
    private String currentDesign;
    private int campaignBudget;
    private int dataMining;
    private int postsPerHour;
    private String slackGroup;
    private int uniqueDateFound;
    private String name;

    public double getBrandGrowth() {
        return brandGrowth;
    }

    public void setBrandGrowth(double brandGrowth) {
        this.brandGrowth = brandGrowth;
    }

    public int getMarketingBudget() {
        return marketingBudget;
    }

    public void setMarketingBudget(int marketingBudget) {
        this.marketingBudget = marketingBudget;
    }

    public String getCurrentDesign() {
        return currentDesign;
    }

    public void setCurrentDesign(String currentDesign) {
        this.currentDesign = currentDesign;
    }

    public int getCampaignBudget() {
        return campaignBudget;
    }

    public void setCampaignBudget(int campaignBudget) {
        this.campaignBudget = campaignBudget;
    }

    public int getDataMining() {
        return dataMining;
    }

    public void setDataMining(int dataMining) {
        this.dataMining = dataMining;
    }

    public int getPostsPerHour() {
        return postsPerHour;
    }

    public void setPostsPerHour(int postsPerHour) {
        this.postsPerHour = postsPerHour;
    }

    public String getSlackGroup() {
        return slackGroup;
    }

    public void setSlackGroup(String slackGroup) {
        this.slackGroup = slackGroup;
    }

    public int getUniqueDateFound() {
        return uniqueDateFound;
    }

    public void setUniqueDateFound(int uniqueDateFound) {
        this.uniqueDateFound = uniqueDateFound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private final Logger logger = Logger.getLogger(MarketingDirector.class.getName());

    public MarketingDirector(String name) {  //Do I even need the constructor here?
        this.setName("Boris");
    }

    final MarketingDirector boris = new MarketingDirector("Boris");

    private String brandManagement() {
        //Competitor spreadsheet - HashMap
        //Press Releases - Temporarily a String but in the future should be a text doc
        //Key Performance indicators - HashMap
        //Advertising agencies worked with - ArrayList
        //Achieving Profit Targets, Timelines, and Budgets - HashMap
        //Comparative Market Analysis - HashMap
        //Strategy Recommendations - ArrayList or HashMap

        //This method should return either a String or Boolean
        //This is based off of the fact that there are multiple things going on here
        return null;
    }

    private String brandDefinition() {

        //Maintenance of the tag-line of the company - String or HashMap
        return null;
    }

    private String campaignManagement() {

        //Planned marketing campaigns and the date of release - HashMap
        //Organizational Guidelines Met - Boolean
        //Marketing Campaigns made and release date - HashMap
        //Marketing Campaigns supervised - Boolean
        //Campaigns were a success or failure - HashMap<String, Boolean>
        //Development showcase/Open Houses

        return null;
    }

    private String marketingMaterials() {
        //Side Note: Check Marketing class to make sure you did the same thing
        //Marketing materials made and their function - HashMap
        return null;
    }

    private String searchEngineOptimization() {
        //Oversaw Process and gave recommendations to fellow marketers
        return null;
    }

    private String socialMediaManagement() {
        return null;
    }

    private String internalCommunications() {
        return null;
    }

    private String customerResearch() {
        return null;
    }

    private String marketResearch() {
        return null;
    }

    private String trackingOutsideVendors() {
        return null;
    }

    private String pricingOfProjects() {
        return null;
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
