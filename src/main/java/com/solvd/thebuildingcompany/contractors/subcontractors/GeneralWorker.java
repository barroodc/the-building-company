package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IDig;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GeneralWorker extends Contractor implements IInstallable, IDig {

    private static Logger logger = LogManager.getLogger(GeneralWorker.class);

    private void woodenFormInstallations() {
        logger.info("foundation stage begins");
        addComponents();
        dig();
    }

    @Override
    public void addComponents() {
        logger.info("Construction crew puts up wooden forms as the template for the foundation");
        logger.info("add footings");
    }

    @Override
    public void dig() {
        logger.info("Construction crew digs trenches.");
    }

    @Override
    protected Double earnings() {
        return null;
    }

}
