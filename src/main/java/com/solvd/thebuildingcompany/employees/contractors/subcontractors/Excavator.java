package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IFixable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.Excavating;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Excavator extends Excavating implements ICleanable, IFixable {

    private final Logger logger = Logger.getLogger(Excavator.class.getName());

    public Excavator(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected void equipmentOperation() {
        final Excavator andy = new Excavator("Andy", "ABC Group");
    }

    @Override
    protected boolean preparingDiggingSites() {
        final Excavator andrea = new Excavator("Andrea", "ABC Group");
        return false;
    }

    @Override
    protected ArrayList<String> maintenanceAndRepairs() {
        final Excavator barry = new Excavator("Barry", "ABC Group");
        return null;
    }

    @Override
    protected boolean debrisCleared() {
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
