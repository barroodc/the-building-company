package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.contractors.Contractor;
import com.solvd.thebuildingcompany.interfaces.ICleanable;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

public class LandScaper extends Contractor implements ICleanable {

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

    private final Logger logger = Logger.getLogger(LandScaper.class.getName());

    public LandScaper(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean pesticidesApplied() {
        final LandScaper kylie = new LandScaper("Kylie", "NLX Group");
        //Sprayable interface?
        return false;
    }

    private boolean generalMaintenanceDuties() {
        final LandScaper preston = new LandScaper("Preston", "NLX Group");
        return false;
    }

    private boolean applyFertilizer() {
        final LandScaper vincent = new LandScaper("Vincent", "NLX Group");
        return false;
    }

    private boolean maintainTheLand() {
        final LandScaper caterina = new LandScaper("Caterina", "NLX Group");
        return false;
    }

    private boolean plantDecorativeBushes() {
        final LandScaper jeffery = new LandScaper("Jeffery", "NLX Group");
        return false;
    }

    private boolean plantDecorativeFlowers() {
        final LandScaper daniel = new LandScaper("Daniel", "NLX Group");
        return false;
    }

    @Override
    public void cleanArea() {

    }
}
