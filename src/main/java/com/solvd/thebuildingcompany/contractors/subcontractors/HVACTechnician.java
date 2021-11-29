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
    protected HashMap<String, Boolean> employeePunchIn() {
        return null;
    }

    @Override
    protected HashMap<String, Boolean> employeePunchOut() {
        return null;
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

    private final Logger logger = Logger.getLogger(HVACTechnician.class.getName());

    public HVACTechnician(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean installationOfHVACUnit() {
        final HVACTechnician sharron = new HVACTechnician("Sharron", "MNO Group");
        return false;
    }

    @Override
    public void addComponents() {

    }
}
