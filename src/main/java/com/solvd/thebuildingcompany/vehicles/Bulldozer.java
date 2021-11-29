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
      logger.info("Push rocks");
      logger.info("Push trees");
      logger.info("Push debris");
    }

    @Override
    public void drive() {
      logger.info("put keys in ignition");
      logger.info("drive bulldozer");
    }
}
