package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class Electrician extends Contractor implements IInstallable {

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

    private final Logger logger = Logger.getLogger(Electrician.class.getName());

    public Electrician(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void installElectricalComponents() {
        final Electrician brandon = new Electrician("Brandon", "DEF Group");
        logger.info("Brandon begins doing electrical work on the home: ");
        brandon.addComponents();
    }

    private boolean electricalComponentInspection() {
        final Electrician bruce = new Electrician("Bruce", "DEF Group");
        //monitorable interface?
        return false;
    }

    @Override
    public void addComponents() {
      logger.info("runs wires from the breaker panel to each receptacle");
      logger.info("ductwork for HVAC system applied");
      logger.info("receptacles for outlets are installed");
      logger.info("lights and switches are installed");
    }
}
