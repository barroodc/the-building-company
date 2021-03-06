package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Plumber extends Contractor implements IInstallable {

    private static Logger logger = LogManager.getLogger(Carpenter.class);

    public Plumber(final String firstName, final String nameOfCompany) {
       super(firstName, nameOfCompany);
    }

    private void piping() {
       final Plumber mario = new Plumber("Mario","AZP Group");
       logger.info("Mario the Plumber now installs the following: ");
       mario.addComponents();
    }

    @Override
    public void addComponents() {
        logger.info("pipes installed in interior walls, ceilings and floors");
        logger.info("sewer lines and vents are installed");
        logger.info("water supply lines for each fixture are installed");
        logger.info("bathtubs and shower units are installed");
        logger.info("Sinks, toilets and faucets put into place");
    }
}
