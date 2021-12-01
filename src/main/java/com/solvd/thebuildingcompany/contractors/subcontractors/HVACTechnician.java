package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class HVACTechnician extends Contractor implements IInstallable {

    private String name;
    private String nameOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Double earnings() {
        return null;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private static final Logger logger = Logger.getLogger(HVACTechnician.class.getName());

    public HVACTechnician(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void installationOfHVACUnit() {
        final HVACTechnician sharron = new HVACTechnician("Sharron", "MNO Group");
        logger.info(sharron.getName() + "beings installation of HVAC Unit in basement");
        addComponents();
    }

    @Override
    public void addComponents() {
      logger.info("HVAC Unit successfully installed in the basement.");
    }
}
