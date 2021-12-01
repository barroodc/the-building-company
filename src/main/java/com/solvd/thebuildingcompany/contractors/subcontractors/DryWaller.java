package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Logger;

public class DryWaller extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;
    private boolean dryWallPanelsAvailable;
    private boolean measurementsTook;
    private int numberOfMistakesMade;
    private double rValue; //(degrees kelvin * meters squared) / (divided by Watts)
    private double lambdaT; //is the temperature difference between the warmer surface and the colder surface of a barrier.
    private double phiSubQ; // is the heat flux through the barrier.




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

    public boolean isDryWallPanelsAvailable() {
        return dryWallPanelsAvailable;
    }

    public void setDryWallPanelsAvailable(boolean dryWallPanelsAvailable) {
        this.dryWallPanelsAvailable = dryWallPanelsAvailable;
    }

    public boolean isMeasurementsTook() {
        return measurementsTook;
    }

    public void setMeasurementsTook(boolean measurementsTook) {
        this.measurementsTook = measurementsTook;
    }

    public int getNumberOfMistakesMade() {
        return numberOfMistakesMade;
    }

    public void setNumberOfMistakesMade(int numberOfMistakesMade) {
        this.numberOfMistakesMade = numberOfMistakesMade;
    }

    private static final Logger logger = Logger.getLogger(DryWaller.class.getName());


    public DryWaller(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void rValueOfInsulation() {
        //Indicates how well the insulation material resists heat transfer
        final DryWaller steve = new DryWaller("Steve", "YZW Group");
        lambdaT = 20.7;
        phiSubQ = 8.12;
        rValue = (lambdaT / phiSubQ);
        logger.info("Now we must figure out the r value for the fiber glass insulation");
        logger.info("Steve measured the degrees for the r value equation in degrees celsius");
        logger.info("The current temperature outside is 5.31 degrees Celsius");
        logger.info("The current temperature inside is 22.7 degrees Celsius");
        logger.info("The temperature difference between outside and inside is 17.39 degrees Celsius");
        logger.info("The heat flux through the barrier is calculated to be around 8.12 degrees Celsius");
        if (rValue >= 2.1 && rValue <= 2.7) {
            logger.info("This is a good r value for insulation");
            logger.info(steve.getName() + "'s rvalue for the fiberglass is acceptable.");
        } else {
            logger.info("Better material for insulation is highly recommended.");
        }

    }

    private void fiberGlassAndDrywallInstall() {
        final DryWaller robert = new DryWaller("Robert", "YZW Group");
        robert.setDryWallPanelsAvailable(true);

        if (robert.isDryWallPanelsAvailable()) {
            logger.info("Drywall is available and ready for use");
            robert.addComponents();
        } else {
            logger.warning("Need to order dry wall panels");
        }
    }


    public static void main(String[] args) {
        DryWaller example = new DryWaller("H","H");
        example.rValueOfInsulation();
        example.fiberGlassAndDrywallInstall();
    }

    @Override
    public void addComponents() {
      logger.info("Add fiberglass insulation:");
      logger.info("Fiberglass added to attic");
      logger.info("Fiberglass added to exterior walls");
      logger.info("Fiber glass added to basement floor");
      logger.info("Fiber glass added to bathroom");
      logger.info("Fiber glass added to crawl space");
      logger.info("Now Steve adds Drywall to all rooms in the house");
    }

}
