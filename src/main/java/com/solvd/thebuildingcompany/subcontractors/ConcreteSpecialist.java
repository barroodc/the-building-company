package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.*;
import com.solvd.thebuildingcompany.subcontractordepartments.ConcreteWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class ConcreteSpecialist extends ConcreteWork implements IMeasurable, IPourable, IShapable, IMonitorable, ISpreadable {

    private final Logger logger = Logger.getLogger(ConcreteSpecialist.class.getName());

    public ConcreteSpecialist(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected void planConcreteMeasurements() {
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

    @Override
    protected void mixAndPourConcrete() throws IOException {
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

    @Override
    protected void spreadConcrete() {
        final ConcreteSpecialist tiffany = new ConcreteSpecialist("Tiffany", "NXE Group");
        tiffany.spread();
    }

    @Override
    protected void shapeConcrete() {
        final ConcreteSpecialist christina = new ConcreteSpecialist("Christina", "NXE Group");
         christina.shape();
    }

    @Override
    protected HashMap<String, Date> monitorDryingProcess() {
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
