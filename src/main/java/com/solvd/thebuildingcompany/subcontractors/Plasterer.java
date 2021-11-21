package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;
import com.solvd.thebuildingcompany.subcontractordepartments.Plaster;

import java.util.logging.Logger;

public class Plasterer extends Plaster implements ICleanable, ISpreadable {

    private final Logger logger = Logger.getLogger(Plasterer.class.getName());

    public Plasterer(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean examineSurfaces() {
        final Plasterer casandra = new Plasterer("Casandra", "BMX Group");
        return false;
    }

    @Override
    protected boolean applyPlasters() {
        final Plasterer giovani = new Plasterer("Giovani", "BMX Group");
        return false;
    }

    @Override
    public void cleanArea() {

    }

    @Override
    public void spread() {

    }
}
