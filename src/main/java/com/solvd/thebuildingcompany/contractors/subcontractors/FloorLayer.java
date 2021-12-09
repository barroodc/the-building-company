package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.function.Function;
import java.util.logging.Logger;

public class FloorLayer extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(FloorLayer.class.getName());

    int oakWoodCount;
    int mapleWoodCount;
    int totalAmountOfWood;
    int carpetSizeLength;
    private boolean sufficientOakWood;
    private boolean sufficientCarpet;

    public int getOakWoodCount() {
        return oakWoodCount;
    }

    public void setOakWoodCount(final int oakWoodCount) {
        this.oakWoodCount = oakWoodCount;
    }

    public int getMapleWoodCount() {
        return mapleWoodCount;
    }

    public void setMapleWoodCount(int mapleWoodCount) {
        this.mapleWoodCount = mapleWoodCount;
    }

    public int getTotalAmountOfWood() {
        return totalAmountOfWood;
    }

    public void setTotalAmountOfWood(int totalAmountOfWood) {
        this.totalAmountOfWood = totalAmountOfWood;
    }

    public boolean isSufficientCarpet() {
        return sufficientCarpet;
    }

    public void setSufficientCarpet(final boolean sufficientCarpet) {
        this.sufficientCarpet = sufficientCarpet;
    }

    public int getCarpetSizeLength() {
        return carpetSizeLength;
    }

    public void setCarpetSizeLength(final int carpetSizeLength) {
        this.carpetSizeLength = carpetSizeLength;
    }

    public boolean isSufficientOakWood() {
        return sufficientOakWood;
    }

    public void setSufficientOakWood(final boolean sufficientOakWood) {
        this.sufficientOakWood = sufficientOakWood;
    }


    public FloorLayer(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void flooringSystemRoots() {
        final FloorLayer ian = new FloorLayer("Ian", "GHI Group");
        logger.info("Ian the Floor Layer installs the following foundational roots for the flooring of the home:");
        ian.addComponents();

    }

    private void hardwoodFloorInstalled() {
        final FloorLayer zachary = new FloorLayer("Zachary", "GHI Group");
        int minimumConstraint = 25;
        int maximumConstraint = 50;
        mapleWoodCount = 20;

        oakWoodCount = (int) Math.floor(Math.random() * (maximumConstraint - minimumConstraint + 1) + minimumConstraint);
        Function<Integer, Integer> woodAcquired = a -> a + oakWoodCount;
        totalAmountOfWood = (woodAcquired.apply(mapleWoodCount));

        int negativeResults = 1;
        do {
            if (totalAmountOfWood != 40) {
                logger.info(zachary.getFirstName() + " the Floor Layer still needs to order more wood for the housing project.");
                negativeResults++;
            }
        } while (negativeResults <= 5);

        int positiveResults = 0;

        do {
            logger.info(zachary.getFirstName() + " the Floor Layer has ordered a sufficient amount of wood to continue the housing project.");
            logger.info("Oak Wood Count: " + oakWoodCount);
            logger.info("Maple Wood Count: " + mapleWoodCount);
            positiveResults++;
        } while (positiveResults < 1);
    }

    private void carpetInstalled() {
        carpetSizeLength = 100;
        final FloorLayer pierre = new FloorLayer("Pierre", "GHI Group");
        if (carpetSizeLength >= 100) {
            logger.info("Sufficient length (in feet) or carpet needed to cover all bedrooms: " + !sufficientCarpet);
            logger.info(pierre.getFirstName() + " the Floor Layer successfully installs carpets in all of the bedrooms.");
            logger.info("carpet installation complete.");
        }
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
}
