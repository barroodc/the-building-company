package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SidingContractor extends Contractor implements IInstallable {

    private static Logger logger = LogManager.getLogger(SidingContractor.class);

    public SidingContractor(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void installBrickSiding() {
        final SidingContractor sinclair = new SidingContractor("Sinclair", "NAW Group");
        logger.info("Sinclair the siding contractor now installs the exterior bricks around the front of the home: ");
        sinclair.addComponents();
    }

    @Override
    protected Double earnings() {
        return null;
    }

    @Override
    public void addComponents() {
        logger.info("exterior brick installed");
    }
}
