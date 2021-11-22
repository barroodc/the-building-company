package com.solvd.thebuildingcompany.employees.departments.management;

import com.solvd.thebuildingcompany.employees.abstractclass.Employees;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CivilSupervisor extends Employees {

    private boolean surveyReady;
    private String name;

    public boolean isSurveyReady() {
        return surveyReady;
    }

    public void setSurveyReady(boolean surveyReady) {
        this.surveyReady = surveyReady;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final Logger logger = Logger.getLogger(CivilSupervisor.class.getName());

    public CivilSupervisor(String name) {
        this.setName(name);
    }

    private boolean constructionPlanDevelopment() {
        final CivilSupervisor adam = new CivilSupervisor("Adam");
        adam.setSurveyReady(true);

        final Calendar estimatedFinish = Calendar.getInstance();
        estimatedFinish.set(Calendar.YEAR, 2021);
        estimatedFinish.set(Calendar.MONTH, Calendar.FEBRUARY);
        estimatedFinish.set(Calendar.DAY_OF_MONTH, 21);

        final Date date = estimatedFinish.getTime();

        HashMap<String, Date> completionDate = new HashMap<>();
        completionDate.put("Estimated Completion Date:", date);

        for (Map.Entry<String, Date> set : completionDate.entrySet()) {
            logger.info(set.getKey());
        }

        if (adam.isSurveyReady()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
