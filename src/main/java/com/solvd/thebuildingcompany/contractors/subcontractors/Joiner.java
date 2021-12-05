package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Joiner extends Contractor implements IInstallable {

    private static Logger logger = LogManager.getLogger(Joiner.class);

    public Joiner(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void buildingStairs() {
        final Joiner johnny = new Joiner("Johnny", "SOT Group");
        logger.info("Johnny the Joiner builds the staircases required for the home");
        johnny.addComponents();
    }

    @Override
    public void addComponents() {
      logger.info("basement staircase installed");
      logger.info("foyer staircase installed");
    }
}
