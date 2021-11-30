package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class FloorLayer extends Contractor implements IInstallable, ICleanable {

    private String name;
    private String nameOfCompany;

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

    private final Logger logger = Logger.getLogger(FloorLayer.class.getName());

    public FloorLayer(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void flooringSystemRoots() {
        final FloorLayer ian = new FloorLayer("Ian", "GHI Group");
        logger.info("Ian the Floor Layer installs the following foundational roots for the flooring of the home:");
        ian.addComponents();

    }

    private boolean carpetInstalled() {
        final FloorLayer pierre = new FloorLayer("Pierre", "GHI Group");
        return false;
    }

    private boolean hardwoodFloorInstalled() {
        final FloorLayer zachary = new FloorLayer("Zachary", "GHI Group");
        return false;
    }

    private boolean inspectAndCleanSurface() {
        final FloorLayer robert = new FloorLayer("Robert", "GHI Group");
        return false;
    }

    private boolean flooringMaterialsOrdered() {
        final FloorLayer terrance = new FloorLayer("Terrance", "GHI Group");
        return false;
    }

    @Override
    public void addComponents() {
        logger.info("wooden planks installed where applicable");
        logger.info("solid bridging installed");
        logger.info("joist hanger installed");
        logger.info("shield installed");
        logger.info("sub floor installed");
        logger.info("header joist installed");
        logger.info("pier and post installed");
        logger.info("girders installed");
        logger.info("sill installed");
    }

    @Override
    public void cleanArea() {

    }

    public static void main(String[] args) {
        FloorLayer example = new FloorLayer("Az","Dz");
        example.flooringSystemRoots();
    }
}
