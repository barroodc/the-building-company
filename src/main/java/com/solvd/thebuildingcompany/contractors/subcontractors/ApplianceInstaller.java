package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ApplianceInstaller extends Contractor implements IInstallable {


    public ApplianceInstaller(final String firstName, final String nameOfCompany) {
        super(firstName,nameOfCompany);
    }

    private static Logger logger = LogManager.getLogger(ActiveConstruction.class);


    public void appliancesInstalled() {
       final ApplianceInstaller georgina = new ApplianceInstaller("Georgina", "WeInstallItAll");
       logger.info("Georgina from WeInstallItAll installs the following appliances for the home: ");
       georgina.addComponents();
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("Doors");
        logger.info("Window Sills");
        logger.info("Decorative Trim");
        logger.info("Countertops");
        logger.info("Vanities");
        logger.info("Cabinets");
        logger.info("Refrigerator");
        logger.info("Microwave");
        logger.info("Oven");
        logger.info("Fireplace Mantel");
    }
}
