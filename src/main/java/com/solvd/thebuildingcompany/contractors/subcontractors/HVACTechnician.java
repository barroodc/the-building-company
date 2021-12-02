package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.logging.Logger;

public class HVACTechnician extends Contractor implements IInstallable {

    private static final Logger logger = Logger.getLogger(HVACTechnician.class.getName());

    public HVACTechnician(final String firstName, final String nameOfCompany) {
        super(firstName, nameOfCompany);
    }

    private void installationOfHVACUnit() {
        final HVACTechnician sharron = new HVACTechnician("Sharron", "MNO Group");
        logger.info(sharron.getFirstName() + "beings installation of HVAC Unit in basement");
        addComponents();
    }

    @Override
    public void addComponents() {
      logger.info("HVAC Unit successfully installed in the basement.");
    }

    @Override
    protected Double earnings() {
        return null;
    }
}
