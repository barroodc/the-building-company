package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.enums.Location;
import com.solvd.thebuildingcompany.exceptions.InsufficientWiringException;

import java.util.*;
import java.util.logging.Logger;

public class ElectricalEngineer extends Employee {

    private static final Logger logger = Logger.getLogger(ElectricalEngineer.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private HashMap<String, Boolean> electricalSystemsDesigned;

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

    public HashMap<String, Boolean> getElectricalSystemsDesigned() {
        return electricalSystemsDesigned;
    }

    public void setElectricalSystemsDesigned(final HashMap<String, Boolean> electricalSystemsDesigned) {
        this.electricalSystemsDesigned = electricalSystemsDesigned;
    }

    public ElectricalEngineer(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private ArrayList<String> projectDiscussions() {
        final ElectricalEngineer enrique = new ElectricalEngineer("Enrique", "The Building Company");
        final ElectricalEngineer jasmine = new ElectricalEngineer("Jasmine", "The Building Company");
        final ElectricalEngineer erick = new ElectricalEngineer("Erick", "The Building Company");
        final ElectricalEngineer debbie = new ElectricalEngineer("Debbie", "The Building Company");

        enrique.setDiscussionHad(true);
        jasmine.setContractHonored(true);
        erick.setSafetyCheck(true);
        debbie.setRegulationsMet(true);

        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Electrical Engineers " + erick.getName() + " " +  "and" + " " + jasmine.getName() + " " + "met with the Engineering Team: " + !erick.isDiscussionHad());

        projectSetups.forEach(logger::info);

        return projectSetups;
    }

    private void designingElectricalSystems() {
       final ElectricalEngineer george = new ElectricalEngineer("George", "The Building Company");
       logger.info("Electrical system design planning performed by: " + george.getName());
       electricalSystemsDesigned = new HashMap<>();
       electricalSystemsDesigned.put("outlets successfully designed", true);
       electricalSystemsDesigned.put("main pane successfully designed", true);
       electricalSystemsDesigned.put("sub panel successfully designed", true);
       electricalSystemsDesigned.put("power line successfully designed", true);
       electricalSystemsDesigned.put("wall switches successfully designed", true);

        electricalSystemsDesigned.forEach((key, value) -> logger.info(key + " " + value));

    }

    private void conductingSystemTests() throws InsufficientWiringException {
        final ElectricalEngineer tammy = new ElectricalEngineer("Tammy", "The Building Company");
        HashMap<String, Boolean> testResults = new HashMap<>();
        testResults.put("Wiring methods suitable", true);
        testResults.put("Cable installation suitable", true);
        testResults.put("Cables secured safely to box", true);

        testResults.forEach((key, value) -> {
           try {
               if(value) {
                   logger.info("Electrical Engineer " + tammy.getName() + " was able to achieve passing results for all components of the electrical test.");
               } else {
                   throw new InsufficientWiringException("Please correct the electrical issues for the project location.", Location.NEW_JERSEY);
               }

           } catch (InsufficientWiringException e) {
               logger.warning(String.valueOf(e));
           }
        });
    }
}
