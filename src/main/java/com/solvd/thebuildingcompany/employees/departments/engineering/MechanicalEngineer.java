package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class MechanicalEngineer extends Employee {

    private static final Logger logger = Logger.getLogger(MechanicalEngineer.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private static HashMap<String, Boolean> hVACSystemDesigned;


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

    //optional example
    public Optional <HashMap<String, Boolean>> gethVACSystemDesigned() {
        return Optional.of(hVACSystemDesigned);
    }

    public void sethVACSystemDesigned(final HashMap<String, Boolean> hVACSystemDesigned) {
        MechanicalEngineer.hVACSystemDesigned = hVACSystemDesigned;
    }

    public MechanicalEngineer(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private ArrayList<String> projectDiscussions() {
        final MechanicalEngineer jeniffer = new MechanicalEngineer("Jeniffer", "The Building Company");
        final MechanicalEngineer trevor = new MechanicalEngineer("Trevor", "The Building Company");
        final MechanicalEngineer nancy = new MechanicalEngineer("Nancy", "The Building Company");
        final MechanicalEngineer vivian = new MechanicalEngineer("Vivian", "The Building Company");

        jeniffer.setDiscussionHad(true);
        trevor.setContractHonored(true);
        nancy.setSafetyCheck(true);
        vivian.setRegulationsMet(true);

        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Mechanical Engineers " + jeniffer.getName() + " " +  "and" + " " + trevor.getName() + " " + "met with the Engineering Team: " + jeniffer.isDiscussionHad());

        projectSetups.forEach(logger::info);

        return projectSetups;
    }

    private void hVACDesign() {
        //optional example
        //hVACSystemDesigned is the optional example. Reference getters/setters to further understand implementation.

        final MechanicalEngineer nicholas = new MechanicalEngineer("Nicholas", "The Building Company");
        logger.info("HVAC System designed by: " + nicholas.getName());
        hVACSystemDesigned = new HashMap<>();
        hVACSystemDesigned.put("Cooler component designed", true);
        hVACSystemDesigned.put("Condenser component designed", true);
        hVACSystemDesigned.put("Evaporator component designed", true);
        hVACSystemDesigned.put("Chiller component designed", true);
        hVACSystemDesigned.put("Compressor component designed", true);
        hVACSystemDesigned.put("Heater component designed", true);
        hVACSystemDesigned.put("Cooling plate component designed", true);
        hVACSystemDesigned.put("Battery plate component designed", true);
        hVACSystemDesigned.put("Refrigerated Circuit component designed", true);
        hVACSystemDesigned.put("Coolant Circuit component designed", true);
        hVACSystemDesigned.put("Pump component designed", true);

        hVACSystemDesigned.forEach((key, value) -> logger.info(key + " " + value));

        if (gethVACSystemDesigned().isPresent()){
            logger.info("The HVAC System Initial Design Configuration Process Complete.");
        } else {
            logger.info("The HVAC System Initial Design Configuration Process Is Not Complete.");
        }
    }
}
