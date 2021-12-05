package com.solvd.thebuildingcompany.contractors;

import java.util.Date;
import java.util.HashMap;

public abstract class Contractor {

    private String firstName;
    private String lastName;
    private String nameOfCompany;

    public Contractor() {

    }

    public Contractor(final String firstName, final String nameOfCompany) {
        this.firstName = firstName;
        this.nameOfCompany = nameOfCompany;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(final String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

}
