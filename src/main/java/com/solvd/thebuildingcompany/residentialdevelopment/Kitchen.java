package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.interfaces.IKitchen;


import java.util.logging.Logger;

public class Kitchen extends HomeBuilder implements IKitchen {

    private final Logger logger = Logger.getLogger(Kitchen.class.getName());

    @Override
    public void addKitchen(int length, int width) {
        logger.info("Kitchen added");
    }
}
