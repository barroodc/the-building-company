package com.solvd.thebuildingcompany.employees.sales;

import com.solvd.thebuildingcompany.departments.Sales;

import java.util.logging.Logger;

public class SalesPerson extends Sales {

    private final Logger logger = Logger.getLogger(SalesPerson.class.getName());

    public SalesPerson(String name) {
        this.setName(name);
    }

    @Override
    protected String marketResearch() {
        final SalesPerson suzie = new SalesPerson("Suzie");
        suzie.setSurveysCompleted(600);

        logger.info("Total number of surveys completed: " + suzie.getSurveysCompleted());

        return "Total number of surveys completed: " + suzie.getSurveysCompleted();
    }

    @Override
    protected String advertisingForSales() {
        final SalesPerson josh = new SalesPerson("Josh");
        josh.setMarketingSent(true);

        logger.info("Marketing materials sent to prospective clients: " + josh.isMarketingSent());

        return "Marketing materials sent to prospective clients: " + josh.isMarketingSent();
    }

    @Override
    protected String businessProspecting() {
        final SalesPerson matthew = new SalesPerson("Matthew");
        matthew.setProspectsReached(50);
        matthew.setNumberOfProspectsConverted(35);

        logger.info("Number of prospects reached: " + matthew.getProspectsReached());
        logger.info("Number of prospects converted: " + matthew.getProspectsConverted());

        return "Number of prospects reached: " + matthew.getProspectsReached()
                + "Number of prospects converted: " + matthew.getProspectsConverted();
    }

    @Override
    protected String constructionBidConsistency() {
        final SalesPerson david = new SalesPerson("David");
        david.setBidsAreSteady(true);

        logger.info("All bids are consistent: " + david.isBidsAreSteady());

        return "All bids are consistent: " + david.isBidsAreSteady();
    }

    @Override
    protected String customerService() {
        final SalesPerson daniel = new SalesPerson("Daniel");
        daniel.setProposalCheckIn(true);

        logger.info("Successfully followed up on proposals: " + daniel.isProposalCheckIn());

        return "Successfully followed up on proposals: " + daniel.isProposalCheckIn();
    }
}
