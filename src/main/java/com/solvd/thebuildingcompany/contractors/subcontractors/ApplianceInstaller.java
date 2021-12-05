package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.ActiveConstruction;
import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;


public class ApplianceInstaller extends Contractor implements IInstallable {

    private static final Logger logger = LogManager.getLogger(ActiveConstruction.class);


    public ApplianceInstaller(final String firstName, final String nameOfCompany) {
        super(firstName,nameOfCompany);
    }


    public void appliancesInstalled() {
       final ApplianceInstaller georgina = new ApplianceInstaller("Georgina", "WeInstallItAll");
       logger.info("Georgina from WeInstallItAll installs the following appliances for the home: ");
       georgina.addComponents();
        ArrayList<Integer> trackingNumber = new ArrayList<>();
        trackingNumber.add(154839);
        trackingNumber.add(178303);
        trackingNumber.add(134321);
        trackingNumber.add(120394);
        trackingNumber.add(174849);
        trackingNumber.add(198747);
        trackingNumber.add(148393);
        trackingNumber.add(121039);
        trackingNumber.add(110077);
        trackingNumber.add(127390);
        Function<Integer, Integer> trackingConstraint = a -> a /2;
        //iterate through the arraylist

        trackingNumber.forEach(integer -> {
            logger.info(trackingConstraint.apply(2) < integer ? "Tracking number is correct." : "Some of the tracking numbers are incorrect.");
        });
    }

    @Override
    public void addComponents() {
        logger.info("Doors");
        logger.info("Window Sills");
        logger.info("Decorative Trim");
        logger.info("Countertops");
        logger.info("Vanities");
        logger.info("Cabinets");
        logger.info("Refrigerator");
        logger.info("Microwave");
        logger.info("Oven");
        logger.info("Fireplace Mantel");
    }

    public static void main(String[] args) {
        ApplianceInstaller example = new ApplianceInstaller("g","g");
        example.appliancesInstalled();
    }
}
