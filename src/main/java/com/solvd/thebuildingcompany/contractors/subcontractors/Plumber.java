package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Plumber extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    @Override
    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private static Logger logger = LogManager.getLogger(Carpenter.class);

    public Plumber(String name, String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    private void piping() {
       final Plumber mario = new Plumber("Mario","AZP Group");
       logger.info("Mario the Plumber now installs the following: ");
       mario.addComponents();
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("pipes installed in interior walls, ceilings and floors");
        logger.info("sewer lines and vents are installed");
        logger.info("water supply lines for each fixture are installed");
        logger.info("bathtubs and shower units are installed");
    }
}
