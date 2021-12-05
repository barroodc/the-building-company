package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.vehicles.BackhoeLoader;
import com.solvd.thebuildingcompany.vehicles.ConcretePump;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ConcreteSpecialist extends Contractor implements IInstallable {

    private static final Logger logger = LogManager.getLogger(ConcreteSpecialist.class);

    private static Calendar currentDate;
    private static Calendar completionDate;

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


    public ConcreteSpecialist(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }


    private void mixAndPourConcrete() {
        final ConcreteSpecialist penny = new ConcreteSpecialist("Penny", "NXE Group");
        logger.info(penny.getFirstName() + " " + "the concrete specialist now has to drive and pour concrete into trenches");
        final ConcretePump concretePump = new ConcretePump("Concrete Pump", penny.getFirstName());
        concretePump.drive();
        concretePump.pour("Penny used the concrete pump to pour cement");

        logger.info("Construction now stops until drying process complete.");
    }

    private HashMap<String, Date> monitorDryingProcess() {
        ConcreteSpecialist hannah = new ConcreteSpecialist("Hannah", "NXE Group");
        final HashMap<String, Date> dryingProcessLog = new HashMap<>();

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
        final BackhoeLoader backhoeLoader = new BackhoeLoader("Backhoe Loader", doug.getFirstName());
        backhoeLoader.dig("dig using backhoe loader to even out foundation.");
        backhoeLoader.drive();
        backhoeLoader.pave();
        backhoeLoader.finishedTheJob();

    }

    @Override
    public void addComponents() {
        logger.info("Hannah and Craig installed water proofing membrane to the foundation walls inside the basement");
        logger.info("Hannah and Craig installed drains inside the basement");
        logger.info("Hannah and Craig installed sewer taps inside the basement");
        logger.info("Hannah and Craig installed water taps inside the basement");

    }
}
