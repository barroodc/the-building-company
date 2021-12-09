package com.solvd.thebuildingcompany.vehicles;

import com.solvd.thebuildingcompany.generics.IDig;
import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.interfaces.IPave;

import java.util.logging.Logger;

public class BackhoeLoader extends Vehicle implements IDrivable, IDig, IPave {

    private static final Logger logger = Logger.getLogger(BackhoeLoader.class.getName());

    public BackhoeLoader(final String nameOfVehicle) {
        super(nameOfVehicle);
    }

    public BackhoeLoader(final String nameOfVehicle, final String operatorOfVehicle) {
        super(nameOfVehicle, operatorOfVehicle);

    }

    @Override
    public void drive() {
        logger.info("Doug put the keys in the ignition");
        logger.info("Doug drove to the designated area");
    }


    @Override
    public void pave() {
     logger.info("Doug paved the area to smooth over dirt");
    }


    public void finishedTheJob() {
        logger.info("Doug finished the job");
        logger.info("Foundation wall complete");
    }


    @Override
    public void dig(Object x) {
        logger.info("Doug excavated dirt using the BackhoeLoader");
    }
}
