package com.solvd.thebuildingcompany.vehicles;

import com.solvd.thebuildingcompany.employees.departments.engineering.ElectricalEngineer;
import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.interfaces.IPushable;

import java.util.logging.Logger;

public class Bulldozer extends Vehicle implements IDrivable, IPushable {

    private final Logger logger = Logger.getLogger(Bulldozer.class.getName());

    public Bulldozer(String nameOfVehicle) {
        super(nameOfVehicle);
    }

    @Override
    public void push() {
      logger.info("The bulldozer pushed all the rocks out of the way.");
      logger.info("The bulldozer pushed all the trees out of the way.");
      logger.info("The bulldozer pushed all the debris out of the way.");
    }

    @Override
    public void drive() {
      logger.info("Gerald put the keys in ignition");
      logger.info("Gerald drove the bulldozer to the appropriate location");
    }
}
