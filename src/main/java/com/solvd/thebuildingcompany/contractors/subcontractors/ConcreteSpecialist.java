package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class ConcreteSpecialist implements IMeasurable, IPourable, IShapable, IMonitorable, ISpreadable {

    private String name;
    private String nameOfCompany;
    private double measurements;
    private boolean correctAmountGathered;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    private final Logger logger = Logger.getLogger(ConcreteSpecialist.class.getName());

    public ConcreteSpecialist(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void planConcreteMeasurements() {
        final ConcreteSpecialist rachel = new ConcreteSpecialist("Rachel", "NXE Group");
        HashMap<String, String> roomAndMeasurement = new HashMap<>();
        roomAndMeasurement.put("Garage", "20X20");
        if (!roomAndMeasurement.containsValue("20X20")){
            logger.warning("Incorrect Measurement");
            throw new RuntimeException("Incorrect measurement");
        } else {
            rachel.addMeasurements();
        }

    }

    private void mixAndPourConcrete() throws IOException {
        final ConcreteSpecialist penny = new ConcreteSpecialist("Penny", "NXE Group");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("true") || reader.readLine().equals("True")) {
            setCorrectAmountGathered(true);
            penny.pour();
        } else {
            setCorrectAmountGathered(false);
            logger.warning("Incorrect amount");
        }
    }

    private void spreadConcrete() {
        final ConcreteSpecialist tiffany = new ConcreteSpecialist("Tiffany", "NXE Group");
        tiffany.spread();
    }

    private void shapeConcrete() {
        final ConcreteSpecialist christina = new ConcreteSpecialist("Christina", "NXE Group");
         christina.shape();
    }

    private HashMap<String, Date> monitorDryingProcess() {
        final ConcreteSpecialist hannah = new ConcreteSpecialist("Hannah", "NXE Group");
        HashMap<String, Date> dryingProcessLog = new HashMap<>();
        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();
        dryingProcessLog.put(hannah.getName(), date);
        logger.info(dryingProcessLog.toString());
        return dryingProcessLog;
    }

    @Override
    public void addMeasurements() {
      logger.info("20 foot by 20 foot garage");
    }

    @Override
    public void pour() {
        logger.info("pour all of the concrete");
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

}
