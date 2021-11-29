package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IMonitorable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class Roofer extends Contractor implements IMonitorable, IMeasurable, IInstallable {

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

    private final Logger logger = Logger.getLogger(Roofer.class.getName());

    public Roofer(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean roofPreInspections() {
        final Roofer sebastian = new Roofer("Sebastian", "ROF Group");
        return false;
    }

    private double measureAndCutMaterials() {
        final Roofer jake = new Roofer("Jake", "ROF Group");
        return 0;
    }

    private boolean roofSurfaceSmoothed() {
        final Roofer joseph = new Roofer("Joseph", "ROF Group");
        return false;
    }

    private boolean roofInstallation() {
        final Roofer brian = new Roofer("Brian", "ROF Group");
        return false;
    }

    @Override
    public void monitorProcess() {

    }

    @Override
    public void addMeasurements() {

    }

    @Override
    public void addComponents() {

    }
}
