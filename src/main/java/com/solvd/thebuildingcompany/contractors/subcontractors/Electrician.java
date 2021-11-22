package com.solvd.thebuildingcompany.contractors.subcontractors;

import com.solvd.thebuildingcompany.interfaces.IInstallable;
import java.util.logging.Logger;

public class Electrician implements IInstallable {

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

    private final Logger logger = Logger.getLogger(Electrician.class.getName());

    private Electrician(String name, String nameOfCompany) {
        super();
        this.setName(name);
        this.setNameOfCompany(nameOfCompany);
    }

    private boolean installElectricalComponents() {
        final Electrician brandon = new Electrician("Brandon", "DEF Group");
        return false;
    }

    private boolean electricalComponentInspection() {
        final Electrician bruce = new Electrician("Bruce", "DEF Group");
        //monitorable interface?
        return false;
    }

    @Override
    public void addComponents() {

    }
}
