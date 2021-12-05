package com.solvd.thebuildingcompany.employees.departments.businessdevelopment;

import com.solvd.thebuildingcompany.employees.Employee;

import java.util.HashMap;
import java.util.Optional;
import java.util.logging.Logger;

public class BusinessDeveloper extends Employee {

    private static final Logger logger = Logger.getLogger(BusinessDeveloper.class.getName());

    private boolean buyersMarket;
    private static HashMap<String, String> developmentNumberOfHomes;
    private static HashMap<String, String> developmentAndModel;
    private static HashMap<String, String> projectsAssignedTo;
    private int yearsAtTheCompany;



    public HashMap<String, String> getDevelopmentNumberOfHomes() {
        return developmentNumberOfHomes;
    }

    public void setDevelopmentNumberOfHomes(final HashMap<String, String> developmentNumberOfHomes) {
        BusinessDeveloper.developmentNumberOfHomes = developmentNumberOfHomes;
    }

    public HashMap<String, String> getDevelopmentAndModel() {
        return developmentAndModel;
    }

    public void setMakeAndModel(final HashMap<String, String> developmentAndModel) {
        BusinessDeveloper.developmentAndModel = developmentAndModel;
    }

    public void setDevelopmentAndModel(HashMap<String, String> developmentAndModel) {
        BusinessDeveloper.developmentAndModel = developmentAndModel;
    }

    public HashMap<String, String> getProjectsAssignedTo() {
        return projectsAssignedTo;
    }

    public void setProjectsAssignedTo(HashMap<String, String> projectsAssignedTo) {
        BusinessDeveloper.projectsAssignedTo = projectsAssignedTo;
    }

    //optional example
    public Optional<Integer> getYearsAtTheCompany() {
        return Optional.of(yearsAtTheCompany);
    }

    public void setYearsAtTheCompany(int yearsAtTheCompany) {
        this.yearsAtTheCompany = yearsAtTheCompany;
    }

    public BusinessDeveloper(final String name, final String nameOfCompany, Integer yearsAtTheCompany){
        super(name, nameOfCompany);
        this.yearsAtTheCompany = yearsAtTheCompany;
    }

    private void developmentProjects() {

        final BusinessDeveloper ashley = new BusinessDeveloper("Ashley", "The Building Company", 5);
        final BusinessDeveloper alexander = new BusinessDeveloper("Alexander", "The Building Company", 15);
        final BusinessDeveloper marcus = new BusinessDeveloper("Marcus", "The Building Company", 7);

        //optional example
        if (ashley.getYearsAtTheCompany().isPresent() || alexander.getYearsAtTheCompany().isPresent() || marcus.getYearsAtTheCompany().isPresent()){
            Optional<Integer> ashleyYearsAtTheCompany = ashley.getYearsAtTheCompany();
            Optional<Integer> alexanderYearsAtTheCompany = alexander.getYearsAtTheCompany();
            Optional<Integer> marcusYearsAtTheCompany = marcus.getYearsAtTheCompany();
            logger.info("The following experience of Business Developers Ashley, Alexander and Marcus are given from left to right respectively");
            logger.info(ashleyYearsAtTheCompany.toString() + " " + alexanderYearsAtTheCompany.toString() + " " + marcusYearsAtTheCompany.toString());
        } else {
            logger.info("Number of years working at The Building Company not listed.");
        }

        developmentNumberOfHomes = new HashMap<>();
        developmentNumberOfHomes.put("Development: Chestnut Lake ", "200 homes are needed");
        developmentNumberOfHomes.put("Development: Victory Lakes", "100 homes are needed");
        developmentNumberOfHomes.put("Development: Sycamore Village", "50 homes are needed");

        developmentAndModel = new HashMap<>();
        developmentAndModel.put("Chestnut Lake", "Tudor");
        developmentAndModel.put("Victory Lakes", "Colonial");
        developmentAndModel.put("Sycamore Village", "Victorian");

        projectsAssignedTo = new HashMap<>();
        projectsAssignedTo.put("Chestnut Lake assigned to: ", ashley.getName());
        projectsAssignedTo.put("Victory Lakes assigned to: ", alexander.getName());
        projectsAssignedTo.put("Sycamore Village assigned to: ", marcus.getName());

        developmentNumberOfHomes.forEach((key, value) -> logger.info(key + " " + value));

        developmentAndModel.forEach((key, value) -> logger.info(key + " " + value));

        projectsAssignedTo.forEach((key, value) -> logger.info(key + value));
    }
}
