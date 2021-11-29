package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.*;
import java.util.logging.Logger;

public class MechanicalEngineer extends Employee {

    private final Logger logger = Logger.getLogger(MechanicalEngineer.class.getName());

    private String name;
    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private HashMap<String, Boolean> hVACSystemDesigned;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public HashMap<String, Boolean> gethVACSystemDesigned() {
        return hVACSystemDesigned;
    }

    public void sethVACSystemDesigned(HashMap<String, Boolean> hVACSystemDesigned) {
        this.hVACSystemDesigned = hVACSystemDesigned;
    }

    public MechanicalEngineer(String name) {
        this.name = name;
    }

    private ArrayList<String> projectDiscussions() {
        final MechanicalEngineer jeniffer = new MechanicalEngineer("Jeniffer");
        final MechanicalEngineer trevor = new MechanicalEngineer("Trevor");
        final MechanicalEngineer nancy = new MechanicalEngineer("Nancy");
        final MechanicalEngineer vivian = new MechanicalEngineer("Vivian");

        jeniffer.setDiscussionHad(true);
        trevor.setContractHonored(true);
        nancy.setSafetyCheck(true);
        vivian.setRegulationsMet(true);

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Mechanical Engineers " + jeniffer.getName() + " " +  "and" + " " + trevor.getName() + " " + "met with the Engineering Team: " + jeniffer.isDiscussionHad());

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

        return projectSetups;
    }


    private void specifyEnergyEfficiency() {
        final MechanicalEngineer harrison = new MechanicalEngineer("Harrison");
        //specify energy efficiency of the home
        //energy calculations
    }


    private void homeInstallations() {
        final MechanicalEngineer julie = new MechanicalEngineer("Julie");
        //non-smart home integrations
    }

    private void hVACDesign() {
        final MechanicalEngineer nicholas = new MechanicalEngineer("Nicholas");
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

        for (Map.Entry<String, Boolean> set : hVACSystemDesigned.entrySet()) {
            logger.info(set.getKey() + " " + set.getValue());
        }
    }


    private void buildingCodesFollowed() {
        final MechanicalEngineer andrea = new MechanicalEngineer("Andrea");
    }


    @Override
    protected Double earnings() {
        return null;
    }
}
