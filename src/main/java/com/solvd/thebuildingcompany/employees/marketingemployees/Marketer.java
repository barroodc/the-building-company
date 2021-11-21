package com.solvd.thebuildingcompany.employees.marketingemployees;

import com.solvd.thebuildingcompany.departments.Marketing;

import java.util.logging.Logger;

public class Marketer extends Marketing {

    private final Logger logger = Logger.getLogger(Marketer.class.getName());

    public Marketer(String name) {
        this.setName(name);
    }

    @Override
    protected String brandManagement() {
        final Marketer olivia = new Marketer("Olivia");
        olivia.setBrandGrowth(6.5);

        logger.info("Amount of growth per quarter: " + olivia.getBrandGrowth());
        return "Amount of growth per quarter: " + olivia.getBrandGrowth();
    }

    @Override
    protected String brandDefinition() {
        final Marketer joanna = new Marketer("Joanna");
        joanna.setCurrentDesign("design from 2017.");

        logger.info("BusinessX has decided to bring back its " + joanna.getCurrentDesign());
        return "BusinessX has decided to bring back its " + joanna.getCurrentDesign();
    }

    @Override
    protected String campaignManagement() {
        final Marketer george = new Marketer("George");
        george.setCampaignBudget(10000);

        logger.info("The amount of money allotted this quarter is $" + george.getCampaignBudget());
        return "The amount of money allotted this quarter is $" + george.getCampaignBudget();
    }

    @Override
    protected String marketingMaterials() {
        final Marketer dianna = new Marketer("Dianna");
        dianna.setMarketingBudget(5000);

        logger.info("Total amount of marketing allowed to be spent per quarter for marketing material is " + getMarketingBudget());
        return "Total amount of marketing allowed to be spent per quarter for marketing material is " + getMarketingBudget();
    }

    @Override
    protected String searchEngineOptimization() {
        final Marketer debra  = new Marketer("Debra");
        debra.setDataMining(50);

        logger.info("We were able to come up with " + debra.getDataMining() + "unique data points.");
        return "We were able to come up with " + debra.getDataMining() + "unique data points.";
    }

    @Override
    protected String socialMediaManagement() {
        final Marketer spencer = new Marketer("Spencer");
        spencer.setPostsPerHour(20);

        logger.info("We post " + spencer.getPostsPerHour() + "per hour.");
        return "We post " + spencer.getPostsPerHour() + "per hour.";
    }

    @Override
    protected String internalCommunications() {
        final Marketer abby = new Marketer("Abby");
        abby.setSlackGroup("Marketing Department");

        logger.info("Please welcome all newcomers to our " + abby.getSlackGroup());
        return "Please welcome all newcomers to our " + abby.getSlackGroup();
    }

    @Override
    protected String customerResearch() {
        Marketer nicolette = new Marketer("Nicolette");
        nicolette.setUniqueDateFound(20);

        logger.info("There were " + nicolette.getUniqueDateFound() + " new customer data points found.");

        return "There were " + nicolette.getUniqueDateFound() + " new customer data points found.";
    }

    @Override
    protected String marketResearch() {
        final Marketer alec = new Marketer("Alec");
        alec.setUniqueDateFound(20);

        logger.info("The number of findings suggests its a sellers market.");
        return "The number of findings suggests its a sellers market.";
    }

    @Override
    protected String trackingOutsideVendors() {
        final MarketingDirector boris = new MarketingDirector("Boris");
        int vendorsUsed = 24;

        logger.info(vendorsUsed + " outside vendors were used according to " + boris.getName() + ".");
        return vendorsUsed + " outside vendors were used according to " + boris.getName() + ".";
    }

    @Override
    protected String pricingOfProjects() {
        logger.info("Our pricing of our projects depends on projections given from finance.");
        return "Our pricing of our projects depends on projections given from finance.";
    }
}
