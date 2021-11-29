package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.Main;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.*;
import com.solvd.thebuildingcompany.vehicles.Bulldozer;
import com.solvd.thebuildingcompany.vehicles.ConcretePump;
import com.solvd.thebuildingcompany.vehicles.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConcreteSpecialist extends Contractor implements IInstallable {

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

    private static ConcretePump concretePump;

    public ConcreteSpecialist(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }


    private void mixAndPourConcrete() {
        final ConcreteSpecialist penny = new ConcreteSpecialist("Penny", "NXE Group");
        logger.info(penny.getName() + " " + "the concrete specialist now has to drive and pour concrete into trenches");
        ConcretePump concretePump = new ConcretePump("Concrete Pump");
        concretePump.drive();
        concretePump.pour();

        logger.info("Construction now stops until drying process complete.");
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

    private void postDryingProcess() {
        final ConcreteSpecialist shannon = new ConcreteSpecialist("Shannon", "NXE Group");
    }

    private void spreadConcrete() {
        final ConcreteSpecialist tiffany = new ConcreteSpecialist("Tiffany", "NXE Group");

    }

    private void shapeConcrete() {
        final ConcreteSpecialist christina = new ConcreteSpecialist("Christina", "NXE Group");

    }


    public static void main(String[] args) throws IOException {
        ConcreteSpecialist babe = new ConcreteSpecialist("Babe", "hoAndCo");
        babe.mixAndPourConcrete();
        babe.monitorDryingProcess();
    }

    @Override
    protected HashMap<String, Boolean> employeePunchIn() {
        HashMap<String, Boolean> punchIn = new HashMap<>();
        punchIn.put("Penny",true);
        punchIn.put("Hannah", true);

        for (Map.Entry<String, Boolean> set : punchIn.entrySet()) {
            if (punchIn.containsValue(true)) {
                logger.info(set.getKey() + "'s punch in confirmed.");
                logger.info(set.getKey() + " is ready to work!");
            } else {
                logger.info(set.getKey() + "'s punch in non-existent.");
                logger.info(set.getKey() + " needs to punch in before continuing his shift.");
            }
        }
        return punchIn;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchOut() {
        return null;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("water proofing membrane to the foundation walls installed");
        logger.info("drains installed");
        logger.info("sewer taps installed");
        logger.info("water taps installed");
    }
}
