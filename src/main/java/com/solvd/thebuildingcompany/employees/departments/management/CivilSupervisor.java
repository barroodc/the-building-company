package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.Employee;
import com.solvd.thebuildingcompany.employees.departments.engineering.CivilEngineer;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class CivilSupervisor extends Employee {

    private static final Logger logger = Logger.getLogger(CivilSupervisor.class.getName());

    private boolean surveyReady;

    public boolean isSurveyReady() {
        return surveyReady;
    }

    public void setSurveyReady(final boolean surveyReady) {
        this.surveyReady = surveyReady;
    }

    public CivilSupervisor(final String name, final String nameOfCompany){
        super(name, nameOfCompany);
    }

    private boolean constructionPlanDevelopment() {
        final CivilSupervisor adam = new CivilSupervisor("Adam", "The Building Company");
        adam.setSurveyReady(true);

        final Calendar estimatedFinish = Calendar.getInstance();
        estimatedFinish.set(Calendar.YEAR, 2022);
        estimatedFinish.set(Calendar.MONTH, Calendar.FEBRUARY);
        estimatedFinish.set(Calendar.DAY_OF_MONTH, 21);

        final Date date = estimatedFinish.getTime();

        final HashMap<String, Date> completionDate = new HashMap<>();
        completionDate.put("Estimated Completion Date of Active Project Victory Lakes :", date);

        completionDate.forEach((key, value) -> logger.info(key + " " + value));

        return adam.isSurveyReady();
    }

}
