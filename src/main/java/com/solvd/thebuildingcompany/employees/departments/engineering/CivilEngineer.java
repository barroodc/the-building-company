package com.solvd.thebuildingcompany.employees.departments.engineering;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.employees.departments.architecture.ResidentialArchitect;
import com.solvd.thebuildingcompany.employees.departments.management.CivilSupervisor;

import java.util.*;
import java.util.logging.Logger;

public class CivilEngineer extends Employee {

    private String statusReport;
    private String name;
    private Double projectCompleted; // need to rename this variable to something with a percentage.
    private boolean inspectionDone;
    private boolean permitSent;
    private boolean setPermitAccepted;
    private boolean softwareInstalled;
    private boolean discussionHad;
    private boolean contractHonored;
    private boolean safetyCheck;
    private boolean regulationsMet;
    private HashMap<String, Boolean> areSitePlansMade;

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProjectCompleted() {
        return projectCompleted;
    }

    public void setProjectCompleted(double projectCompleted) {
        this.projectCompleted = projectCompleted;
    }

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isPermitSent() {
        return permitSent;
    }

    public void setPermitSent(boolean permitSent) {
        this.permitSent = permitSent;
    }

    public boolean isSetPermitAccepted() {
        return setPermitAccepted;
    }

    public void setSetPermitAccepted(boolean setPermitAccepted) {
        this.setPermitAccepted = setPermitAccepted;
    }

    public boolean isSoftwareInstalled() {
        return softwareInstalled;
    }

    public void setSoftwareInstalled(boolean softwareInstalled) {
        this.softwareInstalled = softwareInstalled;
    }

    public void setProjectCompleted(Double projectCompleted) {
        this.projectCompleted = projectCompleted;
    }

    public boolean isDiscussionHad() {
        return discussionHad;
    }

    public boolean isContractHonored() {
        return contractHonored;
    }

    public boolean isSafetyCheck() {
        return safetyCheck;
    }

    public void setSafetyCheck(boolean safetyCheck) {
        this.safetyCheck = safetyCheck;
    }

    public void setContractHonored(boolean contractHonored) {
        this.contractHonored = contractHonored;
    }

    public void setDiscussionHad(boolean discussionHad) {
        this.discussionHad = discussionHad;
    }

    public boolean isRegulationsMet() {
        return regulationsMet;
    }

    public void setRegulationsMet(boolean regulationsMet) {
        this.regulationsMet = regulationsMet;
    }

    public HashMap<String, Boolean> getAreSitePlansMade() {
        return areSitePlansMade;
    }

    public void setAreSitePlansMade(HashMap<String, Boolean> areSitePlansMade) {
        this.areSitePlansMade = areSitePlansMade;
    }

    private final Logger logger = Logger.getLogger(CivilEngineer.class.getName());

    public CivilEngineer(String name) {
        this.setName(name);
    }

    private ArrayList<String> projectDiscussions() {
        final CivilEngineer dora = new CivilEngineer("Dora");
        final CivilEngineer murphy = new CivilEngineer("Murphy");
        final CivilEngineer sheldon = new CivilEngineer("Sheldon");
        final CivilEngineer greg = new CivilEngineer("Greg");

        dora.setDiscussionHad(true);
        murphy.setContractHonored(true);
        sheldon.setSafetyCheck(true);
        greg.setRegulationsMet(true);

        ArrayList<String> projectSetups = new ArrayList<>();
        projectSetups.add("Civil Engineers " + dora.getName() + " " +  "and" + " " + murphy.getName() + " " + "met with the Engineering Team: " + dora.isDiscussionHad());

        for (String discussionSet : projectSetups) {
            logger.info(discussionSet);
        }

        return projectSetups;
    }


    private void sitePlanning() {
        final CivilEngineer doug = new CivilEngineer("Doug");
        logger.info("Civil Engineer Site Planning performed by: " + doug.getName());
        areSitePlansMade = new HashMap<>();
        areSitePlansMade.put("Chestnut Lakes site planning performed", false);
        areSitePlansMade.put("Victory Lakes site planning performed", false);
        areSitePlansMade.put("Sycamore Village site planning performed", true);
        for (Map.Entry<String, Boolean> set : areSitePlansMade.entrySet()) {
            logger.info(set.getKey() + " " + set.getValue());
        }
    }

    private void gradeDesigning() {
        final CivilEngineer rachel = new CivilEngineer("Rachel");

    }

    private void drainagePlanning() {
        final CivilEngineer tobey = new CivilEngineer("Tobey");

    }

    private void sanitaryDrainagePlanning() {
       final CivilEngineer barry = new CivilEngineer("Barry");
    }

    private void erosionAndSedimentControl() {
        final CivilEngineer charles = new CivilEngineer("Charles");
    }

    private void floodWayConstruction() {
        final CivilEngineer andrew = new CivilEngineer("Andrew");
    }

    private void gradingControlPermitHandling() {
        final CivilEngineer tom = new CivilEngineer("Tom");
    }

    private void erosionControlPermitHandling() {
       final CivilEngineer jason = new CivilEngineer("Jason");
    }

    public static void main(String[] args) {
        CivilEngineer example = new CivilEngineer("example");
        example.sitePlanning();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
