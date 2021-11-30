package com.solvd.thebuildingcompany.residentialdevelopment;

import com.solvd.thebuildingcompany.interfaces.ILivingRoom;

import java.util.logging.Logger;

public class LivingRoom extends HomeBuilder implements ILivingRoom {

    private final Logger logger = Logger.getLogger(LivingRoom.class.getName());

    @Override
    public void addLivingRoom(int length, int width) {
        logger.info("Living Room Added");
    }
}
