package com.solvd.thebuildingcompany.vehicles;

import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.genericinterfaces.IPourable;

import java.util.logging.Logger;

public class ConcretePump extends Vehicle implements IDrivable, IPourable {

    private static final Logger logger = Logger.getLogger(ConcretePump.class.getName());


    public ConcretePump(final String nameOfVehicle) {
        super(nameOfVehicle);
    }

    public ConcretePump(final String nameOfVehicle, final String operatorOfVehicle) {
        super(nameOfVehicle, operatorOfVehicle);

    }


    @Override
    public void drive() {
       logger.info(" Penny put the keys in ignition");
       logger.info(" Penny drove the concrete pump to appropriate location");
    }


    


    @Override
    public void pour(Object x) {
        logger.info("Penny used the concrete pump to pour cement");
    }


}
