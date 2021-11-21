package com.solvd.thebuildingcompany.employees.marketingemployees;

import com.solvd.thebuildingcompany.departments.Marketing;

import java.util.logging.Logger;

public class MarketingDirector extends Marketing {

    private final Logger logger = Logger.getLogger(MarketingDirector.class.getName());

    public MarketingDirector(String name) {  //Do I even need the constructor here?
        this.setName("Boris");
    }

    final Marketing boris = new MarketingDirector("Boris");

    @Override
    protected String brandManagement() {
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

    @Override
    protected String brandDefinition() {

        //Maintenance of the tag-line of the company - String or HashMap
        return null;
    }

    @Override
    protected String campaignManagement() {

        //Planned marketing campaigns and the date of release - HashMap
        //Organizational Guidelines Met - Boolean
        //Marketing Campaigns made and release date - HashMap
        //Marketing Campaigns supervised - Boolean
        //Campaigns were a success or failure - HashMap<String, Boolean>
        //Development showcase/Open Houses

        return null;
    }

    @Override
    protected String marketingMaterials() {
        //Side Note: Check Marketing class to make sure you did the same thing
        //Marketing materials made and their function - HashMap
        return null;
    }

    @Override
    protected String searchEngineOptimization() {
        //Oversaw Process and gave recommendations to fellow marketers
        return null;
    }

    @Override
    protected String socialMediaManagement() {
        return null;
    }

    @Override
    protected String internalCommunications() {
        return null;
    }

    @Override
    protected String customerResearch() {
        return null;
    }

    @Override
    protected String marketResearch() {
        return null;
    }

    @Override
    protected String trackingOutsideVendors() {
        return null;
    }

    @Override
    protected String pricingOfProjects() {
        return null;
    }
}
