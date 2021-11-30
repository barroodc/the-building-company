package com.solvd.thebuildingcompany.inspectors;

import com.solvd.thebuildingcompany.contractors.subcontractors.DemolitionWorker;

import java.util.logging.Logger;

public class CityInspector extends Inspector{

    private String name;
    private String inspectorSpeciality;
    private boolean inspectionPassed;
    private int numberOfViolations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInspectorSpeciality() {
        return inspectorSpeciality;
    }

    public void setInspectorSpeciality(String inspectorSpeciality) {
        this.inspectorSpeciality = inspectorSpeciality;
    }


    public boolean isInspectionPassed() {
        return inspectionPassed;
    }

    public void setInspectionPassed(boolean inspectionPassed) {
        this.inspectionPassed = inspectionPassed;
    }

    public int getNumberOfViolations() {
        return numberOfViolations;
    }

    public void setNumberOfViolations(int numberOfViolations) {
        this.numberOfViolations = numberOfViolations;
    }

    public CityInspector(String name) {
        this.name = name;
    }

    public CityInspector(String name, String inspectorSpeciality) {
        this.name = name;
        this.inspectorSpeciality = inspectorSpeciality;
    }

    private final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

    @Override
    protected void inspection() {
        CityInspector tobey = new CityInspector("Tobey", "Foundation Wall");
        if (numberOfViolations == 0){
            logger.info(tobey.getName() + " gave the foundation wall a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with construction");
            logger.info("Failed assessment");
        }

    }

    public static void main(String[] args) {
        CityInspector mario = new CityInspector("Ass");
        mario.inspection();
    }
}
