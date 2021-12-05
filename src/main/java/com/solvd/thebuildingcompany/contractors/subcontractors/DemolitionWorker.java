package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.vehicles.Bulldozer;

import java.util.*;
import java.util.logging.Logger;

public class DemolitionWorker extends Contractor {

    private static final Logger logger = Logger.getLogger(DemolitionWorker.class.getName());

    private ArrayList<String> clearanceForBulldozer;


    public ArrayList<String> getClearanceForBulldozer() {
        return clearanceForBulldozer;
    }

    public void setClearanceForBulldozer(final ArrayList<String> clearanceForBulldozer) {
        this.clearanceForBulldozer = clearanceForBulldozer;
    }


   public DemolitionWorker(final String fistName, final String nameOfCompany) {
       super(fistName,nameOfCompany);
   }


    private void demolitionOfSite() {
       final DemolitionWorker gerald = new DemolitionWorker("Gerald", "XYZ Group");
        clearanceForBulldozer = new ArrayList<>();
        clearanceForBulldozer.add(gerald.getFirstName());

        if (clearanceForBulldozer.contains(gerald.getFirstName())) {
            logger.info("Begin removal of all rocks, trees, and debris from construction site.");
            final Bulldozer bulldozer = new Bulldozer("Bulldozer", gerald.getFirstName());
            bulldozer.drive();
            bulldozer.push();
            logger.info("Site successfully cleared");
        }
    }

}
