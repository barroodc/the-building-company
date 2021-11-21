package com.solvd.thebuildingcompany.employees.humanresourceemployees;

import com.solvd.thebuildingcompany.departments.HumanResources;

import java.util.LinkedList;
import java.util.logging.Logger;

public class HumanResource extends HumanResources {

    private final Logger logger = Logger.getLogger(HumanResource.class.getName());

    public HumanResource(String name) {
        this.setName(name);
    }

    @Override
    protected String recruiting() {
        final HumanResourceRecruiter larry = new HumanResourceRecruiter("Larry");
        larry.setWelcomeHireManual(500);

        logger.info("Number of new hire manuals handed out:" + larry.getWelcomeHireManual());

        return "Number of new hire manuals handed out:" + larry.getWelcomeHireManual();
    }

    @Override
    protected String safeEnvironmentCheck() {
        final HumanResource billy = new HumanResource("Billy");
        billy.setEnvironmentSafe(true);

        logger.info("The work environment is safe: " + billy.isEnvironmentSafe());

        return "The work environment is safe: " + billy.isEnvironmentSafe();
    }

    @Override
    protected String employerEmployeeRelations() {
        final HumanResourceDirector john = new HumanResourceDirector("John");
        john.setEventsPlanned(5);

        logger.info("The CEO attended: " + john.getEventsPlanned());

        return "The CEO attended: " + john.getEventsPlanned();
    }

    @Override
    protected String compensationAndBenefits() {
        final HumanResource alfonso = new HumanResource("Alfonso");
        alfonso.setSalaryGiven(45000);

        logger.info("Total compensation for Inside Sales Employees is $" + alfonso.getSalaryGiven());

        return "Total compensation for Inside Sales Employees is $" + alfonso.getSalaryGiven();
    }

    @Override
    protected String laborLawCompliance() {
        final HumanResource jackie = new HumanResource("Jackie");
        jackie.setLaborLawsMet(true);

        logger.info("Labor laws met: " + jackie.isLaborLawsMet());

        return "Labor laws met: " + jackie.isLaborLawsMet();
    }

    @Override
    protected String trainingAndDevelopment() {
        final HumanResource peter = new HumanResource("Peter");
        peter.setTrainingManuals(50);

        logger.info("Total number of training manuals handed out this quarter: " + peter.getTrainingManuals());

        return "Total number of training manuals handed out this quarter: " + peter.getTrainingManuals();
    }

    protected LinkedList<String> namesOfHumanResourceWorkers() {
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
}
