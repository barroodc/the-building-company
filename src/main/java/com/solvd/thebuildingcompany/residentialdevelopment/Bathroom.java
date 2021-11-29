package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.HomeBuilder;
import com.solvd.thebuildingcompany.interfaces.IBathroom;


import java.util.logging.Logger;

public class Bathroom extends HomeBuilder implements IBathroom {
    private final Logger logger = Logger.getLogger(Bathroom.class.getName());


    @Override
    public void addBathroom(Object length, Object width) {
        logger.info("Bathroom added");
    }
}
