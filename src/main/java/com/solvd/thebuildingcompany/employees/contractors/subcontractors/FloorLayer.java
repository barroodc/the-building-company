package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.FloorLaying;

import java.util.logging.Logger;

public class FloorLayer extends FloorLaying implements IInstallable, ICleanable {

    private final Logger logger = Logger.getLogger(FloorLayer.class.getName());

    public FloorLayer(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean carpetInstalled() {
        final FloorLayer pierre = new FloorLayer("Pierre", "GHI Group");
        return false;
    }

    @Override
    protected boolean hardwoodFloorInstalled() {
        final FloorLayer zachary = new FloorLayer("Zachary", "GHI Group");
        return false;
    }

    @Override
    protected boolean inspectAndCleanSurface() {
        final FloorLayer robert = new FloorLayer("Robert", "GHI Group");
        return false;
    }

    @Override
    protected boolean flooringMaterialsOrdered() {
        final FloorLayer terrance = new FloorLayer("Terrance", "GHI Group");
        return false;
    }

    @Override
    public void addComponents() {

    }

    @Override
    public void cleanArea() {

    }
}
