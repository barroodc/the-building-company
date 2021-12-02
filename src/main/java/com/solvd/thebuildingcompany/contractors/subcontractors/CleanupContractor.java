package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CleanupContractor extends Contractor implements ICleanable {

    private boolean jobCompleted;

    public CleanupContractor(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    public boolean isJobCompleted() {
        return jobCompleted;
    }

    public void setJobCompleted(final boolean jobCompleted) {
        this.jobCompleted = jobCompleted;
    }

    private static Logger logger = LogManager.getLogger(CleanupContractor.class);

    private void interiorCleanup() {
      final CleanupContractor emily = new CleanupContractor("Emily","ZWF Group");
      logger.info("Time to bring in the cleanup crew.");
      if (!jobCompleted){
          logger.info(emily.getFirstName() + " cleaned all the rooms in the home");
          cleanArea();
      } else {
          logger.info(emily.getFirstName() + " is still in the process of getting everywhere inside the home cleaned.");
      }
    }

    private void exteriorCleanup() {
        final CleanupContractor chris = new CleanupContractor("Chris","ZWF Group");
        if (!jobCompleted){
            logger.info(chris.getFirstName() + " cleaned the area outside the home.");
            cleanArea();
            logger.info("Officially ready to complete landscaping.");
        } else {
            logger.info(chris.getFirstName() + " is still in the process of getting everywhere outside the home cleaned.");
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
