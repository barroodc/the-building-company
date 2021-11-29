package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.employees.departments.architecture.ResidentialArchitect;

import java.util.*;
import java.util.logging.Logger;

public class ElectricalEngineer extends Employee {

    private final Logger logger = Logger.getLogger(ElectricalEngineer.class.getName());

    private String name;
    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private HashMap<String, Boolean> electricalSystemsDesigned;

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

    public HashMap<String, Boolean> getElectricalSystemsDesigned() {
        return electricalSystemsDesigned;
    }

    public void setElectricalSystemsDesigned(HashMap<String, Boolean> electricalSystemsDesigned) {
        this.electricalSystemsDesigned = electricalSystemsDesigned;
    }

    public ElectricalEngineer(String name) {
        this.name = name;
    }

    private ArrayList<String> projectDiscussions() {
        final ElectricalEngineer enrique = new ElectricalEngineer("Enrique");
        final ElectricalEngineer jasmine = new ElectricalEngineer("Jasmine");
        final ElectricalEngineer erick = new ElectricalEngineer("Erick");
        final ElectricalEngineer debbie = new ElectricalEngineer("Debbie");

        enrique.setDiscussionHad(true);
        jasmine.setContractHonored(true);
        erick.setSafetyCheck(true);
        debbie.setRegulationsMet(true);

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Electrical Engineers " + erick.getName() + " " +  "and" + " " + jasmine.getName() + " " + "met with the Engineering Team: " + !erick.isDiscussionHad());

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

        return projectSetups;
    }

    private void designingElectricalSystems() {
       final ElectricalEngineer george = new ElectricalEngineer("George");
       logger.info("Electrical system design planning performed by: " + george.getName());
       electricalSystemsDesigned = new HashMap<>();
       electricalSystemsDesigned.put("outlets successfully designed", true);
       electricalSystemsDesigned.put("main pane successfully designed", true);
       electricalSystemsDesigned.put("sub panel successfully designed", true);
       electricalSystemsDesigned.put("power line successfully designed", true);
       electricalSystemsDesigned.put("wall switches successfully designed", true);

        for (Map.Entry<String, Boolean> set : electricalSystemsDesigned.entrySet()) {
            logger.info(set.getKey() + " " + set.getValue());
        }

    }

    private void managingElectricalContractors() {
        final ElectricalEngineer vince = new ElectricalEngineer("Vince");
    }

    private void fixingElectricalProblems() {
        final ElectricalEngineer fiona = new ElectricalEngineer("Fiona");
    }

    private void conductingSystemTests() {
        final ElectricalEngineer tammy = new ElectricalEngineer("Tammy");

    }

    @Override
    protected Double earnings() {
        return null;
    }
}