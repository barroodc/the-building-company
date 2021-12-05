package com.solvd.thebuildingcompany.contractors.residential;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.*;
import java.util.logging.Logger;

public class ResidentialContractor extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(ResidentialContractor.class.getName());

    private boolean suppliesAvailable;
    private int totalNumberOfNeededSupplies;


    public boolean isSuppliesAvailable() {
        return suppliesAvailable;
    }

    public void setSuppliesAvailable(final boolean suppliesAvailable) {
        this.suppliesAvailable = suppliesAvailable;
    }

    public int getTotalNumberOfNeededSupplies() {
        return totalNumberOfNeededSupplies;
    }

    public void setTotalNumberOfNeededSupplies(final int totalNumberOfNeededSupplies) {
        this.totalNumberOfNeededSupplies = totalNumberOfNeededSupplies;
    }


    public ResidentialContractor(final String fistName, final String nameOfCompany) {
        super(fistName,nameOfCompany);
    }

    private HashMap<String, String> whoOverseesConstruction() {
        final ResidentialContractor marcus = new ResidentialContractor("Marcus", "PQR Group");
        final ResidentialContractor april = new ResidentialContractor("April", "PQR Group");
        final ResidentialContractor stacy = new ResidentialContractor("Stacy", "PQR Group");

        final HashMap<String, String> contractorAndProject = new HashMap<>();
        contractorAndProject.put(marcus.getFirstName(), "New York Residential Project");
        contractorAndProject.put(april.getFirstName(), "New Jersey Residential Project");
        contractorAndProject.put(stacy.getFirstName(), "California Residential Project");

        contractorAndProject.forEach((key, value) -> logger.info(key));

        return contractorAndProject;
    }

    private HashMap<String, String> whoHandlesPaperwork() {
        final ResidentialContractor harry = new ResidentialContractor("Harry", "PQR Group");
        final ResidentialContractor reginald = new ResidentialContractor("Reginald", "PQR Group");
        final ResidentialContractor amelia = new ResidentialContractor("Amelia", "PQR Group");

        final HashMap<String, String> assignedToPaperwork = new HashMap<>();
        assignedToPaperwork.put(harry.getFirstName(), "Site Registration Documents");
        assignedToPaperwork.put(reginald.getFirstName(), "Quality Control Inspection Documents");
        assignedToPaperwork.put(amelia.getFirstName(), "Incentive Application Documents");

        assignedToPaperwork.forEach((key, value) -> logger.info(key));

        return assignedToPaperwork;
    }

    private Boolean ensuresBuildingSuppliesComplete() {
        final ResidentialContractor elizabeth = new ResidentialContractor("Elizabeth", "PQR Group");
        final HashMap<String, Boolean> supplyStatus = new HashMap<>();
        supplyStatus.put("Wood", !isSuppliesAvailable());
        supplyStatus.put("Plastic", !isSuppliesAvailable());
        supplyStatus.put("Glass", !isSuppliesAvailable());
        supplyStatus.put("Metal", !isSuppliesAvailable());
        supplyStatus.put("Bricks", !isSuppliesAvailable());
        supplyStatus.put("Concrete", !isSuppliesAvailable());

        int count;
        this.totalNumberOfNeededSupplies = 6;
        count = (int) supplyStatus.entrySet().stream().filter(set -> set.getValue().equals(true)).count();
        if (count == 6) {
            logger.info("true");
            return (!elizabeth.isSuppliesAvailable());
        } else {
            logger.warning("false");
            return elizabeth.isSuppliesAvailable();
        }
    }

    private HashMap<String, List<String>> brandNewSubcontractorCompanies() {
        final ResidentialContractor jacob = new ResidentialContractor("Jacob", "PQR Group");
        final HashMap<String, List<String>> hiredByJacob = new HashMap<>();
        final List<String> contractorsHired = new ArrayList<>();
        contractorsHired.add("XYZ Group");
        contractorsHired.add("AYR Group");
        contractorsHired.add("NXE Group");
        contractorsHired.add("YZW Group");
        contractorsHired.add("DEF Group");
        contractorsHired.add("ABC Group");
        contractorsHired.add("AZB Group");
        contractorsHired.add("BMX Group");
        contractorsHired.add("ROF Group");
        contractorsHired.add("SAB Group");
        contractorsHired.add("TSE Group");
        contractorsHired.add("NAC Group");

        hiredByJacob.put(jacob.getFirstName(), contractorsHired);
        hiredByJacob.forEach((key, value) -> logger.info(key + " " + "hired the following subcontractors" + " " + value));
        return hiredByJacob;
    }

    private void lastMinuteInstallations(){
        final ResidentialContractor meghan = new ResidentialContractor("Meghan", "PQR Group");
        logger.info("Clean test done");
        IInstallable<String> iInstall = () ->{
            logger.info(meghan.getFirstName() + "one of our Residential Contractors decided to help us save money by installing some last minute things.");
            logger.info("Mirrors in all bathrooms added");
            logger.info("Shower doors in all bathrooms but the downstairs bathroom have been added");
        };
        iInstall.addComponents();
        meghan.addComponents();
    }

   @Override
    public void addComponents() {
        /*
        Marker interface

        values for the interface method are defined inside of the last minute
        installatoins method.
         */
    }
}
