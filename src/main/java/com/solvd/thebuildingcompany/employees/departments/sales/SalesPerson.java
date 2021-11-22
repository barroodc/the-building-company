package com.solvd.thebuildingcompany.employees.departments.sales;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.logging.Logger;

public class SalesPerson extends Employees {

    private int surveysCompleted;
    private boolean marketingSent;
    private int prospectsReached;
    private int prospectsConverted;
    private boolean bidsAreSteady; //Consistent
    private boolean proposalCheckIn;
    private String name;

    public int getSurveysCompleted() {
        return surveysCompleted;
    }

    public void setSurveysCompleted(int surveysCompleted) {
        this.surveysCompleted = surveysCompleted;
    }

    public boolean isMarketingSent() {
        return marketingSent;
    }

    public void setMarketingSent(boolean marketingSent) {
        this.marketingSent = marketingSent;
    }

    public int getProspectsReached() {
        return prospectsReached;
    }

    public void setProspectsReached(int prospectsReached) {
        this.prospectsReached = prospectsReached;
    }

    public int getProspectsConverted() {
        return prospectsConverted;
    }

    public void setProspectsConverted(int prospectsConverted) {
        this.prospectsConverted = prospectsConverted;
    }

    public boolean isBidsAreSteady() {
        return bidsAreSteady;
    }

    public void setBidsAreSteady(boolean bidsAreSteady) {
        this.bidsAreSteady = bidsAreSteady;
    }

    public boolean isProposalCheckIn() {
        return proposalCheckIn;
    }

    public void setProposalCheckIn(boolean proposalCheckIn) {
        this.proposalCheckIn = proposalCheckIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(SalesPerson.class.getName());

    public SalesPerson(String name) {
        this.setName(name);
    }


    private String marketResearch() {
        final SalesPerson suzie = new SalesPerson("Suzie");
        suzie.setSurveysCompleted(600);

        logger.info("Total number of surveys completed: " + suzie.getSurveysCompleted());

        return "Total number of surveys completed: " + suzie.getSurveysCompleted();
    }

    private String advertisingForSales() {
        final SalesPerson josh = new SalesPerson("Josh");
        josh.setMarketingSent(true);

        logger.info("Marketing materials sent to prospective clients: " + josh.isMarketingSent());

        return "Marketing materials sent to prospective clients: " + josh.isMarketingSent();
    }

    private String businessProspecting() {
        final SalesPerson matthew = new SalesPerson("Matthew");
        matthew.setProspectsReached(50);
        matthew.setProspectsConverted(35);

        logger.info("Number of prospects reached: " + matthew.getProspectsReached());
        logger.info("Number of prospects converted: " + matthew.getProspectsConverted());

        return "Number of prospects reached: " + matthew.getProspectsReached()
                + "Number of prospects converted: " + matthew.getProspectsConverted();
    }

    private String constructionBidConsistency() {
        final SalesPerson david = new SalesPerson("David");
        david.setBidsAreSteady(true);

        logger.info("All bids are consistent: " + david.isBidsAreSteady());

        return "All bids are consistent: " + david.isBidsAreSteady();
    }

    private String customerService() {
        final SalesPerson daniel = new SalesPerson("Daniel");
        daniel.setProposalCheckIn(true);

        logger.info("Successfully followed up on proposals: " + daniel.isProposalCheckIn());

        return "Successfully followed up on proposals: " + daniel.isProposalCheckIn();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
