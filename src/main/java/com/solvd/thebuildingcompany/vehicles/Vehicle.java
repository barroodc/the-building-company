package com.solvd.thebuildingcompany.vehicles;



public abstract class Vehicle {

    private String nameOfVehicle;
    private String categoryOfVehicle; //different types of bulldozers etc.
    private String manufacturer;
    private String color;
    private int yearMade;


    //need to add in abstract methods


    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public String getCategoryOfVehicle() {
        return categoryOfVehicle;
    }

    public void setCategoryOfVehicle(String categoryOfVehicle) {
        this.categoryOfVehicle = categoryOfVehicle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public Vehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }
}
