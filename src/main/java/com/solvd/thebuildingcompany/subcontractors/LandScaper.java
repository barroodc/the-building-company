package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.subcontractordepartments.LandScaping;

import java.util.logging.Logger;

public class LandScaper extends LandScaping implements ICleanable {

    private final Logger logger = Logger.getLogger(LandScaper.class.getName());

    public LandScaper(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean pesticidesApplied() {
        final LandScaper kylie = new LandScaper("Kylie", "NLX Group");
        //Sprayable interface?
        return false;
    }

    @Override
    protected boolean generalMaintenanceDuties() {
        final LandScaper preston = new LandScaper("Preston", "NLX Group");
        return false;
    }

    @Override
    protected boolean applyFertilizer() {
        final LandScaper vincent = new LandScaper("Vincent", "NLX Group");
        return false;
    }

    @Override
    protected boolean maintainTheLand() {
        final LandScaper caterina = new LandScaper("Caterina", "NLX Group");
        return false;
    }

    @Override
    protected boolean plantDecorativeBushes() {
        final LandScaper jeffery = new LandScaper("Jeffery", "NLX Group");
        return false;
    }

    @Override
    protected boolean plantDecorativeFlowers() {
        final LandScaper daniel = new LandScaper("Daniel", "NLX Group");
        return false;
    }

    @Override
    public void cleanArea() {

    }
}
