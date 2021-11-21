package com.solvd.thebuildingcompany.departments;


import java.util.ArrayList;
import java.util.HashMap;

public abstract class Engineering {

    private double projectCompleted;
    private boolean surveyReady;
    private double costEstimates;
    private boolean riskAverse;
    private boolean permitSent;
    private boolean permitAccepted;
    private boolean materialTested;
    private boolean passingTestResult;
    private boolean softwareInstalled;
    private boolean electricalTests;  // electrical analysis
    private boolean systemTested;
    private double laborCalculation;
    private double costEstimate;
    private boolean inspectionPassed;
    private boolean agreementSigned;
    private boolean machinesInstalled;
    private boolean testsPerformed;
    private boolean inspectionDone;
    private boolean maintenanceNeeded;
    private boolean correctSystem;
    private boolean correctEquipment;
    private boolean designDeveloped;
    private boolean plumbingActive;
    private boolean testingPerformed;
    private boolean areaBuildReady;
    private boolean timelyDelivery;
    private String statusReport;
    private boolean temperatureTest;
    private String name;

    //Split all of the engineering disciplines;

    public double getProjectCompleted() {
        return projectCompleted;
    }

    public void setProjectCompleted(double projectCompleted) {
        this.projectCompleted = projectCompleted;
    }

    public boolean isSurveyReady() {
        return surveyReady;
    }

    public void setSurveyReady(boolean surveyReady) {
        this.surveyReady = surveyReady;
    }

    public double getCostEstimates() {
        return costEstimates;
    }

    public void setCostEstimates(double costEstimates) {
        this.costEstimates = costEstimates;
    }

    public boolean isRiskAverse() {
        return riskAverse;
    }

    public void setRiskAverse(boolean riskAverse) {
        this.riskAverse = riskAverse;
    }

    public boolean isPermitSent() {
        return permitSent;
    }

    public void setPermitSent(boolean permitSent) {
        this.permitSent = permitSent;
    }

    public boolean isPermitAccepted() {
        return permitAccepted;
    }

    public void setPermitAccepted(boolean permitAccepted) {
        this.permitAccepted = permitAccepted;
    }

    public boolean isMaterialTested() {
        return materialTested;
    }

    public void setMaterialTested(boolean materialTested) {
        this.materialTested = materialTested;
    }

    public boolean isPassingTestResult() {
        return passingTestResult;
    }

    public void setPassingTestResult(boolean passingTestResult) {
        this.passingTestResult = passingTestResult;
    }

    public boolean isSoftwareInstalled() {
        return softwareInstalled;
    }

    public void setSoftwareInstalled(boolean softwareInstalled) {
        this.softwareInstalled = softwareInstalled;
    }

    public boolean isElectricalTests() {
        return electricalTests;
    }

    public void setElectricalTests(boolean electricalTests) {
        this.electricalTests = electricalTests;
    }

    public boolean isSystemTested() {
        return systemTested;
    }

    public void setSystemTested(boolean systemTested) {
        this.systemTested = systemTested;
    }

    public double getLaborCalculation() {
        return laborCalculation;
    }

    public void setLaborCalculation(double laborCalculation) {
        this.laborCalculation = laborCalculation;
    }

    public double getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public boolean isInspectionPassed() {
        return inspectionPassed;
    }

    public void setInspectionPassed(boolean inspectionPassed) {
        this.inspectionPassed = inspectionPassed;
    }

    public boolean isAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
    }

    public boolean isMachinesInstalled() {
        return machinesInstalled;
    }

    public void setMachinesInstalled(boolean machinesInstalled) {
        this.machinesInstalled = machinesInstalled;
    }

    public boolean isTestsPerformed() {
        return testsPerformed;
    }

    public void setTestsPerformed(boolean testsPerformed) {
        this.testsPerformed = testsPerformed;
    }

    public boolean isInspectionDone() {
        return inspectionDone;
    }

    public void setInspectionDone(boolean inspectionDone) {
        this.inspectionDone = inspectionDone;
    }

    public boolean isMaintenanceNeeded() {
        return maintenanceNeeded;
    }

    public void setMaintenanceNeeded(boolean maintenanceNeeded) {
        this.maintenanceNeeded = maintenanceNeeded;
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

    public boolean isTestingPerformed() {
        return testingPerformed;
    }

    public void setTestingPerformed(boolean testingPerformed) {
        this.testingPerformed = testingPerformed;
    }

    public boolean isAreaBuildReady() {
        return areaBuildReady;
    }

    public void setAreaBuildReady(boolean areaBuildReady) {
        this.areaBuildReady = areaBuildReady;
    }

    public boolean isTimelyDelivery() {
        return timelyDelivery;
    }

    public void setTimelyDelivery(boolean timelyDelivery) {
        this.timelyDelivery = timelyDelivery;
    }

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

    public boolean isTemperatureTest() {
        return temperatureTest;
    }

    public void setTemperatureTest(boolean temperatureTest) {
        this.temperatureTest = temperatureTest;
    }

    protected abstract HashMap<String, Boolean> evaluationPerformed();
    protected abstract HashMap<String, String> developmentStage();
    protected abstract HashMap<String, Boolean> testType();
    protected abstract HashMap<String, String> changesMade();
    protected abstract HashMap<String, Boolean> installComplete();
    protected abstract HashMap<String, Boolean> inspectionCheck();
    //protected abstract HashMap<String, String> maintenanceNote();
    //protected abstract ArrayList<String> recommendations();
    //protected abstract HashMap<String, Boolean> taskSupervised();
    //protected abstract HashMap<String, Boolean> failureTest();
    //protected abstract ArrayList<String> consultingService();

}
