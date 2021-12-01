package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.logging.FileHandler;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Carpenter extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;
    private int expectedNumberOfFixtures;
    private int expectedNumberOfFrameworks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public int getExpectedNumberOfFixtures() {
        return expectedNumberOfFixtures;
    }

    public void setExpectedNumberOfFixtures(int expectedNumberOfFixtures) {
        this.expectedNumberOfFixtures = expectedNumberOfFixtures;
    }

    public int getExpectedNumberOfFrameworks() {
        return expectedNumberOfFrameworks;
    }

    public void setExpectedNumberOfFrameworks(int expectedNumberOfFrameworks) {
        this.expectedNumberOfFrameworks = expectedNumberOfFrameworks;
    }

    private static Logger logger = LogManager.getLogger(Carpenter.class);

    public Carpenter(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
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

}
