package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IPlantable;
import com.solvd.thebuildingcompany.interfaces.ISprayable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class LandScaper extends Contractor implements IPlantable {

    private String name;
    private String nameOfCompany;
    private boolean fertilizerAdded;

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

    public boolean isFertilizerAdded() {
        return fertilizerAdded;
    }

    public void setFertilizerAdded(boolean fertilizerAdded) {
        this.fertilizerAdded = fertilizerAdded;
    }

    private static final Logger logger = Logger.getLogger(LandScaper.class.getName());

    public LandScaper(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void plantTheGreenery() {
        final LandScaper jeffery = new LandScaper("Jeffery", "NLX Group");
        logger.info(jeffery.getName() + " the Landscaper begins planting the following greenery:");
        jeffery.plant();
        logger.info("Landscape work finished");
    }

    private void applyFertilizer() {
        final LandScaper vincent = new LandScaper("Vincent", "NLX Group");
        if(fertilizerAdded = true){
            logger.info(vincent.getName() + " the Landscaper applied the fertilizer successfully");
        } else {
            logger.info(vincent.getName() + " the Landscaper still needs to apply fertilizer");
        }
    }

    @Override
    public void plant() {
       logger.info("Jeffery plants the grass.");
       logger.info("Jeffery plants the trees");
       logger.info("Jeffery plants the bushes");
    }

    public static void main(String[] args) {
        LandScaper j = new LandScaper("j", "w");
        j.plantTheGreenery();
    }
}
