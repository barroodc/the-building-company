package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.interfaces.IBedroom;


import java.util.logging.Logger;

public class Bedroom extends HomeBuilder implements IBedroom {

    private final Logger logger = Logger.getLogger(Bedroom.class.getName());

    @Override
    public void addBedroom(Object length, Object width) {
        logger.info("Bedroom added");
    }
}
