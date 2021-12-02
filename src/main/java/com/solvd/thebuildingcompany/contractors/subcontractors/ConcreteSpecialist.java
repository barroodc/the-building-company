package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.*;
import com.solvd.thebuildingcompany.vehicles.BackhoeLoader;
import com.solvd.thebuildingcompany.vehicles.ConcretePump;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.*;

public class ConcreteSpecialist extends Contractor implements IInstallable {

    private double measurements;
    private boolean correctAmountGathered;
    private ArrayList<String> clearanceForConcretePump;
    private ConcreteSpecialist hannah;
    private Calendar currentDate;
    private Calendar completionDate;

    public double getMeasurements() {
        return measurements;
    }

    public void setMeasurements(final double measurements) {
        this.measurements = measurements;
    }

    public boolean isCorrectAmountGathered() {
        return correctAmountGathered;
    }

    public void setCorrectAmountGathered(final boolean correctAmountGathered) {
        this.correctAmountGathered = correctAmountGathered;
    }

    public ArrayList<String> getClearanceForConcretePump() {
        return clearanceForConcretePump;
    }

    public void setClearanceForConcretePump(final ArrayList<String> clearanceForConcretePump) {
        this.clearanceForConcretePump = clearanceForConcretePump;
    }

    public Calendar getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(final Calendar currentDate) {
        this.currentDate = currentDate;
    }

    public Calendar getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(final Calendar completionDate) {
        this.completionDate = completionDate;
    }

    private static Logger logger = LogManager.getLogger(ConcreteSpecialist.class);



    public ConcreteSpecialist(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }


    private void mixAndPourConcrete() {
        final ConcreteSpecialist penny = new ConcreteSpecialist("Penny", "NXE Group");
        logger.info(penny.getFirstName() + " " + "the concrete specialist now has to drive and pour concrete into trenches");
        ConcretePump concretePump = new ConcretePump("Concrete Pump", penny.getFirstName());
        concretePump.drive();
        concretePump.pour();

        logger.info("Construction now stops until drying process complete.");
    }

    private HashMap<String, Date> monitorDryingProcess() {
        hannah = new ConcreteSpecialist("Hannah", "NXE Group");
        HashMap<String, Date> dryingProcessLog = new HashMap<>();

        currentDate = Calendar.getInstance();
        currentDate.set(Calendar.YEAR, 2021);
        currentDate.set(Calendar.MONTH, Calendar.APRIL);
        currentDate.set(Calendar.DAY_OF_MONTH, 27);
        final Date todaysDate = currentDate.getTime();


        completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2021);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);
        final Date dateOfCompletion = completionDate.getTime();


        dryingProcessLog.put(hannah.getFirstName() + " the on duty concrete specialist expects the concrete to be dry by", dateOfCompletion);
        logger.info(dryingProcessLog.toString());
        logger.info("The current date is: " + todaysDate);
        return dryingProcessLog;
    }

    private void postDryingProcess() {
        final ConcreteSpecialist craig = new ConcreteSpecialist("Craig", "NXE Group");
        try {
            Thread.sleep(5000);
            logger.info("It has now been 30 days");
        } catch (InterruptedException e) {
            logger.error(e);
        }
        currentDate = Calendar.getInstance();
        currentDate.set(Calendar.YEAR, 2021);
        currentDate.set(Calendar.MONTH, Calendar.MAY);
        currentDate.set(Calendar.DAY_OF_MONTH, 27);
        final Date todaysDate = currentDate.getTime();

           logger.info("Todays date is ." + todaysDate + " which is exactly 30 days from the initial concrete pouring");
           logger.info("The home building process can resume");
           craig.addComponents();


    }


    private void foundationFinalSteps() {
        final ConcreteSpecialist doug = new ConcreteSpecialist("Doug", "NXE Group");
        BackhoeLoader backhoeLoader = new BackhoeLoader("Backhoe Loader", doug.getFirstName());
        backhoeLoader.dig();
        backhoeLoader.drive();
        backhoeLoader.pave();
        backhoeLoader.finishedTheJob();

    }


    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("Hannah and Craig installed water proofing membrane to the foundation walls inside the basement");
        logger.info("Hannah and Craig installed drains inside the basement");
        logger.info("Hannah and Craig installed sewer taps inside the basement");
        logger.info("Hannah and Craig installed water taps inside the basement");

    }
}
