package com.solvd.thebuildingcompany.departments;

public abstract class HumanResources {

    private int welcomeHireManual;
    private boolean environmentSafe;
    private int eventsPlanned;
    private double salaryGiven;
    private boolean laborLawsMet;
    private int trainingManuals;
    private String name;

    protected abstract String recruiting();
    protected abstract String safeEnvironmentCheck();
    protected abstract String employerEmployeeRelations();
    protected abstract String compensationAndBenefits();
    protected abstract String laborLawCompliance();
    protected abstract String trainingAndDevelopment();

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
}
