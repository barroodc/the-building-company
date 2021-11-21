package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.HeatingAndAirConditioning;

import java.util.logging.Logger;

public class HVACTechnician extends HeatingAndAirConditioning implements IInstallable {

    private final Logger logger = Logger.getLogger(HVACTechnician.class.getName());

    public HVACTechnician(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean installationOfHVACUnit() {
        final HVACTechnician sharron = new HVACTechnician("Sharron", "MNO Group");
        return false;
    }

    @Override
    public void addComponents() {

    }
}
