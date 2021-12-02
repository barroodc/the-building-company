package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PlumbingEngineer extends Employee {

    private String name;
    private String statusReport;
    private boolean inspectionDone;
    private boolean correctSystem;
    private boolean correctEquipment;
    private boolean designDeveloped;
    private boolean plumbingActive;
    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private boolean sanitaryDrainageDesigned;
    private boolean stormwaterDrainageDesigned;
    private boolean portableWaterDrainageDesigned;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(final String statusReport) {
        this.statusReport = statusReport;
    }

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(final boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isCorrectSystem() {
        return correctSystem;
    }

    public void setCorrectSystem(final boolean correctSystem) {
        this.correctSystem = correctSystem;
    }

    public boolean isCorrectEquipment() {
        return correctEquipment;
    }

    public void setCorrectEquipment(final boolean correctEquipment) {
        this.correctEquipment = correctEquipment;
    }

    public boolean isDesignDeveloped() {
        return designDeveloped;
    }

    public void setDesignDeveloped(final boolean designDeveloped) {
        this.designDeveloped = designDeveloped;
    }

    public boolean isPlumbingActive() {
        return plumbingActive;
    }

    public void setPlumbingActive(final boolean plumbingActive) {
        this.plumbingActive = plumbingActive;
    }

    private final Logger logger = Logger.getLogger(PlumbingEngineer.class.getName());

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

    private ArrayList<String> projectDiscussions() {
        final PlumbingEngineer donna = new PlumbingEngineer("Donna");
        final PlumbingEngineer patrick = new PlumbingEngineer("Patrick");
        final PlumbingEngineer kelly = new PlumbingEngineer("Kelly");
        final PlumbingEngineer judy = new PlumbingEngineer("Judy");

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
        final PlumbingEngineer carson = new PlumbingEngineer("Carson");
        carson.sanitaryDrainageDesigned = true;
        carson.stormwaterDrainageDesigned = true;
        carson.portableWaterDrainageDesigned = true;

        logger.info("Sanitary Drainage System Designed: " + true);
        logger.info("Stormwater Drainage System Designed: " + true);
        logger.info("Portable Water Drainage System Designed: " + true);
    }


    @Override
    protected Double earnings() {
        return null;
    }
}
