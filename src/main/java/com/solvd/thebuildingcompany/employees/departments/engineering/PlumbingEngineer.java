package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PlumbingEngineer extends Employee {

    private static final Logger logger = Logger.getLogger(PlumbingEngineer.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private boolean sanitaryDrainageDesigned;
    private boolean stormwaterDrainageDesigned;
    private boolean portableWaterDrainageDesigned;


    public PlumbingEngineer(final String name) {
        this.setName(name);
    }

    public boolean isDiscussionHad() {
        return discussionHad;
    }

    public void setDiscussionHad(final boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public void setContractHonored(final boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public boolean isSafetyCheck() {
        return safetyCheck;
    }

    public void setSafetyCheck(final boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(final boolean regulationsMet) {
        this.regulationsMet = regulationsMet;
    }

    public boolean isSanitaryDrainageDesigned() {
        return sanitaryDrainageDesigned;
    }

    public void setSanitaryDrainageDesigned(final boolean sanitaryDrainageDesigned) {
        this.sanitaryDrainageDesigned = sanitaryDrainageDesigned;
    }

    public boolean isStormwaterDrainageDesigned() {
        return stormwaterDrainageDesigned;
    }

    public void setStormwaterDrainageDesigned(final boolean stormwaterDrainageDesigned) {
        this.stormwaterDrainageDesigned = stormwaterDrainageDesigned;
    }

    public boolean isPortableWaterDrainageDesigned() {
        return portableWaterDrainageDesigned;
    }

    public void setPortableWaterDrainageDesigned(final boolean portableWaterDrainageDesigned) {
        this.portableWaterDrainageDesigned = portableWaterDrainageDesigned;
    }

    public PlumbingEngineer(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private ArrayList<String> projectDiscussions() {
        final PlumbingEngineer donna = new PlumbingEngineer("Donna", "The Building Company");
        final PlumbingEngineer patrick = new PlumbingEngineer("Patrick", "The Building Company");
        final PlumbingEngineer kelly = new PlumbingEngineer("Kelly", "The Building Company");
        final PlumbingEngineer judy = new PlumbingEngineer("Judy", "The Building Company");

        donna.setDiscussionHad(true);
        patrick.setContractHonored(true);
        kelly.setSafetyCheck(true);
        judy.setRegulationsMet(true);


        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Plumbing Engineers " + donna.getName() + " " +  "and" + " " + patrick.getName() + " " + "met with the Engineering Team: " + donna.isDiscussionHad());

        projectSetups.forEach(logger::info);

        return projectSetups;
    }


    private void designingPlumbingSystems() {
        final PlumbingEngineer carson = new PlumbingEngineer("Carson", "The Building Company");
        carson.sanitaryDrainageDesigned = true;
        carson.stormwaterDrainageDesigned = true;
        carson.portableWaterDrainageDesigned = true;

        logger.info("Sanitary Drainage System Designed: " + true);
        logger.info("Stormwater Drainage System Designed: " + true);
        logger.info("Portable Water Drainage System Designed: " + true);
    }
}
