package com.solvd.thebuildingcompany.employees.departments.marketing;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class Marketer extends Employees {

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

    private final Logger logger = Logger.getLogger(Marketer.class.getName());

    public Marketer(String name) {
        this.setName(name);
    }

    private String brandManagement() {
        final Marketer olivia = new Marketer("Olivia");
        olivia.setBrandGrowth(6.5);

        logger.info("Amount of growth per quarter: " + olivia.getBrandGrowth());
        return "Amount of growth per quarter: " + olivia.getBrandGrowth();
    }

    private String brandDefinition() {
        final Marketer joanna = new Marketer("Joanna");
        joanna.setCurrentDesign("design from 2017.");

        logger.info("BusinessX has decided to bring back its " + joanna.getCurrentDesign());
        return "BusinessX has decided to bring back its " + joanna.getCurrentDesign();
    }

    private String campaignManagement() {
        final Marketer george = new Marketer("George");
        george.setCampaignBudget(10000);

        logger.info("The amount of money allotted this quarter is $" + george.getCampaignBudget());
        return "The amount of money allotted this quarter is $" + george.getCampaignBudget();
    }

    private String marketingMaterials() {
        final Marketer dianna = new Marketer("Dianna");
        dianna.setMarketingBudget(5000);

        logger.info("Total amount of marketing allowed to be spent per quarter for marketing material is " + getMarketingBudget());
        return "Total amount of marketing allowed to be spent per quarter for marketing material is " + getMarketingBudget();
    }

    private String searchEngineOptimization() {
        final Marketer debra  = new Marketer("Debra");
        debra.setDataMining(50);

        logger.info("We were able to come up with " + debra.getDataMining() + "unique data points.");
        return "We were able to come up with " + debra.getDataMining() + "unique data points.";
    }

    private String socialMediaManagement() {
        final Marketer spencer = new Marketer("Spencer");
        spencer.setPostsPerHour(20);

        logger.info("We post " + spencer.getPostsPerHour() + "per hour.");
        return "We post " + spencer.getPostsPerHour() + "per hour.";
    }

    private String internalCommunications() {
        final Marketer abby = new Marketer("Abby");
        abby.setSlackGroup("Marketing Department");

        logger.info("Please welcome all newcomers to our " + abby.getSlackGroup());
        return "Please welcome all newcomers to our " + abby.getSlackGroup();
    }

    private String customerResearch() {
        Marketer nicolette = new Marketer("Nicolette");
        nicolette.setUniqueDateFound(20);

        logger.info("There were " + nicolette.getUniqueDateFound() + " new customer data points found.");

        return "There were " + nicolette.getUniqueDateFound() + " new customer data points found.";
    }

    private String marketResearch() {
        final Marketer alec = new Marketer("Alec");
        alec.setUniqueDateFound(20);

        logger.info("The number of findings suggests its a sellers market.");
        return "The number of findings suggests its a sellers market.";
    }

    private String trackingOutsideVendors() {
        final MarketingDirector boris = new MarketingDirector("Boris");
        int vendorsUsed = 24;

        logger.info(vendorsUsed + " outside vendors were used according to " + boris + ".");
        return vendorsUsed + " outside vendors were used according to " + boris + ".";
    }

    private String pricingOfProjects() {
        logger.info("Our pricing of our projects depends on projections given from finance.");
        return "Our pricing of our projects depends on projections given from finance.";
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
