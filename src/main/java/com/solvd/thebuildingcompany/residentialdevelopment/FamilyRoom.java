package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.HomeBuilder;
import com.solvd.thebuildingcompany.interfaces.IFamilyRoom;

import java.util.logging.Logger;

public class FamilyRoom extends HomeBuilder implements IFamilyRoom {

    private final Logger logger = Logger.getLogger(FamilyRoom.class.getName());

    @Override
    public void addFamilyRoom(Object length, Object width) {
        logger.info("Family Room Added");
    }
}
