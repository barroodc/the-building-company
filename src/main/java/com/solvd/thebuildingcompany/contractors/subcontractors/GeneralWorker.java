package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.genericinterfaces.IDig;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GeneralWorker extends Contractor implements IInstallable, IDig {

    private final static Logger logger = LogManager.getLogger(GeneralWorker.class);

    public GeneralWorker() {

    }

    private void woodenFormInstallations() {
        logger.info("foundation stage begins");
        addComponents();
        IDig<String> startDig = (x) ->{
            logger.info("starting digging up dirt for wooden form installations.");
        };
        startDig.dig(startDig.toString());
    }

    @Override
    public void addComponents() {
        logger.info("Construction crew puts up wooden forms as the template for the foundation");
        logger.info("add footings");
    }
    @Override
    public void dig(Object x) {
        /*
        Marker interface

        values for the interface method are defined inside of the
        woodenFormsInstallations() method.
         */
    }
}
