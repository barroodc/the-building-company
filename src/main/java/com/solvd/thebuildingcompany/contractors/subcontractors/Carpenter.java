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


public class Carpenter extends Contractor implements IInstallable, IModifiable, IFixable {

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

    private void fixturesAndFrameworks() {
       FlooringContractor byron = new FlooringContractor();
    }

    private void modifyMaterials() {


    }

    private HashMap<String, Boolean> damagedMaterial() {
        final Carpenter jonah = new Carpenter("Jonah", "AYR Group");
        HashMap<String, Boolean> materialInGoodShape = new HashMap<>();

        try {
            materialInGoodShape.put("Wood for kitchen", true);
            logger.info(jonah.getName() + ": Confirmed ");
            Thread.sleep(2);
            materialInGoodShape.put("Wood for Dining Room", false);
            logger.info(jonah.getName() + "Confirmed ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return materialInGoodShape;
    }

    @Override
    public void addComponents() {
        logger.info("Add Windows");
        logger.info("Add Siding");
        logger.info("Add Cabinets");
        logger.info("Add Walls");
        logger.info("Add Floors");
        logger.info("Add Door Frames");
    }

    @Override
    public void materialAltered() {
        logger.info("Wood cut to appropriate length");
    }

    @Override
    public void fixBuildingMaterial() {
        logger.info("Search for and fix damaged material");
    }
}
