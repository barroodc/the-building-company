package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IMeasurable;
import com.solvd.thebuildingcompany.interfaces.IMonitorable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.Roofing;

import java.util.logging.Logger;

public class Roofer extends Roofing implements IMonitorable, IMeasurable, IInstallable {

    private final Logger logger = Logger.getLogger(Roofer.class.getName());

    public Roofer(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean roofPreInspections() {
        final Roofer sebastian = new Roofer("Sebastian", "ROF Group");
        return false;
    }

    @Override
    protected double measureAndCutMaterials() {
        final Roofer jake = new Roofer("Jake", "ROF Group");
        return 0;
    }

    @Override
    protected boolean roofSurfaceSmoothed() {
        final Roofer joseph = new Roofer("Joseph", "ROF Group");
        return false;
    }

    @Override
    protected boolean roofInstallation() {
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
