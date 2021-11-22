package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import com.solvd.thebuildingcompany.interfaces.IModifiable;
import com.solvd.thebuildingcompany.interfaces.ISpreadable;

import java.util.HashMap;
import java.util.logging.Logger;

public class Mason implements IInstallable, IModifiable, ISpreadable {

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

    private final Logger logger = Logger.getLogger(Mason.class.getName());

    public Mason(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean chimneyInstallation() {
        final Mason matthew = new Mason("Matthew", "NAC Group");
        return false;
    }

    private HashMap<String, Boolean> materialsToBreak() {
        final Mason elizabeth = new Mason("Elizabeth", "NAC Group");
        return null;
    }

    private boolean mortarApplications() {
        final Mason henry = new Mason("Henry", "NAC Group");
        return false;
    }

    private boolean groutApplications() {
        final Mason hunter = new Mason("Hunter", "NAC Group");
        return false;
    }

    private boolean constructMasonryWalls() {
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
