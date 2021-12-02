package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Carpenter extends Contractor implements IInstallable {

    private int expectedNumberOfFixtures;
    private int expectedNumberOfFrameworks;


    public int getExpectedNumberOfFixtures() {
        return expectedNumberOfFixtures;
    }

    public void setExpectedNumberOfFixtures(final int expectedNumberOfFixtures) {
        this.expectedNumberOfFixtures = expectedNumberOfFixtures;
    }

    public int getExpectedNumberOfFrameworks() {
        return expectedNumberOfFrameworks;
    }

    public void setExpectedNumberOfFrameworks(final int expectedNumberOfFrameworks) {
        this.expectedNumberOfFrameworks = expectedNumberOfFrameworks;
    }

    private static Logger logger = LogManager.getLogger(Carpenter.class);

    public Carpenter(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void wallInstallationComplete() {
        final Carpenter jamison = new Carpenter("Jamison", "AYR Group");
        logger.info("Jamison the Carpenter now installs the wall:");
        jamison.addComponents();
        logger.info("adding drywall later...");
    }

    @Override
    public void addComponents() {
        logger.info("wooden beams for walls installed");
        logger.info("sheathing applied to exterior walls");
        logger.info("sheathing covered with protective wrap");
        logger.info("exterior doors are installed");
        logger.info("house wraps added");
    }


    @Override
    protected Double earnings() {
        return null;
    }

}
