package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.subcontractordepartments.Carpentering;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.*;

public class Carpenter extends Carpentering implements IInstallable, IModifiable, IFixable {

    private final Logger logger = Logger.getLogger(Carpenter.class.getName());

    public Carpenter(String name, String nameOfCompany) {
        super(name,nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected void fixturesAndFrameworks() {
        final Carpenter whitney = new Carpenter("Whitney", "AYR Group");

        try {
            FileHandler listOfRequiredItems = new FileHandler("src/test/logging.log.*");
            logger.addHandler(listOfRequiredItems);
            whitney.addComponents();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void modifyMaterials() {
        final Carpenter valerie = new Carpenter("Valerie", "AYR Group");
        HashMap<String, Double> itemToBeCutInFeet = new HashMap<>();
        itemToBeCutInFeet.put("50 wooden planks for first floor", 8.0);
        itemToBeCutInFeet.put("100 wooden planks for second floor", 8.0);



        try {
            for (Map.Entry<String, Double> set : itemToBeCutInFeet.entrySet()) {
                if (set.getValue() == 8.0) {
                   valerie.materialAltered();
                   break;
                } else {
                    logger.info(String.valueOf(false));
                    logger.warning("Please order more wood to cut to the appropriate length");
                }
            }

        } catch(NullPointerException e) {
            logger.warning("Please make sure everything is entered in correctly.");
        }

    }

    @Override
    protected HashMap<String, Boolean> damagedMaterial() {
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
