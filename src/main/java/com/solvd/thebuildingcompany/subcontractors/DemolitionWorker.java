package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IBulldozable;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IProtectedSite;
import com.solvd.thebuildingcompany.subcontractordepartments.Demolition;

import java.io.BufferedReader;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class DemolitionWorker extends Demolition implements IBulldozable, ICleanable, IProtectedSite {

    private final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

   public DemolitionWorker(String name, String nameOfCompany) {
       super(name, nameOfCompany);
       this.setName(name);
       this.setNameOfCompany(nameOfCompany);
   }

    @Override
    protected boolean demolitionOfSite() {
       final DemolitionWorker gerald = new DemolitionWorker("Gerald", "XYZ Group");
       gerald.setSiteLeveled(true);
       if (gerald.isSiteLeveled()) {
           gerald.bullDoze();
           return true;
       } else {
           logger.warning("Must remove more debris before construction can begin");
           return false;
       }
    }

    @Override
    protected boolean cleanUpSite() {
       final DemolitionWorker christopher = new DemolitionWorker("Christopher", "XYZ Group");

       christopher.setSiteClean(true);

       if (christopher.isSiteClean()){
           christopher.cleanArea();
           return true;
       } else {
           logger.warning("Site is not cleaned. Please clean before continuing");
           return false;
       }
    }

    @Override
    protected boolean trafficControl() {
       final DemolitionWorker ronald = new DemolitionWorker("Ronald", "XYZ Group");
       ronald.setRoadBlocksUp(true);

       if (ronald.isRoadBlocksUp()) {
           ronald.safetyChecked();
           return true;
       } else {
           logger.warning("Please make sure the public cant get into the development");
           logger.warning("Please put up roadblocks as soon as possible");
           return false;
       }
    }

    @Override
    protected boolean equipmentOperatorAssistance() {
       final DemolitionWorker jenna = new DemolitionWorker("Jenna", "XYZ Group");
        jenna.setAssistanceRequired(true);

        if (jenna.isAssistanceRequired()){
            logger.warning("Please assist me so I can continue operating the bulldozer");
            return true;
        } else {
            logger.info("I do not need assistance");
            return false;
        }
    }


    @Override
    protected boolean cleanToolsAndEquipment() {
       final DemolitionWorker nathaniel = new DemolitionWorker("Nathaniel", "XYZ Group");
       HashMap<String, Date> cleanToolsLog = new HashMap<>();
        final Calendar completionDate = Calendar.getInstance();
        completionDate.set(Calendar.YEAR, 2022);
        completionDate.set(Calendar.MONTH, Calendar.MAY);
        completionDate.set(Calendar.DAY_OF_MONTH, 27);

        final Date date = completionDate.getTime();
        cleanToolsLog.put(nathaniel.getName(), date);

        if (cleanToolsLog.containsKey(nathaniel.getName())){
            logger.info("Tools cleaned");
            return true;
        } else {
            logger.warning("Tools need to be cleaned");
            return false;
        }
    }

    @Override
    public void bullDoze() {
       logger.info("Bulldozer in use");
       logger.info("Removed the debris and ready for construction");
    }

    @Override
    public void cleanArea() {
       logger.info("Area cleaned");
    }

    @Override
    public void safetyChecked() {
        logger.info("Road Blocks Are Up");
        logger.info("Construction Perimeter is Secured");
    }

    public static void main(String[] args) {
       DemolitionWorker worker = new DemolitionWorker("","");
       worker.demolitionOfSite();
    }
}
