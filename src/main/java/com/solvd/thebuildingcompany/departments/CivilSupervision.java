package com.solvd.thebuildingcompany.departments;

import java.util.Date;
import java.util.HashMap;

public abstract class CivilSupervision {

    /*
    Much like my upcoming Engineering Management class,
    I am unsure of how to connect this to the engineering class.
    In terms of bare bone functionality, its incompatible with the other
    engineering classes.
     */

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

    protected abstract boolean constructionPlanDevelopment();

}
