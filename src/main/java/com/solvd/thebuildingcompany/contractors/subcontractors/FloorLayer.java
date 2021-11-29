package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IInstallable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class FloorLayer extends Contractor implements IInstallable, ICleanable {

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

    private final Logger logger = Logger.getLogger(FloorLayer.class.getName());

    public FloorLayer(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean carpetInstalled() {
        final FloorLayer pierre = new FloorLayer("Pierre", "GHI Group");
        return false;
    }

    private boolean hardwoodFloorInstalled() {
        final FloorLayer zachary = new FloorLayer("Zachary", "GHI Group");
        return false;
    }

    private boolean inspectAndCleanSurface() {
        final FloorLayer robert = new FloorLayer("Robert", "GHI Group");
        return false;
    }

    private boolean flooringMaterialsOrdered() {
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