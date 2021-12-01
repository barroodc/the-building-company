package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class GradingContractor extends Contractor {

    private String name;
    private String nameOfCompany;
    private boolean zoningBoardApproval;
    private boolean levelingForLandNeeded;

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

    public boolean isZoningBoardApproval() {
        return zoningBoardApproval;
    }

    public void setZoningBoardApproval(boolean zoningBoardApproval) {
        this.zoningBoardApproval = zoningBoardApproval;
    }

    public boolean isLevelingForLandNeeded() {
        return levelingForLandNeeded;
    }

    public void setLevelingForLandNeeded(boolean levelingForLandNeeded) {
        this.levelingForLandNeeded = levelingForLandNeeded;
    }

    public GradingContractor(String name, String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    private static Logger logger = LogManager.getLogger(GradingContractor.class);

    private void propertyDrainageAssured() {
     final GradingContractor tina = new GradingContractor("Tina", "LBV Group");
     ArrayList<String> developmentsApproved = new ArrayList<>();
     developmentsApproved.add("Sycamore Village");

     if (developmentsApproved.contains("Sycamore Village")) {
         zoningBoardApproval = true;
         logger.info("Grading process begins.");
         logger.info(tina.getName() + " received approval from zoning board: " + zoningBoardApproval);
         logger.info("Water flow from rain is officially not an issue");
         logger.info("The development is still in good standing and ready to hear offers");
     } else {
         logger.info(tina.getName() + " received approval from zoning board: " + !zoningBoardApproval);
         logger.info("Please try and relocate homes for parts of the development that are not safe from the rain");
     }
    }

    private void foundationAreaCheck() {
      final GradingContractor elijah = new GradingContractor("Elijah", "LBV Group");
      ArrayList<String> developmentsNeedingLeveling = new ArrayList<>();
      developmentsNeedingLeveling.add("Princeton Heights");
      developmentsNeedingLeveling.add("Fox Run Village");

      if (!developmentsNeedingLeveling.contains("Sycamore Village")){
          logger.info("Final stage in the grading process begins");
          logger.info("Approved to move forward with final parts of construction.");
          logger.info("Grading process ends");
      } else {
          logger.info(elijah.getName() + " must talk to demolition about leveling specific areas of land within the development.");
      }

    }

    public static void main(String[] args) {
        GradingContractor jack = new GradingContractor("Jack", "J");
        jack.propertyDrainageAssured();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
