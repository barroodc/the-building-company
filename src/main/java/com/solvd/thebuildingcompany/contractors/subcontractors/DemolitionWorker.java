package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IBulldozable;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IProtectedSite;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class DemolitionWorker implements IBulldozable, ICleanable, IProtectedSite {

    private String name;
    private String nameOfCompany;
    private boolean siteLeveled;
    private boolean siteClean;
    private boolean roadBlocksUp;
    private boolean assistanceRequired;


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
        this.nameOfCompany = nameOfCompany;
    }

    public boolean isSiteLeveled() {
        return siteLeveled;
    }

    public void setSiteLeveled(boolean siteLeveled) {
        this.siteLeveled = siteLeveled;
    }

    public boolean isSiteClean() {
        return siteClean;
    }

    public void setSiteClean(boolean siteClean) {
        this.siteClean = siteClean;
    }

    public boolean isRoadBlocksUp() {
        return roadBlocksUp;
    }

    public void setRoadBlocksUp(boolean roadBlocksUp) {
        this.roadBlocksUp = roadBlocksUp;
    }

    public boolean isAssistanceRequired() {
        return assistanceRequired;
    }

    public void setAssistanceRequired(boolean assistanceRequired) {
        this.assistanceRequired = assistanceRequired;
    }

    private final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

   public DemolitionWorker(String name, String nameOfCompany) {
       super();
       this.setName(name);
       this.setNameOfCompany(nameOfCompany);
   }

    private boolean demolitionOfSite() {
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

    private boolean cleanUpSite() {
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

    private boolean trafficControl() {
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

    private boolean equipmentOperatorAssistance() {
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

    private boolean cleanToolsAndEquipment() {
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
