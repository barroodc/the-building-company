package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.interfaces.IPushable;
import com.solvd.thebuildingcompany.vehicles.Bulldozer;

import java.util.*;
import java.util.logging.Logger;

public class DemolitionWorker extends Contractor {

    private String name;
    private String nameOfCompany;
    private boolean siteLeveled;
    private boolean siteClean;
    private boolean roadBlocksUp;
    private boolean assistanceRequired;
    private ArrayList<String> clearanceForBulldozer;


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

    public ArrayList<String> getClearanceForBulldozer() {
        return clearanceForBulldozer;
    }

    public void setClearanceForBulldozer(ArrayList<String> clearanceForBulldozer) {
        this.clearanceForBulldozer = clearanceForBulldozer;
    }

    private final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

   public DemolitionWorker(String name, String nameOfCompany) {
       super();
       this.setName(name);
       this.setNameOfCompany(nameOfCompany);
   }

    @Override
    protected HashMap<String, Boolean> employeePunchIn() {


        HashMap<String, Boolean> punchIn = new HashMap<>();
        punchIn.put("Gerald",true);

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

    private void demolitionOfSite() {
       final DemolitionWorker gerald = new DemolitionWorker("Gerald", "XYZ Group");
        clearanceForBulldozer = new ArrayList<>();
        clearanceForBulldozer.add(gerald.getName());

        if (clearanceForBulldozer.contains(gerald.getName())) {
            logger.info("Begin removal of all rocks, trees, and debris from construction site.");
            Bulldozer bulldozer = new Bulldozer("Bulldozer");
            bulldozer.drive();
            bulldozer.push();
            logger.info("Site successfully cleared");
        }
    }

    private boolean cleanUpSite() {
       final DemolitionWorker christopher = new DemolitionWorker("Christopher", "XYZ Group");
       //For end of project
        return true;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchOut() {
        return null;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public static void main(String[] args) {
       DemolitionWorker example = new DemolitionWorker("Demo", "123");
        example.employeePunchIn();
       example.demolitionOfSite();

    }

}
