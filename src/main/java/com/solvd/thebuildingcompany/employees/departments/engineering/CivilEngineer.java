package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.enums.*;
import com.solvd.thebuildingcompany.exceptions.*;

import java.util.*;
import java.util.logging.Logger;

public class CivilEngineer extends Employee {

    private final Logger logger = Logger.getLogger(CivilEngineer.class.getName());

    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private HashMap<String, Boolean> areSitePlansMade;


    public boolean isDiscussionHad() {
        return discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public boolean isSafetyCheck() {
        return safetyCheck;
    }

    public void setSafetyCheck(final boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public void setContractHonored(final boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public void setDiscussionHad(final boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(final boolean regulationsMet) {
        this.regulationsMet = regulationsMet;
    }

    public HashMap<String, Boolean> getAreSitePlansMade() {
        return areSitePlansMade;
    }

    public void setAreSitePlansMade(final HashMap<String, Boolean> areSitePlansMade) {
        this.areSitePlansMade = areSitePlansMade;
    }

    public CivilEngineer(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private ArrayList<String> projectDiscussions() {
        final CivilEngineer dora = new CivilEngineer("Dora", "The Building Company");
        final CivilEngineer murphy = new CivilEngineer("Murphy", "The Building Company");
        final CivilEngineer sheldon = new CivilEngineer("Sheldon", "The Building Company");
        final CivilEngineer greg = new CivilEngineer("Greg", "The Building Company");

        dora.setDiscussionHad(true);
        murphy.setContractHonored(true);
        sheldon.setSafetyCheck(true);
        greg.setRegulationsMet(true);

        final ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Civil Engineers " + dora.getName() + " " +  "and" + " " + murphy.getName() + " " + "met with the Engineering Team: " + dora.isDiscussionHad());

        projectSetups.forEach(logger::info);

        return projectSetups;
    }


    private void sitePlanning() {
        final CivilEngineer doug = new CivilEngineer("Doug", "The Building Company");
        logger.info("Civil Engineer Site Planning performed by: " + doug.getName());
        areSitePlansMade = new HashMap<>();
        areSitePlansMade.put("Chestnut Lakes site planning performed", false);
        areSitePlansMade.put("Victory Lakes site planning performed", false);
        areSitePlansMade.put("Sycamore Village site planning performed", true);
        areSitePlansMade.forEach((key, value) -> logger.info(key + " " + value));
    }

    private void gradeDesigning() throws FaultyDesignException {
        final CivilEngineer rachel = new CivilEngineer("Rachel", "The Building Company");
        final HashMap<String, Boolean> sectorsOfDevelopment = new HashMap<>();
        sectorsOfDevelopment.put("Northern most point passed inspection: ", true);
        sectorsOfDevelopment.put("Southern most point passed inspection: ", true);
        sectorsOfDevelopment.put("Western most point passed inspection: ", true);
        sectorsOfDevelopment.put("Eastern most point passed inspection: ", true);


        sectorsOfDevelopment.forEach((key, value) -> logger.info(value ? rachel.getName() + "approved the grade designing to submit for permit." : PriorityLevels.HIGH_PRIORITY + "Needs to be researched before permit application is submitted."));

    }

        private void drainagePlanning() {
        final CivilEngineer tobey = new CivilEngineer("Tobey", "The Building Company");
        HashMap<String, Boolean> drainagePlanBySector = new HashMap<>();
        drainagePlanBySector.put("Northern most point completed: ", true);
        drainagePlanBySector.put("Southern most point completed: ", true);
        drainagePlanBySector.put("Western most point completed: ", true);
        drainagePlanBySector.put("Eastern most point completed: ", true);

        drainagePlanBySector.forEach((key, value) -> logger.info(value ? tobey.getName() + " approved all sectors drainage plans." : "redesign needs to be implemented"));
    }

    private void erosionAndSedimentControl() {
        final CivilEngineer charles = new CivilEngineer("Charles", "The Building Company");
        HashMap<String, Boolean> properInstallations = new HashMap<>();
        properInstallations.put("Machines to measure sediment put in place", true);
        properInstallations.put("Dust control combatants installed", true);
        properInstallations.put("Compost blanket installed", true);

        properInstallations.forEach((key, value) -> {
            try {
                if (value) {
                    logger.info(charles.getName() + " approved all sectors drainage plans.");
                } else {
                    throw new IncorrectInstallationException("Please install the proper equipment.");
                }
            } catch (IncorrectInstallationException e) {
                logger.warning(String.valueOf(e));
            }
        });

    }

    private void floodWayConstruction() {
        final CivilEngineer andrew = new CivilEngineer("Andrew", "The Building Company");
        HashMap<String, Boolean> materialsAvailable = new HashMap<>();
        materialsAvailable.put("Concrete available", true);
        materialsAvailable.put("Decay resistant lumber available", true);
        materialsAvailable.put("Rubber sheets available", true);

        materialsAvailable.forEach((key, value) -> {
            try {
                if (!value) {
                    logger.info(andrew.getName() + " approved the grade designing to submit for permit.");
                } else {
                    throw new InsufficientMaterialsException("Ordered supplies needed", MaterialDelivery.ORDERED);
                }
            } catch (InsufficientMaterialsException e) {
                logger.warning(String.valueOf(e));
            }
        });
    }

    private void gradingControlPermitHandling() throws InvalidLotException {
        final CivilEngineer tom = new CivilEngineer("Tom", "The Building Company");
        HashMap<String, Boolean> permitQualifications = new HashMap<>();
        permitQualifications.put("Any grading or construction with open drainage? : ", false);
        permitQualifications.put("Any permanent control measures currently implemented? :", false);
        permitQualifications.put("Any recent changes to the residential lots?: ", false);

           permitQualifications.forEach((key, value) -> logger.info(value ? tom.getName() + "approved the grade designing to submit for permit." : StageOfTask.MIDWAY_THROUGH + "Needs to be researched before permit application is submitted."));

        }

    private void erosionControlPermitHandling(){
       final CivilEngineer jason = new CivilEngineer("Jason", "The Building Company");
        HashMap<String, Boolean> permitQualifications = new HashMap<>();
        permitQualifications.put("Performed a full Hydraulic Data Base Summary  : ", true);
        permitQualifications.put("Performed a full Hydrological Data Base Summary :", true);
        permitQualifications.put("Any recent changes to the residential lots?: ", true);

        permitQualifications.forEach((key, value) -> {
            try {
                if (!value) {
                    logger.info(jason.getName() + "approved the grade designing to submit for permit.");
                } else {
                    throw new UnexpectedDelayException("Please correct issues before moving forward", LevelOfDifficulty.HARD);
                }
            } catch (UnexpectedDelayException e) {
                logger.warning(String.valueOf(e));
            }

        });
    }
}
