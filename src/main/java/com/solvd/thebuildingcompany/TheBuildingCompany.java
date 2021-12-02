package com.solvd.thebuildingcompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;


public class TheBuildingCompany {


    private ArrayList<String> typeOfConstruction;


    public ArrayList<String> getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(final ArrayList<String> typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    private final static Logger logger = LogManager.getLogger(TheBuildingCompany.class);

    private void welcomeMessage() {
        logger.info("Welcome to The Building Company");
    }

    private void ourOfficeLocations() {
       logger.info("Our office locations are as follows:");
       ArrayList<String> locations = new ArrayList<>();
       locations.add("New York");
       locations.add("California");
       locations.add("New Jersey");

       logger.info(locations);
    }

    private void specializations() {
        logger.info("We specialize in Residential Development");
        logger.info("The specific types of homes we specialize in are as follows:");
        typeOfConstruction = new ArrayList<>();

        typeOfConstruction.add("Tudor");
        typeOfConstruction.add("Colonial");
        typeOfConstruction.add("Victorian");

        logger.info(typeOfConstruction);
    }


    private void locationAndNaming() {
        logger.info("Location and name of Suburban developments:");
        HashMap<String, String> nameOfProjectAndLocation = new HashMap<>();
        nameOfProjectAndLocation.put("New York", "Butler Heights");
        nameOfProjectAndLocation.put("California", "Horizon Estates");
        nameOfProjectAndLocation.put("New Jersey", "Highland Hills");

        logger.info("Project discussions for Highland Hills in Princeton, New Jersey are under way: ");
        logger.info(nameOfProjectAndLocation);
    }

    private void approvalStatusOfProjects() {
        logger.info("Approval Status of Open Projects:");
        HashMap<String, Boolean> projectAndGovernmentApproval = new HashMap<>();
        projectAndGovernmentApproval.put("Chestnut Lake ", false);
        projectAndGovernmentApproval.put("Victory Lakes ", false);
        projectAndGovernmentApproval.put("Sycamore Village ", true);

        int numberOfActiveProjects = 1;

        logger.info(projectAndGovernmentApproval);
        logger.info("Number of active projects: " + numberOfActiveProjects);

    }
}
