package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.HashMap;

public class CleanupContractor extends Contractor implements ICleanable {

    private String name;
    private String nameOfCompany;
    private boolean jobCompleted;

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

    public CleanupContractor(String name, String nameOfCompany){
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    public boolean isJobCompleted() {
        return jobCompleted;
    }

    public void setJobCompleted(boolean jobCompleted) {
        this.jobCompleted = jobCompleted;
    }

    private static Logger logger = LogManager.getLogger(CleanupContractor.class);

    private void interiorCleanup() {
      final CleanupContractor emily = new CleanupContractor("Emily","ZWF Group");
      logger.info("Time to bring in the cleanup crew.");
      if (!jobCompleted){
          logger.info(emily.getName() + " cleaned all the rooms in the home");
          cleanArea();
      } else {
          logger.info(emily.getName() + " is still in the process of getting everywhere inside the home cleaned.");
      }
    }

    private void exteriorCleanup() {
        final CleanupContractor chris = new CleanupContractor("Chris","ZWF Group");
        if (!jobCompleted){
            logger.info(chris.getName() + " cleaned the area outside the home.");
            cleanArea();
            logger.info("Officially ready to complete landscaping.");
        } else {
            logger.info(chris.getName() + " is still in the process of getting everywhere outside the home cleaned.");
            logger.info("More cleanup work needs to be done before landscaping can be completed.");
        }
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void cleanArea() {
        logger.error("area successfully cleaned");
    }
}
