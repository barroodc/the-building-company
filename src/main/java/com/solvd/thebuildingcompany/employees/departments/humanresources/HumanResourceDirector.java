package com.solvd.thebuildingcompany.employees.departments.humanresources;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.logging.Logger;

public class HumanResourceDirector extends Employee {

    private int welcomeHireManual;
    private boolean environmentSafe;
    private int eventsPlanned;
    private double salaryGiven;
    private boolean laborLawsMet;
    private int trainingManuals;
    private String name;

    public int getWelcomeHireManual() {
        return welcomeHireManual;
    }

    public void setWelcomeHireManual(int welcomeHireManual) {
        this.welcomeHireManual = welcomeHireManual;
    }

    public boolean isEnvironmentSafe() {
        return environmentSafe;
    }

    public void setEnvironmentSafe(boolean environmentSafe) {
        this.environmentSafe = environmentSafe;
    }

    public int getEventsPlanned() {
        return eventsPlanned;
    }

    public void setEventsPlanned(int eventsPlanned) {
        this.eventsPlanned = eventsPlanned;
    }

    public double getSalaryGiven() {
        return salaryGiven;
    }

    public void setSalaryGiven(double salaryGiven) {
        this.salaryGiven = salaryGiven;
    }

    public boolean isLaborLawsMet() {
        return laborLawsMet;
    }

    public void setLaborLawsMet(boolean laborLawsMet) {
        this.laborLawsMet = laborLawsMet;
    }

    public int getTrainingManuals() {
        return trainingManuals;
    }

    public void setTrainingManuals(int trainingManuals) {
        this.trainingManuals = trainingManuals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(HumanResourceDirector.class.getName());

    public HumanResourceDirector(String name) {
        this.setName(name);
    }

    private String recruiting() {
        return null;
    }

    private String safeEnvironmentCheck() {
        return null;
    }

    private String employerEmployeeRelations() {
        return null;
    }

    private String laborLawCompliance() {
        return null;
    }

    private String trainingAndDevelopment() {
        return null;
    }


    private void enforcedPolicies() {
        //human resource policies
    }

    private void identifyingStaffNeeds() {

    }

    private void creatingJobDescriptions() {

    }

    private void directingTraining() {
        //different training programs
    }

    private void handlingBenefits() {

    }

    private void maintainingStaffRecords() {

    }

    private void managingPerformanceReviews() {

    }

    private String compensationAndBenefits() {
        final HumanResource alfonso = new HumanResource("Alfonso");
        alfonso.setSalaryGiven(45000);

        logger.info("Total compensation for Inside Sales Employees is $" + alfonso.getSalaryGiven());
        return "Total compensation for Inside Sales Employees is $" + alfonso.getSalaryGiven();
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
