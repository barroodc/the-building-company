package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.logging.Logger;

public class Roofer extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(Roofer.class.getName());

    public Roofer(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void roofInstallationComplete() {
        final Roofer brian = new Roofer("Brian", "ROF Group");
        logger.info("Brian the Roofer begins installing the roof");
        brian.addComponents();
        logger.info("Brian completes the installation of the Roof");
    }

    @Override
    public void addComponents() {
      logger.info("rafter installed");
      logger.info("collar beam installed");
      logger.info("ridge board installed");
      logger.info("solid decking installed");
      logger.info("felt underlayment installed");
      logger.info("vent pipe flashing installed");
      logger.info("gutter installed");
      logger.info("down spout installed");
      logger.info("splash block installed");
      logger.info("rake installed");
      logger.info("lookout installed");
      logger.info("facia installed");
      logger.info("additional ridge board installed");
      logger.info("valley underlayment installed");
      logger.info("spaced sheathing installed");
      logger.info("shingles added");
      logger.info("chimney with flashing installed");
    }
}
