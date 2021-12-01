package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Joiner extends Contractor implements IInstallable {

    private static Logger logger = LogManager.getLogger(Joiner.class);

    private String name;
    private String nameOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public Joiner(String name, String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    private void buildingStairs() {
        final Joiner johnny = new Joiner("Johnny", "SOT Group");
        logger.info("Johnny the Joiner builds the staircases required for the home");
        johnny.addComponents();
    }

    @Override
    protected Double earnings() {
        return null;
    }


    @Override
    public void addComponents() {
      logger.info("basement staircase installed");
      logger.info("foyer staircase installed");
    }
}
