package com.solvd.thebuildingcompany.inspectors;

import com.solvd.thebuildingcompany.contractors.subcontractors.DemolitionWorker;

import java.util.logging.Logger;

public class CityInspector extends Inspector{

    private static final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

    private String inspectorSpeciality;
    private boolean inspectionPassed;
    private int numberOfViolations;

    public String getInspectorSpeciality() {
        return inspectorSpeciality;
    }

    public void setInspectorSpeciality(final String inspectorSpeciality) {
        this.inspectorSpeciality = inspectorSpeciality;
    }


    public boolean isInspectionPassed() {
        return inspectionPassed;
    }

    public void setInspectionPassed(final boolean inspectionPassed) {
        this.inspectionPassed = inspectionPassed;
    }

    public int getNumberOfViolations() {
        return numberOfViolations;
    }

    public void setNumberOfViolations(final int numberOfViolations) {
        this.numberOfViolations = numberOfViolations;
    }

    public CityInspector(final String name) {
       super(name);
    }

    public CityInspector(final String name, final String inspectorSpeciality) {
        super(name);
        this.inspectorSpeciality = inspectorSpeciality;
    }

    @Override
    protected void generalInspection() {
        final CityInspector tobey = new CityInspector("Tobey", "Foundation Wall");
        if (numberOfViolations == 0){
            logger.info(tobey.getName() + " the City Inspector gave the foundation wall a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with construction");
            logger.info("Failed assessment");
        }

    }


    private void plumbingInspection() {
        final CityInspector gabriel = new CityInspector("Gabriel", "Plumbing");
        if (numberOfViolations == 0){
            logger.info(gabriel.getName() + " the City Inspector gave the plumbing work a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with construction");
            logger.info("Failed assessment");
        }
    }

    private void electricalInspection() {
        final CityInspector andrew = new CityInspector("Andrew", "Electrical");
        if (numberOfViolations == 0){
            logger.info(andrew.getName() + " the City Inspector gave the electrical work a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with construction");
            logger.info("Failed assessment");
        }
    }

    private void mechanicalInspection() {
        final CityInspector tom = new CityInspector("Tom", "Mechanical");
        if (numberOfViolations == 0){
            logger.info(tom.getName() + " the City Inspector gave the mechanical systems a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with construction");
            logger.info("Failed assessment");
        }
    }

    private void lastInspection() {
        final CityInspector brianna = new CityInspector("Brianna", "General Inspection");
        logger.info("Final inspection is ready to begin.");
        if (numberOfViolations == 0){
            logger.info(brianna.getName() + " the City Inspector gave the final walk through inspection a passing mark: " + !inspectionPassed);
        } else {
            logger.info(numberOfViolations + "is the current number of violations");
            logger.info("Please address these violations before moving forward with the sale of the home");
            logger.info("Failed assessment");
        }
    }
}
