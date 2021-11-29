package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isCorrectSystem() {
        return correctSystem;
    }

    public void setCorrectSystem(boolean correctSystem) {
        this.correctSystem = correctSystem;
    }

    public boolean isCorrectEquipment() {
        return correctEquipment;
    }

    public void setCorrectEquipment(boolean correctEquipment) {
        this.correctEquipment = correctEquipment;
    }

    public boolean isDesignDeveloped() {
        return designDeveloped;
    }

    public void setDesignDeveloped(boolean designDeveloped) {
        this.designDeveloped = designDeveloped;
    }

    public boolean isPlumbingActive() {
        return plumbingActive;
    }

    public void setPlumbingActive(boolean plumbingActive) {
        this.plumbingActive = plumbingActive;
    }

    private final Logger logger = Logger.getLogger(PlumbingEngineer.class.getName());

    public PlumbingEngineer(String name) {
        this.setName(name);
    }

    public boolean isDiscussionHad() {
        return discussionHad;
    }

    public void setDiscussionHad(boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public void setContractHonored(boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public boolean isSafetyCheck() {
        return safetyCheck;
    }

    public void setSafetyCheck(boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(boolean regulationsMet) {
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

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

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

    private void designingWaterSupplySystems() {
        final PlumbingEngineer kyle = new PlumbingEngineer("Kyle");
        //drawings prepared
        //Water source
        //purification and treatment facilities
        //transmission and distribution systems
        //storage systems
        //pumping stations
        //accessories - valves, service lines, generators, meters, fire hydrants (ensures smoothly running system).
        //design prepared
    }

    private void evaluateTestReports() {
        final PlumbingEngineer greggory = new PlumbingEngineer("Greggory");

    }


    @Override
    protected Double earnings() {
        return null;
    }
}
