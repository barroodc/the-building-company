package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.HashMap;

public class ApplianceInstaller extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    @Override
    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private static Logger logger = LogManager.getLogger(ActiveConstruction.class);


    public ApplianceInstaller(String name, String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

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
