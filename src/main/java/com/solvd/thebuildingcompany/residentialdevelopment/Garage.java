package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.interfaces.IGarage;

import java.util.logging.Logger;

public class Garage extends HomeBuilder implements IGarage {

    private final Logger logger = Logger.getLogger(Garage.class.getName());

    @Override
    public void addGarage(int length, int width) {
        logger.info("Garage added");
    }
}
