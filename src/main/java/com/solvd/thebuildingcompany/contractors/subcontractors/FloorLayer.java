package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.logging.Logger;

public class FloorLayer extends Contractor implements IInstallable {

    int oakWoodCount;
    int carpetSizeLength;
    private boolean sufficientOakWood;
    private boolean sufficientCarpet;

    public int getOakWoodCount() {
        return oakWoodCount;
    }

    public void setOakWoodCount(final int oakWoodCount) {
        this.oakWoodCount = oakWoodCount;
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

    private final Logger logger = Logger.getLogger(FloorLayer.class.getName());

    public FloorLayer(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void flooringSystemRoots() {
        final FloorLayer ian = new FloorLayer("Ian", "GHI Group");
        logger.info("Ian the Floor Layer installs the following foundational roots for the flooring of the home:");
        ian.addComponents();

    }

    private void hardwoodFloorInstalled() {
        oakWoodCount = 27;
        final FloorLayer zachary = new FloorLayer("Zachary", "GHI Group");
        if (oakWoodCount > 25) {
            logger.info("Sufficient amount of oakWood flooring to complete the floor: " + !sufficientOakWood);
            logger.info(zachary.getFirstName() + " the Floor Layer installs the hardwood floors in the family room.");
            logger.info("He also installs the hardwood floors in the living room.");
            logger.info("Hardwood floor installation complete.");
        }
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


    @Override
    protected Double earnings() {
        return null;
    }

}
