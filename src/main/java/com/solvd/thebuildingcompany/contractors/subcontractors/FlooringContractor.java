package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.HashMap;

public class FlooringContractor extends Contractor implements IInstallable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Logger logger = LogManager.getLogger(FlooringContractor.class);


    public void floorSystemInstallation() {

    }


    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("Solid Bridging installed");
        logger.info("Joist Hanger installed");
        logger.info("Termite Shield installed");
        logger.info("Sub floor installed");
        logger.info("Header joist installed");
        logger.info("Pier and post installed");
        logger.info("Girders installed");
        logger.info("Sill installed");

    }
}
