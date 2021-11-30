package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IMonitorable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class Roofer extends Contractor implements IMonitorable, IMeasurable, IInstallable {

    private String name;
    private String nameOfCompany;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private final Logger logger = Logger.getLogger(Roofer.class.getName());

    public Roofer(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean roofPreInspections() {
        final Roofer sebastian = new Roofer("Sebastian", "ROF Group");
        return false;
    }

    private void roofInstallationComplete() {
        final Roofer brian = new Roofer("Brian", "ROF Group");
        logger.info("Brian the Roofer begins installing the roof");
        brian.addComponents();
        logger.info("Brian completes the installation of the Roof");
    }

    @Override
    public void monitorProcess() {

    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void addComponents() {
      logger.info("rafter installed");
      logger.info("collar beam installed");
      logger.info("ridge board installed");
      logger.info("solid decking installed");
      logger.info("felt underlayment installed");
      logger.info("vent pipe flashing installed");
      logger.info("gutter installed");
      logger.info("down spout installed");
      logger.info("splash block installed");
      logger.info("rake installed");
      logger.info("lookout installed");
      logger.info("facia installed");
      logger.info("additional ridge board installed");
      logger.info("valley underlayment installed");
      logger.info("spaced sheathing installed");
      logger.info("shingles added");
      logger.info("chimney with flashing installed");
    }
}
