package com.solvd.thebuildingcompany.inspectors;

import com.solvd.thebuildingcompany.contractors.subcontractors.DemolitionWorker;
import com.solvd.thebuildingcompany.employees.departments.management.EngineerManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.logging.Logger;

public class CityInspector extends Inspector {

    private static final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

    private String inspectorSpeciality;
    private boolean inspectionPassed;
    private int numberOfViolations;
    private int numberOfHomesTotal;
    private int overallNeighborhoodScore;
    private int nationalResidentialRating;


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

    public int getNumberOfHomesTotal() {
        return numberOfHomesTotal;
    }

    public void setNumberOfHomesTotal(int numberOfHomesTotal) {
        this.numberOfHomesTotal = numberOfHomesTotal;
    }

    public int getOverallNeighborhoodScore() {
        return overallNeighborhoodScore;
    }

    public void setOverallNeighborhoodScore(int overallNeighborhoodScore) {
        this.overallNeighborhoodScore = overallNeighborhoodScore;
    }

    public int getNationalResidentialRating() {
        return nationalResidentialRating;
    }

    public void setNationalResidentialRating(int nationalResidentialRating) {
        this.nationalResidentialRating = nationalResidentialRating;
    }

    public CityInspector(final String name) {
       super(name);
    }

    public CityInspector(final String name, final String inspectorSpeciality) {
        super(name);
        this.inspectorSpeciality = inspectorSpeciality;
    }

    public CityInspector(final String name, final int age, final String gender, final String nameOfRepresentingCity, final int municipalID){
        super(name, age, gender, nameOfRepresentingCity, municipalID);
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

        //logger.info(String.valueOf(tobey.equals(new CityInspector("Casandra"))));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityInspector that = (CityInspector) o;
        return inspectionPassed == that.inspectionPassed &&
                numberOfViolations == that.numberOfViolations &&
                inspectorSpeciality.equals(that.inspectorSpeciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectorSpeciality, inspectionPassed, numberOfViolations);
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

    private void nationalHomeRatings(){
        numberOfHomesTotal = 100;
        int min = 45;
        int max = 100;
        overallNeighborhoodScore = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Function<Integer, Integer> overallDevelopmentRating = a -> a / numberOfHomesTotal + overallNeighborhoodScore;
        nationalResidentialRating = (overallDevelopmentRating.apply(overallNeighborhoodScore));

        int negativeReading = 0;
        int positiveReading = 0;

        do {
            if (nationalResidentialRating < 50){
                logger.info("The homes in the development fail the national assessment for quality.");
                logger.info("Please update homes before finalizing construction.");
            } else {
                positiveReading++;
            }
            negativeReading++;
        } while(negativeReading < 5 && positiveReading != 1);

        do {
            logger.info("The homes in the development pass the national assessment for quality.");
            positiveReading++;
        } while (positiveReading < 1);
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

    @Override
    public String toString() {
        return "CityInspector{" +
                "inspectorSpeciality='" + inspectorSpeciality + '\'' +
                ", inspectionPassed=" + inspectionPassed +
                ", numberOfViolations=" + numberOfViolations +
                '}';
    }
}
