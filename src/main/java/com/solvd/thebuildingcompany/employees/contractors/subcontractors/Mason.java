package com.solvd.thebuildingcompany.employees.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;
import com.solvd.thebuildingcompany.employees.contractors.subcontractordepartments.Masonry;

import java.util.HashMap;
import java.util.logging.Logger;

public class Mason extends Masonry implements IInstallable, IModifiable, ISpreadable {

    private final Logger logger = Logger.getLogger(Masonry.class.getName());

    public Mason(String name, String nameOfCompany) {
        super(name, nameOfCompany);
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    @Override
    protected boolean chimneyInstallation() {
        final Mason matthew = new Mason("Matthew", "NAC Group");
        return false;
    }

    @Override
    protected HashMap<String, Boolean> materialsToBreak() {
        final Mason elizabeth = new Mason("Elizabeth", "NAC Group");
        return null;
    }

    @Override
    protected boolean mortarApplications() {
        final Mason henry = new Mason("Henry", "NAC Group");
        return false;
    }

    @Override
    protected boolean groutApplications() {
        final Mason hunter = new Mason("Hunter", "NAC Group");
        return false;
    }

    @Override
    protected boolean constructMasonryWalls() {
        final Mason hasbulla = new Mason("Hasbulla", "NAC Group");
        return false;
        //New interface?
    }

    @Override
    public void addComponents() {

    }

    @Override
    public void materialAltered() {

    }

    @Override
    public void spread() {

    }
}
