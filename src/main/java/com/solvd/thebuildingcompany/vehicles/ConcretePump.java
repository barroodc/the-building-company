package com.solvd.thebuildingcompany.vehicles;

import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.interfaces.IPourable;

import java.util.logging.Logger;

public class ConcretePump extends Vehicle implements IDrivable, IPourable {

    private final Logger logger = Logger.getLogger(ConcretePump.class.getName());

    private String name;

    public ConcretePump(String nameOfVehicle) {
        super(nameOfVehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void pour() {
       logger.info("pour cement");
    }

    @Override
    public void drive() {
       logger.info("put keys in ignition");
       logger.info("drive concrete pump to appropriate location");
    }
}
