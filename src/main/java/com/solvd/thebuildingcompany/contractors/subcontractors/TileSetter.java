package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.ICleanable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;

import java.util.logging.Logger;

public class TileSetter implements IModifiable, ICleanable, ISpreadable {

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

    private final Logger logger = Logger.getLogger(TileSetter.class.getName());

    public TileSetter(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private double tilesCut() {
        final TileSetter marshall = new TileSetter("Marshall", "TSE Group");
        return 0;
    }

    private boolean surfaceAreaMaintenance() {
        final TileSetter michael = new TileSetter("Michael", "TSE Group");
        return false;
    }

    private boolean tileArrangement() {
        final TileSetter dennis = new TileSetter("Dennis", "TSE Group");
        return false;
    }

    private boolean groutApplied() {
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
