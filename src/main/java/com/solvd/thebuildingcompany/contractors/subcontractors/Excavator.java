package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IFixable;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Excavator implements ICleanable, IFixable {

    private String name;
    private String nameOfCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    private final Logger logger = Logger.getLogger(Excavator.class.getName());

    public Excavator(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private void equipmentOperation() {
        final Excavator andy = new Excavator("Andy", "ABC Group");
    }

    private boolean preparingDiggingSites() {
        final Excavator andrea = new Excavator("Andrea", "ABC Group");
        return false;
    }

    private ArrayList<String> maintenanceAndRepairs() {
        final Excavator barry = new Excavator("Barry", "ABC Group");
        return null;
    }

    private boolean debrisCleared() {
        final Excavator ryan = new Excavator("Ryan", "ABC Group");
        //IBulldozable?
        return false;
    }

    @Override
    public void cleanArea() {

    }

    @Override
    public void fixBuildingMaterial() {

    }
}
