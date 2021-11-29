package com.solvd.thebuildingcompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TheBuildingCompany {

    private static Logger logger = LogManager.getLogger(TheBuildingCompany.class);
    private ArrayList<String> locations;
    private ArrayList<String> typeOfConstruction;
    private int numberOfActiveProjects;
    private HashMap<String, String> nameOfProjectAndLocation;
    private HashMap<String, Boolean> projectAndGovernmentApproval;

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public ArrayList<String> getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(ArrayList<String> typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    public int getNumberOfActiveProjects() {
        return numberOfActiveProjects;
    }

    public void setNumberOfActiveProjects(int numberOfActiveProjects) {
        this.numberOfActiveProjects = numberOfActiveProjects;
    }

    public HashMap<String, String> getNameOfProjectAndLocation() {
        return nameOfProjectAndLocation;
    }

    public void setNameOfProjectAndLocation(HashMap<String, String> nameOfProjectAndLocation) {
        this.nameOfProjectAndLocation = nameOfProjectAndLocation;
    }

    public HashMap<String, Boolean> getProjectAndGovernmentApproval() {
        return projectAndGovernmentApproval;
    }

    public void setProjectAndGovernmentApproval(HashMap<String, Boolean> projectAndGovernmentApproval) {
        this.projectAndGovernmentApproval = projectAndGovernmentApproval;
    }

    private void welcomeMessage() {
        logger.info("Welcome to The Building Company");
    }

    private void ourOfficeLocations() {
       logger.info("Our office locations are as follows:");
       locations = new ArrayList<>();
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
        nameOfProjectAndLocation = new HashMap<>();
        nameOfProjectAndLocation.put("New York", "Butler Heights");
        nameOfProjectAndLocation.put("California", "Horizon Estates");
        nameOfProjectAndLocation.put("New Jersey", "Highland Hills");

        logger.info("Project discussions for Highland Hills in Princeton, New Jersey are under way: ");
        logger.info(nameOfProjectAndLocation);
    }

    private void approvalStatusOfProjects() {
        logger.info("Approval Status of Open Projects:");
        projectAndGovernmentApproval = new HashMap<>();
        projectAndGovernmentApproval.put("Chestnut Lake ", false);
        projectAndGovernmentApproval.put("Victory Lakes ", false);
        projectAndGovernmentApproval.put("Sycamore Village ", true);

        numberOfActiveProjects = 1;

        logger.info(projectAndGovernmentApproval);
        logger.info("Number of active projects: " + numberOfActiveProjects);

    }
}
