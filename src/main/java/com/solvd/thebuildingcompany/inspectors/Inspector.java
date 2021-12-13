package com.solvd.thebuildingcompany.inspectors;

import java.util.Objects;

public abstract class Inspector {

    private String name;
    private int age;
    private String gender;
    private String nameOfRepresentingCity;
    private int municipalID;


    public Inspector() {

    }

    public Inspector(String name) {
        this.name = name;
    }

    public Inspector(String name, int age, String gender, String nameOfRepresentingCity, int municipalID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nameOfRepresentingCity = nameOfRepresentingCity;
        this.municipalID = municipalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameOfRepresentingCity() {
        return nameOfRepresentingCity;
    }

    public void setNameOfRepresentingCity(String nameOfRepresentingCity) {
        this.nameOfRepresentingCity = nameOfRepresentingCity;
    }

    public int getMunicipalID() {
        return municipalID;
    }

    public void setMunicipalID(int municipalID) {
        this.municipalID = municipalID;
    }



    protected abstract void generalInspection();
}
