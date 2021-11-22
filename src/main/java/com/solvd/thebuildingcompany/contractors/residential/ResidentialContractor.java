package com.solvd.thebuildingcompany.contractors.residential;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ResidentialContractor {

    private boolean suppliesAvailable;
    private String name;
    private String contractorCompany;
    private int totalNumberOfNeededSupplies;


    public boolean isSuppliesAvailable() {
        return suppliesAvailable;
    }

    public void setSuppliesAvailable(boolean suppliesAvailable) {
        this.suppliesAvailable = suppliesAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractorCompany() {
        return contractorCompany;
    }

    public void setContractorCompany(String contractorCompany) {
        this.contractorCompany = contractorCompany;
    }

    public int getTotalNumberOfNeededSupplies() {
        return totalNumberOfNeededSupplies;
    }

    public void setTotalNumberOfNeededSupplies(int totalNumberOfNeededSupplies) {
        this.totalNumberOfNeededSupplies = totalNumberOfNeededSupplies;
    }

    private final Logger logger = Logger.getLogger(ResidentialContractor.class.getName());

    public ResidentialContractor(String name, String contractorCompany) {
        super();
        this.setName(name);
        this.setContractorCompany(contractorCompany);
    }

    private HashMap<String, String> whoOverseesConstruction() {
        final ResidentialContractor marcus = new ResidentialContractor("Marcus", "PQR Group");
        final ResidentialContractor april = new ResidentialContractor("April", "PQR Group");
        final ResidentialContractor stacy = new ResidentialContractor("Stacy", "PQR Group");

        final HashMap<String, String> contractorAndProject = new HashMap<>();
        contractorAndProject.put(marcus.getName(), "New York Residential Project");
        contractorAndProject.put(april.getName(), "New Jersey Residential Project");
        contractorAndProject.put(stacy.getName(), "California Residential Project");

        for (Map.Entry<String, String> set : contractorAndProject.entrySet()) {
            logger.info(set.getKey());
        }

        return contractorAndProject;
    }

    private HashMap<String, String> whoHandlesPaperwork() {
        final ResidentialContractor harry = new ResidentialContractor("Harry", "PQR Group");
        final ResidentialContractor reginald = new ResidentialContractor("Reginald", "PQR Group");
        final ResidentialContractor amelia = new ResidentialContractor("Amelia", "PQR Group");

        final HashMap<String, String> assignedToPaperwork = new HashMap<>();
        assignedToPaperwork.put(harry.getName(), "Site Registration Documents");
        assignedToPaperwork.put(reginald.getName(), "Quality Control Inspection Documents");
        assignedToPaperwork.put(amelia.getName(), "Incentive Application Documents");

        for (Map.Entry<String, String> set : assignedToPaperwork.entrySet()) {
            logger.info(set.getKey());
        }

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

        int count = 0;
        setTotalNumberOfNeededSupplies(6);
        for (Map.Entry<String, Boolean> set : supplyStatus.entrySet()) {
            if(set.getValue().equals(true)){
                count++;
            }
        }
        if (count == 6) {
            logger.info("true");
            return (!elizabeth.isSuppliesAvailable());
        } else {
            logger.warning("false");
            return elizabeth.isSuppliesAvailable();
        }
    }

    private HashMap<String, String> brandNewSubcontractorsHired() {
        final ResidentialContractor jacob = new ResidentialContractor("Jacob", "PQR Group");
        final HashMap<String, String> hiredByAndHired = new HashMap<>();
        hiredByAndHired.put(jacob.getName(), "XYZ Group");
        hiredByAndHired.put(jacob.getName(), "AYR Group");
        hiredByAndHired.put(jacob.getName(), "NXE Group");
        hiredByAndHired.put(jacob.getName(), "YZW Group");
        hiredByAndHired.put(jacob.getName(), "DEF Group");
        hiredByAndHired.put(jacob.getName(), "ABC Group");
        hiredByAndHired.put(jacob.getName(), "GHI Group");
        hiredByAndHired.put(jacob.getName(), "JKL Group");
        hiredByAndHired.put(jacob.getName(), "MNO Group");
        hiredByAndHired.put(jacob.getName(), "NLX Group");
        hiredByAndHired.put(jacob.getName(), "STU Group");
        hiredByAndHired.put(jacob.getName(), "AZB Group");
        hiredByAndHired.put(jacob.getName(), "BMX Group");
        hiredByAndHired.put(jacob.getName(), "ROF Group");
        hiredByAndHired.put(jacob.getName(), "SAB Group");
        hiredByAndHired.put(jacob.getName(), "TSE Group");
        hiredByAndHired.put(jacob.getName(), "NAC Group");

        for (Map.Entry<String, String> set : hiredByAndHired.entrySet()) {
            logger.info(set.getKey());
        }
        return hiredByAndHired;
    }
}
