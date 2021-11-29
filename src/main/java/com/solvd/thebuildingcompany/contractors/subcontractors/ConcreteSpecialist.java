package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.Main;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.*;
import com.solvd.thebuildingcompany.vehicles.Bulldozer;
import com.solvd.thebuildingcompany.vehicles.ConcretePump;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ConcreteSpecialist extends Contractor implements IMeasurable, IPourable, IShapable, IMonitorable, ISpreadable, IDrivable {

    private String name;
    private String nameOfCompany;
    private double measurements;
    private boolean correctAmountGathered;
    private ArrayList<String> clearanceForConcretePump;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchIn() {
        return null;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchOut() {
        return null;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany= nameOfCompany;
    }

    public double getMeasurements() {
        return measurements;
    }

    public void setMeasurements(double measurements) {
        this.measurements = measurements;
    }

    public boolean isCorrectAmountGathered() {
        return correctAmountGathered;
    }

    public void setCorrectAmountGathered(boolean correctAmountGathered) {
        this.correctAmountGathered = correctAmountGathered;
    }

    public ArrayList<String> getClearanceForConcretePump() {
        return clearanceForConcretePump;
    }

    public void setClearanceForConcretePump(ArrayList<String> clearanceForConcretePump) {
        this.clearanceForConcretePump = clearanceForConcretePump;
    }

    private static Logger logger = LogManager.getLogger(ConcreteSpecialist.class);

    public ConcreteSpecialist(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }


    private void mixAndPourConcrete() throws IOException {
        final ConcreteSpecialist penny = new ConcreteSpecialist("Penny", "NXE Group");
        logger.info(penny.getName() + " " + "the concrete specialist now has to drive and pour concrete into trenches");
        penny.drive();
        penny.pour();
    }

    private HashMap<String, Date> monitorDryingProcess() {
        final ConcreteSpecialist hannah = new ConcreteSpecialist("Hannah", "NXE Group");
        HashMap<String, Date> dryingProcessLog = new HashMap<>();
        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2021);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);
        final Date dateOfCompletion = completionDate.getTime();

        final Calendar currentDate = Calendar.getInstance();
        currentDate.set(Calendar.YEAR, 2021);
        currentDate.set(Calendar.MONTH, Calendar.APRIL);
        final Date todaysDate = currentDate.getTime();

        dryingProcessLog.put(hannah.getName() + " the on duty concrete specialist expects the concrete to be dry by", dateOfCompletion);
        logger.info(dryingProcessLog.toString());
        logger.info("The current date is: " + todaysDate);
        return dryingProcessLog;
    }

    private void spreadConcrete() {
        final ConcreteSpecialist tiffany = new ConcreteSpecialist("Tiffany", "NXE Group");
        tiffany.spread();
    }

    private void shapeConcrete() {
        final ConcreteSpecialist christina = new ConcreteSpecialist("Christina", "NXE Group");
         christina.shape();
    }


    public static void main(String[] args) throws IOException {
        ConcreteSpecialist babe = new ConcreteSpecialist("Babe", "hoAndCo");
        babe.mixAndPourConcrete();
        babe.monitorDryingProcess();
    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void pour() {
        logger.info("Penny poured all of the concrete into the trench");
    }

    @Override
    public void shape() {
       logger.info("shape the concrete");
    }

    @Override
    public void monitorProcess() {
      logger.info("Process Monitored");
    }

    @Override
    public void spread() {
        logger.info("Spread Concrete");
    }

    @Override
    public void drive() {
        logger.info("Penny put keys in the ignition");
        logger.info("Penny drove to appropriate location");
    }
}
