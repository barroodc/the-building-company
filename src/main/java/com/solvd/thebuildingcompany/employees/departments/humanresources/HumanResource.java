package com.solvd.thebuildingcompany.employees.departments.humanresources;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.interfaces.IHire;

import java.util.LinkedList;
import java.util.logging.Logger;

public class HumanResource extends Employee implements IHire {

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

    private final Logger logger = Logger.getLogger(HumanResource.class.getName());

    public HumanResource(String name) {
        this.setName(name);
    }

    private String recruiting() {
        final HumanResource larry = new HumanResource("Larry");
        larry.setWelcomeHireManual(500);

        logger.info("Number of new hire manuals handed out:" + larry.getWelcomeHireManual());

        return "Number of new hire manuals handed out:" + larry.getWelcomeHireManual();
    }

    private String safeEnvironmentCheck() {
        final HumanResource billy = new HumanResource("Billy");
        billy.setEnvironmentSafe(true);

        logger.info("The work environment is safe: " + billy.isEnvironmentSafe());

        return "The work environment is safe: " + billy.isEnvironmentSafe();
    }

    private String employerEmployeeRelations() {
        final HumanResourceDirector john = new HumanResourceDirector("John");
        john.setEventsPlanned(5);

        logger.info("The CEO attended: " + john.getEventsPlanned());

        return "The CEO attended: " + john.getEventsPlanned();
    }

    private String trainingAndDevelopment() {
        final HumanResource peter = new HumanResource("Peter");
        peter.setTrainingManuals(50);

        logger.info("Total number of training manuals handed out this quarter: " + peter.getTrainingManuals());

        return "Total number of training manuals handed out this quarter: " + peter.getTrainingManuals();
    }

    private LinkedList<String> namesOfHumanResourceWorkers() {
        LinkedList<String> employees = new LinkedList<>();
        //need to implement node head and other node attributes to linked list
        employees.add("Larry");
        employees.add("Billy");
        employees.add("John");
        employees.add("alfonso");
        employees.add("jackie");
        employees.add("peter");

        for (String humanResources : employees) {
            logger.info(humanResources);
        }

        return employees;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void hire() {
    //Scan objects in?
    }
}
