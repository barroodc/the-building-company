package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class GradingContractor extends Contractor {

    private static Logger logger = LogManager.getLogger(GradingContractor.class);

    private boolean zoningBoardApproval;

    public boolean isZoningBoardApproval() {
        return zoningBoardApproval;
    }

    public void setZoningBoardApproval(final boolean zoningBoardApproval) {
        this.zoningBoardApproval = zoningBoardApproval;
    }

    public GradingContractor(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }


    private void propertyDrainageAssured() {
     final GradingContractor tina = new GradingContractor("Tina", "LBV Group");
     final ArrayList<String> developmentsApproved = new ArrayList<>();
     developmentsApproved.add("Sycamore Village");

     if (developmentsApproved.contains("Sycamore Village")) {
         zoningBoardApproval = true;
         logger.info("Grading process begins.");
         logger.info(tina.getFirstName() + " received approval from zoning board: " + zoningBoardApproval);
         logger.info("Water flow from rain is officially not an issue");
         logger.info("The development is still in good standing and ready to hear offers");
     } else {
         logger.info(tina.getFirstName() + " received approval from zoning board: " + !zoningBoardApproval);
         logger.info("Please try and relocate homes for parts of the development that are not safe from the rain");
     }
    }

    private void foundationAreaCheck() {
      final GradingContractor elijah = new GradingContractor("Elijah", "LBV Group");
      final ArrayList<String> developmentsNeedingLeveling = new ArrayList<>();
      developmentsNeedingLeveling.add("Princeton Heights");
      developmentsNeedingLeveling.add("Fox Run Village");

      if (!developmentsNeedingLeveling.contains("Sycamore Village")){
          logger.info("Final stage in the grading process begins");
          logger.info("Approved to move forward with final parts of construction.");
          logger.info("Grading process ends");
      } else {
          logger.info(elijah.getFirstName() + " must talk to demolition about leveling specific areas of land within the development.");
      }

    }
}
