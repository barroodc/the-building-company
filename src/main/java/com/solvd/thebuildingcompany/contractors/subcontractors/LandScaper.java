package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IPlantable;

import java.util.logging.Logger;

public class LandScaper extends Contractor implements IPlantable {

    private static final Logger logger = Logger.getLogger(LandScaper.class.getName());

    private boolean fertilizerAdded;

    public boolean isFertilizerAdded() {
        return fertilizerAdded;
    }

    public void setFertilizerAdded(final boolean fertilizerAdded) {
        this.fertilizerAdded = fertilizerAdded;
    }

    public LandScaper(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void plantTheGreenery() {
        final LandScaper jeffery = new LandScaper("Jeffery", "NLX Group");
        logger.info(jeffery.getFirstName() + " the Landscaper begins planting the following greenery:");
        jeffery.plant();
        logger.info("Landscape work finished");
    }

    private void applyFertilizer() {
        final LandScaper vincent = new LandScaper("Vincent", "NLX Group");
        if(fertilizerAdded = true){
            logger.info(vincent.getFirstName() + " the Landscaper applied the fertilizer successfully");
        } else {
            logger.info(vincent.getFirstName() + " the Landscaper still needs to apply fertilizer");
        }
    }

    @Override
    public void plant() {
       logger.info("Jeffery plants the grass.");
       logger.info("Jeffery plants the trees");
       logger.info("Jeffery plants the bushes");
    }

}
