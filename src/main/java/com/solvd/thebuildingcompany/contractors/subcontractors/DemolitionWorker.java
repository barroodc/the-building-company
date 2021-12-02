package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.vehicles.Bulldozer;

import java.util.*;
import java.util.logging.Logger;

public class DemolitionWorker extends Contractor {

    private boolean siteLeveled;
    private boolean siteClean;
    private boolean roadBlocksUp;
    private boolean assistanceRequired;
    private ArrayList<String> clearanceForBulldozer;

    public boolean isSiteLeveled() {
        return siteLeveled;
    }

    public void setSiteLeveled(final boolean siteLeveled) {
        this.siteLeveled = siteLeveled;
    }

    public boolean isSiteClean() {
        return siteClean;
    }

    public void setSiteClean(final boolean siteClean) {
        this.siteClean = siteClean;
    }

    public boolean isRoadBlocksUp() {
        return roadBlocksUp;
    }

    public void setRoadBlocksUp(final boolean roadBlocksUp) {
        this.roadBlocksUp = roadBlocksUp;
    }

    public boolean isAssistanceRequired() {
        return assistanceRequired;
    }

    public void setAssistanceRequired(final boolean assistanceRequired) {
        this.assistanceRequired = assistanceRequired;
    }

    public ArrayList<String> getClearanceForBulldozer() {
        return clearanceForBulldozer;
    }

    public void setClearanceForBulldozer(final ArrayList<String> clearanceForBulldozer) {
        this.clearanceForBulldozer = clearanceForBulldozer;
    }

    private final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

   public DemolitionWorker(final String fistName, final String nameOfCompany) {
       super(fistName,nameOfCompany);
   }


    private void demolitionOfSite() {
       final DemolitionWorker gerald = new DemolitionWorker("Gerald", "XYZ Group");
        clearanceForBulldozer = new ArrayList<>();
        clearanceForBulldozer.add(gerald.getFirstName());

        if (clearanceForBulldozer.contains(gerald.getFirstName())) {
            logger.info("Begin removal of all rocks, trees, and debris from construction site.");
            Bulldozer bulldozer = new Bulldozer("Bulldozer", gerald.getFirstName());
            bulldozer.drive();
            bulldozer.push();
            logger.info("Site successfully cleared");
        }
    }



    @Override
    protected Double earnings() {
        return null;
    }

}
