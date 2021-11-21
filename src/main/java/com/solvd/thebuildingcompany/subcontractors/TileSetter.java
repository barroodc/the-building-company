package com.solvd.thebuildingcompany.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;
import com.solvd.thebuildingcompany.subcontractordepartments.TileSetting;

import java.util.logging.Logger;

public class TileSetter extends TileSetting implements IModifiable, ICleanable, ISpreadable {

    private final Logger logger = Logger.getLogger(TileSetter.class.getName());

    public TileSetter(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected double tilesCut() {
        final TileSetter marshall = new TileSetter("Marshall", "TSE Group");
        return 0;
    }

    @Override
    protected boolean surfaceAreaMaintenance() {
        final TileSetter michael = new TileSetter("Michael", "TSE Group");
        return false;
    }

    @Override
    protected boolean tileArrangement() {
        final TileSetter dennis = new TileSetter("Dennis", "TSE Group");
        return false;
    }

    @Override
    protected boolean groutApplied() {
        final TileSetter mark = new TileSetter("Mark", "TSE Group");
        return false;
    }

    @Override
    public void materialAltered() {

    }

    @Override
    public void cleanArea() {

    }

    @Override
    public void spread() {

    }
}
